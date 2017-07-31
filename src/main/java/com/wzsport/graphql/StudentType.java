package com.wzsport.graphql;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.wzsport.mapper.AreaActivityMapper;
import com.wzsport.mapper.FitnessCheckDataMapper;
import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.mapper.SportScoreMapper;
import com.wzsport.mapper.StudentMapper;
import com.wzsport.model.AreaActivity;
import com.wzsport.model.AreaActivityExample;
import com.wzsport.model.FitnessCheckData;
import com.wzsport.model.FitnessCheckDataExample;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.model.SportScore;
import com.wzsport.model.SportScoreExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.model.StudentExample.Criteria;
import com.wzsport.model.Term;
import com.wzsport.service.RunningActivityService;
import com.wzsport.service.TermService;
import com.wzsport.util.MyDateUtil;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLEnumType;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL瀛︾敓绫诲瀷鐨勫畾涔夊強鏌ヨ瀛楁瀹氫箟
* 
* @author x1ny
* @date 2017骞�5鏈�25鏃�
*/
@Component
public class StudentType {
	
	private static TermService termService;
	private static RunningActivityService runningActivityService;
	private static StudentMapper studentMapper;
	private static FitnessCheckDataMapper fitnessCheckDataMapper;
	private static RunningActivityMapper runningActivityMapper;
	
	private static AreaActivityMapper areaActivityMapper;
	private static SportScoreMapper sportScoreMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	private static GraphQLFieldDefinition listQueryByConditionsField;

	public static enum TimeRange {
		CURRENT_WEEK, CURRENT_MONTH, CURRENT_TERM
	};
	private static GraphQLEnumType timeRangeEnumType = GraphQLEnumType.newEnum()
														    .name("TimeRange")
														    .value(TimeRange.CURRENT_WEEK.toString())
														    .value(TimeRange.CURRENT_MONTH.toString())
														    .value(TimeRange.CURRENT_TERM.toString())
														    .build();
	
