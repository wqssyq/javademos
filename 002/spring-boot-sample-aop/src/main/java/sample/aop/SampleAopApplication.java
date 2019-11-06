/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sample.aop;

import com.zch.sample.controller.HelloWorld02Service;
import com.zch.sample.controller.WebNewsController;
import sample.aop.service.HelloWorld03Service;
import sample.aop.service.HelloWorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = {"sample","com.zch.sample"})
public class SampleAopApplication implements CommandLineRunner {

	// Simple example shows how an application can spy on itself with AOP

	@Autowired
	private HelloWorldService helloWorldService;

	@Autowired
	private HelloWorld03Service helloWorld03Service;

	@Autowired
	private HelloWorld02Service helloWorld02Service;

	@Autowired
	private WebNewsController webNewsController;

	public void doHello(){
		System.out.println(this.helloWorldService.getHelloMessage());
	}

	public void runNews(){
		webNewsController.runNews();
	}

	public void doHello3(){
		System.out.println(this.helloWorld03Service.getHelloMessage());
		System.out.println(this.helloWorld03Service.getHelloMessage("fuzhou"));
	}

	@Override
	public void run(String... args) {
//		doHello();
//		runNews();
		doHello3();
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleAopApplication.class, args);
	}

}
