/**
 * A service to generate a message
 */
package com.harrison.helloworld.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Harrison
 *
 */

@Service
public class HelloWorldService {

	private static final Logger logger = LoggerFactory.getLogger(HelloWorldService.class);

	public String getGreeting() {

		logger.debug("getGreeting() is executed");
		return "Maven + Spring MVC Hello World Example";

	}

}
