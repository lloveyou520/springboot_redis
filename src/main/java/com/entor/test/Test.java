package com.entor.test;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Test {
	
	public static void main(String[] args) {
		
	}
	/*
	@SpringBootApplication
	@MapperScan
	@EnableAutoConfiguration
	@EnableAsync
	@EnableCaching
	@EnableScheduling
	
	@Controller
	@RestController
	@ControllerAdvice
	@Component
	@Service
	@Mapper
	@Repository
	@Configuration
	@ConfigurationProperties
	@PropertySource
	@CacheConfig
	@Table
	@MultipartConfig
	
	@RequestMapping
	@Bean
	@ResponseBody
	@InitBinder
	@ExceptionHandler
	@Async
	@Scheduled
	@Transactional
	@Cacheable
	@CacheEvict
	@Insert
	@InsertProvider
	@Select
	@SelectProvider
	@Update
	@UpdateProvider
	@Delete
	@DeleteProvider
	
	
	@Autowired
	@Resource
	@Value
	@JsonFormat
	@Aspect
	@Before
	@After
	@TableId
	@Column
	@Param
	@RequestParam
	@PathVariable
	*/
}	
