package com.firstmile.springboot.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class DataSourceUtil {
	@Autowired
	private DBConfig config;
	
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(config.getDriverClass());
		dataSourceBuilder.url(config.getUrl());
		dataSourceBuilder.username(config.getUserName());
		dataSourceBuilder.password(config.getPwd());
		return dataSourceBuilder.build();
	}

}