	private StudentType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("Student")
					.description("学生类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("学生名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("studentNo")
							.description("学号")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("isMan")
							.description("性别")
							.type(Scalars.GraphQLBoolean)
							.dataFetcher(environment ->  {
								Student student = environment.getSource();
			                	return student.getMan();
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.description("所属大学的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("classId")
							.description("所属班级的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("userId")
							.description("关联的user的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("fitnessCheckDatas")
							.description("该学生的所有体测数据")
							.type(new GraphQLList(FitnessCheckDataType.getType()))
							.dataFetcher(environment -> {
								Student student = environment.getSource();
								FitnessCheckDataExample fitnessCheckDataExample = new FitnessCheckDataExample();
								fitnessCheckDataExample.createCriteria().andStudentIdEqualTo(student.getId());
			                	List<FitnessCheckData> fitnessCheckDataScoreList = fitnessCheckDataMapper.selectByExample(fitnessCheckDataExample);
			                	return fitnessCheckDataScoreList;
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("fitnessCheckData")
							.description("该学生指定学期的体测数据")
							.argument(GraphQLArgument.newArgument().name("termId").type(Scalars.GraphQLLong).build())
							.type(FitnessCheckDataType.getType())
							.dataFetcher(environment -> {
								Long termId = environment.getArgument("termId");
								Student student = environment.getSource();
								FitnessCheckDataExample fitnessCheckDataExample = new FitnessCheckDataExample();
								fitnessCheckDataExample.createCriteria().andStudentIdEqualTo(student.getId())
																		.andTermIdEqualTo(termId);
			                	List<FitnessCheckData> fitnessCheckDataList = fitnessCheckDataMapper.selectByExample(fitnessCheckDataExample);
			                	if(fitnessCheckDataList.size() != 0) {
			                		return fitnessCheckDataList.get(0);
			                	}
			                	return null;
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("sportScores")
							.description("该学生的所有体育成绩")
							.type(new GraphQLList(SportScoreType.getType()))
							.dataFetcher(environment -> {
								Student student = environment.getSource();
								SportScoreExample sportScoreExample = new SportScoreExample();
			                	sportScoreExample.createCriteria().andStudentIdEqualTo(student.getId());
			                	List<SportScore> sportScoreList = sportScoreMapper.selectByExample(sportScoreExample);
			                	return sportScoreList;
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("sportScore")
							.description("该学生的指定学期的体育成绩")
							.argument(GraphQLArgument.newArgument().name("termId").type(Scalars.GraphQLLong).build())
							.type(SportScoreType.getType())
							.dataFetcher(environment -> {
								Student student = environment.getSource();
								Long termId = environment.getArgument("termId");
								SportScoreExample sportScoreExample = new SportScoreExample();
			                	sportScoreExample.createCriteria().andStudentIdEqualTo(student.getId())
			                									.andTermIdEqualTo(termId);
			                	List<SportScore> sportScoreList = sportScoreMapper.selectByExample(sportScoreExample);
			                	if(sportScoreList.size() != 0) {
			                		return sportScoreList.get(0);
			                	}
			                	return null;
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("runningActivities")
							.description("所有活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(RunningActivityType.getType())
																.name("RunningActivitiesPage")
																.description("跑步活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	RunningActivityExample runningActivityExample = new RunningActivityExample();
			                	runningActivityExample.createCriteria().andStudentIdEqualTo(student.getId());
			                	runningActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	return runningActivityMapper.selectByExample(runningActivityExample);
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("areaActivities")
							.description("所有活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(AreaActivityType.getType())
																.name("AreaActivitiesPage")
																.description("区域运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	AreaActivityExample areaActivityExample = new AreaActivityExample();
			                	areaActivityExample.createCriteria().andStudentIdEqualTo(student.getId());
			                	areaActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	return areaActivityMapper.selectByExample(areaActivityExample);
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentWeekRunningActivities")
							.description("本周跑步运动活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(RunningActivityType.getType())
																.name("RunningActivitiesPage")
																.description("跑步运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	RunningActivityExample runningActivityExample = new RunningActivityExample();
			                	runningActivityExample.createCriteria()
			                						.andStudentIdEqualTo(student.getId())
			                						.andStartTimeBetween(MyDateUtil.getCurrentWeekStartDate(), new Date());
			                	runningActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	Page<RunningActivity> runningActivityList = (Page<RunningActivity>) runningActivityMapper.selectByExample(runningActivityExample);
			                	return runningActivityList;
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentWeekAreaActivities")
							.description("本周区域运动活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(AreaActivityType.getType())
																.name("AreaActivitiesPage")
																.description("区域运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	AreaActivityExample areaActivityExample = new AreaActivityExample();
			                	areaActivityExample.createCriteria()
			                						.andStudentIdEqualTo(student.getId())
			                						.andStartTimeBetween(MyDateUtil.getCurrentWeekStartDate(), new Date());
			                	areaActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	Page<AreaActivity> areaActivityList = (Page<AreaActivity>) areaActivityMapper.selectByExample(areaActivityExample);
			                	return areaActivityList;
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentMonthRunningActivities")
							.description("本月活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(RunningActivityType.getType())
																.name("RunningActivitiesPage")
																.description("跑步运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	RunningActivityExample runningActivityExample = new RunningActivityExample();
			                	runningActivityExample.createCriteria()
			                						.andStudentIdEqualTo(student.getId())
			                						.andStartTimeBetween(MyDateUtil.getCurrentMonthStartDate(), new Date());
			                	runningActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	Page<RunningActivity> runningActivityList = (Page<RunningActivity>) runningActivityMapper.selectByExample(runningActivityExample);
			                	return runningActivityList;
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentMonthAreaActivities")
							.description("本月活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(AreaActivityType.getType())
																.name("AreaActivitiesPage")
																.description("区域运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	AreaActivityExample areaActivityExample = new AreaActivityExample();
			                	areaActivityExample.createCriteria()
			                						.andStudentIdEqualTo(student.getId())
			                						.andStartTimeBetween(MyDateUtil.getCurrentMonthStartDate(), new Date());
			                	areaActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	Page<AreaActivity> areaActivityList = (Page<AreaActivity>) areaActivityMapper.selectByExample(areaActivityExample);
			                	return areaActivityList;
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTermRunningActivities")
							.description("本学期跑步运动活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(RunningActivityType.getType())
																.name("RunningActivitiesPage")
																.description("跑步运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	Term currentTerm = termService.getCurrentTerm(student.getUniversityId());     	
			                	Date startDate = null;
			                	Date endDate = null;
			                	if(currentTerm != null) {
			                		startDate = currentTerm.getStartDate();
			                		endDate = currentTerm.getEndDate();
			                	} else {
			                		startDate = MyDateUtil.getCurrentYearStartDate();
			                		endDate = new Date();
			                	}
			                	
			                	RunningActivityExample runningActivityExample = new RunningActivityExample();
			                	runningActivityExample.createCriteria()
			                						.andStudentIdEqualTo(student.getId())
			                						.andStartTimeBetween(startDate, endDate);
			                	
			                	runningActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	Page<RunningActivity> areaActivityList = (Page<RunningActivity>) runningActivityMapper.selectByExample(runningActivityExample);
			                	return areaActivityList;
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTermAreaActivities")
							.description("本学期区域运动活动记录")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(AreaActivityType.getType())
																.name("AreaActivitiesPage")
																.description("区域运动活动记录分页")
																.build())
							.dataFetcher(environment -> {
			                	Student student = environment.getSource();
			                	Term currentTerm = termService.getCurrentTerm(student.getUniversityId());     	
			                	Date startDate = null;
			                	Date endDate = null;
			                	if(currentTerm != null) {
			                		startDate = currentTerm.getStartDate();
			                		endDate = currentTerm.getEndDate();
			                	} else {
			                		startDate = MyDateUtil.getCurrentYearStartDate();
			                		endDate = new Date();
			                	}
			                	
			                	AreaActivityExample areaActivityExample = new AreaActivityExample();
			                	areaActivityExample.createCriteria()
			                						.andStudentIdEqualTo(student.getId())
			                						.andStartTimeBetween(startDate, endDate);
			                	
			                	areaActivityExample.setOrderByClause("start_time DESC");
			                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	Page<AreaActivity> areaActivityList = (Page<AreaActivity>) areaActivityMapper.selectByExample(areaActivityExample);
			                	return areaActivityList;
			                } ).build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("caloriesConsumption")
							.argument(GraphQLArgument.newArgument().name("timeRange").type(timeRangeEnumType).build())
							.description("该学生的累计卡路里消耗")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								Student student = environment.getSource();
								String timeRange = environment.getArgument("timeRange");
								
								if(timeRange != null) {
									Date start = null;
									Date end = new Date();
									switch(TimeRange.valueOf(timeRange)) {
									case CURRENT_WEEK:
										start = MyDateUtil.getCurrentWeekStartDate();
										break;
									case CURRENT_MONTH:
										start = MyDateUtil.getCurrentMonthStartDate();
										break;
									case CURRENT_TERM:
										Term currentTerm = termService.getCurrentTerm(student.getUniversityId());
										if (currentTerm == null) {
											return 0;
										} else {
											start = currentTerm.getStartDate();
										}
										break;
									default:
										return runningActivityService.getStudentKCalConsumption(student.getId());
									}
									return runningActivityService.getStudentCaloriesConsumption(student.getId(),
											start, end);
								}
			                	return runningActivityService.getStudentKCalConsumption(student.getId());
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("timeCosted")
							.argument(GraphQLArgument.newArgument().name("timeRange").type(timeRangeEnumType).build())
							.description("该学生的累计运动时长(单位:秒)")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								Student student = environment.getSource();
								String timeRange = environment.getArgument("timeRange");
								
								if(timeRange != null) {
									Date start = null;
									Date end = new Date();
									switch(TimeRange.valueOf(timeRange)) {
									case CURRENT_WEEK:
										start = MyDateUtil.getCurrentWeekStartDate();
										break;
									case CURRENT_MONTH:
										start = MyDateUtil.getCurrentMonthStartDate();
										break;
									case CURRENT_TERM:
										Term currentTerm = termService.getCurrentTerm(student.getUniversityId());
										if (currentTerm == null) {
											return 0;
										} else {
											start = currentTerm.getStartDate();
										}
										break;
									default:
										return runningActivityService.getStudentTimeCosted(student.getId());
									}
									return runningActivityService.getStudentTimeCosted(student.getId(),
											start, end);
								}
			                	return runningActivityService.getStudentTimeCosted(student.getId());
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTermActivityCount")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								Student student = environment.getSource();
			                	return runningActivityService.getCurrentTermActivityCount(student.getId(), student.getUniversityId());
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTermQualifiedActivityCount")
							.description("该学生的当前学期的合格活动次数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								Student student = environment.getSource();
			                	return runningActivityService.getCurrentTermQualifiedActivityCount(student.getId(), student.getUniversityId());
			                } )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualifiedActivityCount")
							.argument(GraphQLArgument.newArgument().name("timeRange").type(timeRangeEnumType).build())
							.description("该学生的合格活动次数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								Student student = environment.getSource();
								String timeRange = environment.getArgument("timeRange");
								
								if(timeRange != null) {
									Date start = null;
									Date end = new Date();
									switch(TimeRange.valueOf(timeRange)) {
									case CURRENT_WEEK:
										start = MyDateUtil.getCurrentWeekStartDate();
										break;
									case CURRENT_MONTH:
										start = MyDateUtil.getCurrentMonthStartDate();
										break;
									case CURRENT_TERM:
										Term currentTerm = termService.getCurrentTerm(student.getUniversityId());
										if (currentTerm == null) {
											return 0;
										} else {
											start = currentTerm.getStartDate();
										}
										break;
									default:
										return runningActivityService.getQualifiedActivityCount(student.getId(), null, null);
									}
									return runningActivityService.getQualifiedActivityCount(student.getId(),
											start, end);
								}
			                	return runningActivityService.getQualifiedActivityCount(student.getId(), null, null);
			                } )
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	        		.argument(GraphQLArgument.newArgument().name("userId").type(Scalars.GraphQLLong).build())
	                .name("student")
	                .description("根据ID或者user的ID来获取学生")
	                .type(getType())
	                .dataFetcher(environment -> {
	                	Student student = null;
	                	Long id = environment.getArgument("id");
	                	if(id != null){
		                	student = studentMapper.selectByPrimaryKey(id);
	                	} else if (environment.containsArgument("userId")) {
	                		long userId = environment.getArgument("userId");
	                		StudentExample studentExample = new StudentExample();
	                		studentExample.createCriteria().andUserIdEqualTo(userId);
		                	student = studentMapper.selectByExample(studentExample).get(0);
	                	}
	                	
	                	return student;
	                } )
	                .build();
		}
		
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLLong).build())
	                .name("students")
	                .description("根据班级的ID获取该班级的所有学生")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment -> {
	                	long classId = environment.getArgument("classId");
	                	StudentExample studentExample = new StudentExample();
                		studentExample.createCriteria().andClassIdEqualTo(classId);
	                	List<Student> studentList = studentMapper.selectByExample(studentExample);
	                	return studentList;
	                } ).build();
		}
        return listQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryByConditionsField() {
		if(listQueryByConditionsField == null) {
			listQueryByConditionsField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("classId").type(Scalars.GraphQLLong).build())
	        		.argument(GraphQLArgument.newArgument().name("name").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("studentNo").type(Scalars.GraphQLString).build())
	        		.argument(GraphQLArgument.newArgument().name("isMan").type(Scalars.GraphQLBoolean).build())
	        		.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
					.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
					.type(PageType.getPageTypeBuidler(getType())
														.name("StudentPage")
														.description("学生类型分页")
														.build())
	                .name("searchStudents")
	                .description("搜索学生")
	                .dataFetcher(environment -> {
	                	Long classId = environment.getArgument("classId");
	                	String name = environment.getArgument("name");
	                	String studentNo = environment.getArgument("studentNo");
	                	Boolean isMan = environment.getArgument("isMan");
	                	
	                	StudentExample studentExample = new StudentExample();
	                	Criteria studentExamplesCriteria = studentExample.createCriteria();
	                	if(classId != null) {
	                		studentExamplesCriteria.andClassIdEqualTo(classId);
	                	}
	                	if(name != null) {
	                		studentExamplesCriteria.andNameLike("%" + name +"%");
	                	}
	                	if(studentNo != null) {
	                		studentExamplesCriteria.andStudentNoLike("%" + studentNo +"%");
	                	}
	                	if(isMan != null) {
	                		studentExamplesCriteria.andManEqualTo(isMan);
	                	}
	                	
	                	PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
	                	List<Student> studentList = studentMapper.selectByExample(studentExample);
	                			
	                	return studentList;
	                } ).build();
		}
		
        return listQueryByConditionsField;
    }

	@Autowired(required = true)
	public void setStudentMapper(StudentMapper studentMapper) {
		StudentType.studentMapper = studentMapper;
	}
	
	@Autowired(required = true)
	public void setRunningActivityMapper(RunningActivityMapper runningActivityMapper) {
		StudentType.runningActivityMapper = runningActivityMapper;
	}
	
	@Autowired(required = true)
	public void setAreaActivityMapper(AreaActivityMapper areaActivityMapper) {
		StudentType.areaActivityMapper = areaActivityMapper;
	}
	
	@Autowired(required = true)
	public void setTermService(TermService termService) {
		StudentType.termService = termService;
	}
	
	@Autowired(required = true)
	public void setSportScoreMapper(SportScoreMapper sportScoreMapper) {
		StudentType.sportScoreMapper = sportScoreMapper;
	}
	
	@Autowired(required = true)
	public void setFitnessCheckDataMapper(FitnessCheckDataMapper fitnessCheckDataMapper) {
		StudentType.fitnessCheckDataMapper = fitnessCheckDataMapper;
	}
	
	@Autowired(required = true)
	public void setRunningActivityService(RunningActivityService runningActivityService) {
		StudentType.runningActivityService = runningActivityService;
	}
}
