package com.gql.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import graphql.schema.GraphQLSchema;

@Configuration
public class AppConfig {
	
	private static final String[] SCHEMA_FILES = {
		"schema.graphqls"
	};
    
	/*
	 * @Bean public GraphQLSchema schema() { return
	 * SchemaParser.newParser().files(SCHEMA_FILES) }
	 */

    
}