package com.firstmile.springboot.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class DBConfig {
	@Value("${driverClass}")
	private String driverClass;
	@Value("${url}")
	private String url;
	@Value("${userName}")
	private String userName;
	@Value("${pwd}")
	private String pwd;

}
