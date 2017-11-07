package com.wzsport.graphql;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.pagehelper.PageHelper;
import com.wzsport.mapper.CollegeMapper;
import com.wzsport.mapper.TeacherMapper;
import com.wzsport.mapper.UniversityMapper;
import com.wzsport.model.College;
import com.wzsport.model.CollegeExample;
import com.wzsport.model.Student;
import com.wzsport.model.StudentExample;
import com.wzsport.model.TeacherExample;
import com.wzsport.model.Term;
import com.wzsport.model.University;
import com.wzsport.model.UniversityExample;
import com.wzsport.service.TermService;
import com.wzsport.util.MyDateUtil;
import com.wzsport.util.TermDateUtil;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

/**
* GraphQL大学类型的定义及查询字段定义
* 
* @author x1ny
* @date 2017年5月25日
*/
@Component
public class UniversityType {

	private static UniversityMapper universityMapper;
	private static CollegeMapper collegeMapper;
	private static TeacherMapper teacherMapper;
	private static TermService termService;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listField;

	private UniversityType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("University")
					.description("大学类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("大学名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("colleges")
							.description("该大学中的所有学院")
							.type(new GraphQLList(CollegeType.getType()))
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								CollegeExample collegeExample = new CollegeExample();
								collegeExample.createCriteria().andUniversityIdEqualTo(university.getId());
			                	List<College> collegeList = collegeMapper.selectByExample(collegeExample);
			                	return collegeList;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("teachersCount")
							.description("该大学中的教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId());
			                	int teachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return teachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("maleTeachersCount")
							.description("该大学中的男性教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId()).andManEqualTo(true);
			                	int maleTeachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return maleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("femaleTeachersCount")
							.description("该大学中的女性教师总数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								TeacherExample teacherExample = new TeacherExample();
								teacherExample.createCriteria().andUniversityIdEqualTo(university.getId()).andManEqualTo(false);
			                	int femaleTeachersCount = (int) teacherMapper.countByExample(teacherExample);
			                	return femaleTeachersCount;
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("kcalConsumptionRanking")
							.description("该校的学生累计热量消耗量排行榜")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("monthNo").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("weekNo").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("collegeId").type(Scalars.GraphQLLong).build())
							.argument(GraphQLArgument.newArgument().name("majorId").type(Scalars.GraphQLLong).build())
							.argument(GraphQLArgument.newArgument().name("grade").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("isMan").type(Scalars.GraphQLBoolean).build())
							.type(PageType.getPageTypeBuidler(StudentKcalConsumptionType.getType())
									.name("StudentKcalConsumptionPage")
									.description("学生卡路里消耗量分页")
									.build())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								String condition = new String();
								
                                 Integer monthNo = environment.getArgument("monthNo");
                                 Integer weekNo = environment.getArgument("weekNo");

                                 String startDate = null;
                                 String endDate = null;
                                 if (weekNo != null && monthNo != null) {
                                     return null;
                                 } else {
                                     if (weekNo != null) {
                                         startDate = TermDateUtil.getWeekStartDate(university.getId(), weekNo).toString("yyyy-MM-dd");
                                         endDate = TermDateUtil.getWeekEndDate(university.getId(), weekNo).toString("yyyy-MM-dd");
                                         condition += " and sport_date >= date('" + startDate + "')";
                                         condition += " and sport_date < date('" + endDate + "')";
                                     }
                                     if (monthNo != null) {
                                         startDate = TermDateUtil.getMonthStartDate(university.getId(), monthNo).toString("yyyy-MM-dd");
                                         endDate = TermDateUtil.getMonthEndDate(university.getId(), monthNo).toString("yyyy-MM-dd");
                                         condition += " and sport_date >= date('" + startDate + "')";
                                         condition += " and sport_date < date('" + endDate + "')";
                                     }
                                 }
                                 
								Long collegeId = environment.getArgument("collegeId");
                                 Integer grade = environment.getArgument("grade");
                                 Long majorId = environment.getArgument("majorId");
                                 Boolean isMan = environment.getArgument("isMan");
								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
								
								 if (collegeId != null) {
								     condition += " and college_id = " + collegeId;
								 }
								 
								 if (grade != null) {
								     condition += " and grade = " + grade;
								 }
								 
								 if (majorId != null) {
								     condition += " and major_id = " + majorId;
								 }
								 
								 if (isMan != null) {
                                     condition += " and is_man = " + isMan;
                                 }
								
								 condition += " ";
								 
								 return universityMapper.getKcalCostedRankingByCondition(university.getId(), condition);
								
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("timeCostedRanking")
							.description("该校的学生累计锻炼时长排行榜")
							.argument(GraphQLArgument.newArgument().name("pageNumber").type(Scalars.GraphQLInt).build())
							.argument(GraphQLArgument.newArgument().name("pageSize").type(Scalars.GraphQLInt).build())
							.type(PageType.getPageTypeBuidler(StudentTimeCostedType.getType())
									.name("StudentTimeCostedPage")
									.description("学生锻炼时间累计分页")
									.build())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								PageHelper.startPage(environment.getArgument("pageNumber"), environment.getArgument("pageSize"));
			                	return universityMapper.getTimeCostedRanking(university.getId());
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("currentTerm")
							.type(TermType.getType())
							.dataFetcher(environment ->  {
								University university = environment.getSource();
								return termService.getCurrentTerm(university.getId());
							} )
							.build())
					.build();
		}
		
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	                .name("university")
	                .description("根据ID获取大学")
	                .argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	University university = universityMapper.selectByPrimaryKey(id);
	                	return university;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListField() {
		if (listField == null) {
			listField = GraphQLFieldDefinition.newFieldDefinition()
					.name("universities")
	                .description("获取大学列表")
	                .type(new GraphQLList(getType()))
					.dataFetcher(environment -> {
						UniversityExample example = new UniversityExample();
						example.createCriteria().andIdGreaterThan(0L);
						List<University> list = universityMapper.selectByExample(example);
						return list;
					}).build();
		}
		return listField;
	}

	@Autowired(required = true)
	public void setCollegeMapper(CollegeMapper collegeMapper) {
		UniversityType.collegeMapper = collegeMapper;
	}
	
	@Autowired(required = true)
	public void setTeacherMapper(TeacherMapper teacherMapper) {
		UniversityType.teacherMapper = teacherMapper;
	}
	
	@Autowired(required = true)
	public void setUniversityMapper(UniversityMapper universityMapper) {
		UniversityType.universityMapper = universityMapper;
	}
	
	@Autowired(required = true)
	public void setTermService(TermService termService) {
		UniversityType.termService = termService;
	}
}
