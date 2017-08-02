package com.wzsport.graphql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wzsport.mapper.AreaSportMapper;
import com.wzsport.model.AreaSport;
import com.wzsport.model.AreaSportExample;
import com.wzsport.service.AreaActivityService;
import com.wzsport.service.RunningActivityService;

import graphql.Scalars;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLList;
import graphql.schema.GraphQLObjectType;

@Component
public class AreaSportType {

	private static AreaSportMapper areaSportMapper;
	private static GraphQLObjectType type;
	private static GraphQLFieldDefinition singleQueryField;
	private static GraphQLFieldDefinition listQueryField;
	
	@Autowired
	private static AreaActivityService areaActivityService;
	
	private AreaSportType() {}
	
	public static GraphQLObjectType getType() {
		if(type == null) {
			type = GraphQLObjectType.newObject()
					.name("areaSport")
					.description("区域运动项目类型")
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("id")
							.description("唯一主键")
							.type(Scalars.GraphQLLong)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("name")
							.description("区域运动项目名称")
							.type(Scalars.GraphQLString)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("is_enable")
							.description("该项目是否启用")
							.type(Scalars.GraphQLBoolean)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("qualifiedCostTime")
							.description("该项目的合格耗时(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("acquisitionInterval")
							.description("采集运动数据的时间间隔(单位:秒)")
							.type(Scalars.GraphQLInt)
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("participantNum")
							.description("参加人数")
							.type(Scalars.GraphQLInt)
							.dataFetcher(environment -> {
								AreaSport runningSport = environment.getSource();
								return areaActivityService.getParticipantNum(runningSport.getId());
							} )
							.build())
					.field(GraphQLFieldDefinition.newFieldDefinition()
							.name("universityId")
							.description("所属大学的ID")
							.type(Scalars.GraphQLLong)
							.build())
					.build();
		}
		return type;
	}
	
	public static GraphQLFieldDefinition getSingleQueryField() {
		if(singleQueryField == null) {
			singleQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("id").type(Scalars.GraphQLLong).build())
	                .name("areaSport")
	                .description("根据ID获取区域运动项目")
	                .type(getType())
	                .dataFetcher(environment ->  {
	                	long id = environment.getArgument("id");
	                	AreaSport runningSport = areaSportMapper.selectByPrimaryKey(id);
	                	return runningSport;
	                } ).build();
		}
        return singleQueryField;
    }
	
	public static GraphQLFieldDefinition getListQueryField() {
		if(listQueryField == null) {
			listQueryField = GraphQLFieldDefinition.newFieldDefinition()
	        		.argument(GraphQLArgument.newArgument().name("universityId").type(Scalars.GraphQLLong).build())
	                .name("areaSports")
	                .description("根据大学ID获取关联的所有区域运动项目")
	                .type(new GraphQLList(getType()))
	                .dataFetcher(environment ->  {
	                	long universityId = environment.getArgument("universityId");
	                	AreaSportExample areaSportExample = new AreaSportExample();
	                	areaSportExample.createCriteria().andUniversityIdEqualTo(universityId);
	                	List<AreaSport> runningSportList = areaSportMapper.selectByExample(areaSportExample);
	                	return runningSportList;
	                } ).build();
		}
        return listQueryField;
    }

	@Autowired(required = true)
	public void setRunningSportMapper(AreaSportMapper areaSportMapper) {
		AreaSportType.areaSportMapper = areaSportMapper;
	}
}