package com.example.demo;

import java.text.SimpleDateFormat;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Configuration
public class ApplicationConfiguration {

	@Bean
	public HttpMessageConverters httpMessageConverters() {
		// 将日期按"yyyy-MM-dd HH:mm"格式输出
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder().indentOutput(true)
				.dateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm"));
		return new HttpMessageConverters(new MappingJackson2HttpMessageConverter(builder.build()));

	}
}
