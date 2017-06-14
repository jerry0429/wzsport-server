package com.wzsport.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wzsport.service.GraphQLService;

import graphql.ExecutionResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
* GraphQL查询 控制器.
* 
* @author x1ny
* @date 2017年5月15日
*/
@Api(tags = "GraphQL查询接口")
@RestController
@RequestMapping(value="/graphql",produces="application/json;charset=UTF-8")
public class GraphQLController {

	@Autowired
	private GraphQLService graphQLService;
	
	
	/**
	* GraphQL查询接口 json格式提交
	* 
	* @param queryString GraphQL查询字符串
	* @return
	* @throws
	*/
	@ApiOperation(value = "GraphQL查询入口", notes = "具体使用请参考本项目提供的GraphQL调试器，此处不再介绍")
	@RequestMapping(method = RequestMethod.POST)
	@CrossOrigin
	public ResponseEntity<?>  query(@RequestBody Map<String,Object> queryMap) {
		String query = (String)queryMap.get("query");
		ExecutionResult result = null;
		if(queryMap.containsKey("variables")) {
			@SuppressWarnings("unchecked")
			Map<String,Object> variables = (Map<String, Object>) queryMap.get("variables");
			result = graphQLService.query(query, variables);
		} else {
			result = graphQLService.query(query);
		}
		return ResponseEntity.ok().body(result);
	}
	
	/**
	* GraphQL查询接口 键值对方式提交
	* 
	* @param queryString GraphQL查询字符串
	* @return
	* @throws
	*/
	@ApiOperation(value = "GraphQL查询入口", notes = "具体使用请参考本项目提供的GraphQL调试器，此处不再介绍")
	@RequestMapping(value="/query", method = RequestMethod.POST)
	public ResponseEntity<?> query(@RequestParam String query) {
		ExecutionResult result = graphQLService.query(query);
		return ResponseEntity.ok().body(result);
	}

	public GraphQLService getGraphQLService() {
		return graphQLService;
	}

	public void setGraphQLService(GraphQLService graphQLService) {
		this.graphQLService = graphQLService;
	}
}
