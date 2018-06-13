/*
 * Copyright 2012-2016 the original author or authors.
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

package wqssyq.demos;

import java.io.InputStream;
import java.net.URL;
import java.net.URLStreamHandler;
import javax.annotation.PostConstruct;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import wqssyq.net.URL;

@SpringBootApplication
public class UrlApplication {

	private static final Logger log = LoggerFactory
			.getLogger(UrlApplication.class);

	@PostConstruct
	public void logSomething() {
//		URLStreamHandler handler = URL.getMyURLStreamHandler("file");
//    log.info("handler : {}", handler);
//
//		handler = URL.getMyURLStreamHandler("jar");
//    log.info("handler : {}", handler);
//		logger.debug("Sample Debug Message");
//		logger.trace("Sample Trace Message");

		try {
			URL url = UrlApplication.class.getClassLoader().getResource("config/url.properties");
			log.info("url : {}", url);

//			url = new URL("jar:file:/H:/wqssyq/javademos/001/test-url/target"
//          + "/test-url-0.1.1.SNAPSHOT.jar!/BOOT-INF/classes!/config/url.properties");
//      url = new URL("jar:file:/H:/wqssyq/javademos/001/test-url/target"
//          + "/test-url-0.1.1.SNAPSHOT.jar!/BOOT-INF/classes/config/url.properties");
      InputStream is = url.openStream();
//      FileUtils.readFileToString(url.getPath(),"utf-8");
      String str = IOUtils.toString(is, "utf-8");
      log.info("str : {}", str);
//      int data = is.read();
//      log.info("data : {}", data);

		} catch (Exception e) {
		    log.error("err", e);
		}
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(UrlApplication.class, args).close();
	}

}
