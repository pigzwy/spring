package com.pig.test;

import com.pig.config.AppConfig;
import com.pig.dao.IndexDao1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: pig
 * @Date: 2019/12/27$
 */
public class test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		applicationContext.getBean(IndexDao1.class).query();
	}
}
