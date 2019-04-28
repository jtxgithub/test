package com.xwtec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动程序
 * 
 * @author jtx
 *
 */
@SpringBootApplication
public class AppSpringbootMain {
	public static void main(String[] args) {
		SpringApplication.run(AppSpringbootMain.class, args);
		//可以手动自定义log
		System.out.println("启动成功===========================");
		
	}
}
