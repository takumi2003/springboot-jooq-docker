package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/*
	 * main関数である。SpringApplication.run()は、DemoApplicationクラスを起動する。
	 * Demo
	 */

	public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
	}

}
