/**
 * Spring Controller – Controller and RequestMapping.
 */
package com.harrison.helloworld.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.harrison.helloworld.services.HelloWorldService;

/**
 * @author Harrison
 *
 */
@Controller
public class HelloWorldController {

	private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	private final HelloWorldService helloWorldService;

	@Autowired
	public HelloWorldController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		logger.debug("index() is executed!");
		
		return "index";
	}

	@RequestMapping(value = "/showMessage", method = RequestMethod.GET)
	public ModelAndView hello() {

		logger.debug("showMessage() is executed");

		ModelAndView model = new ModelAndView("showMessage", "message", helloWorldService.getGreeting());
		//model.setViewName("showMessage");

		//model.addObject("message", helloWorldService.getGreeting());

		return model;
	}

}
