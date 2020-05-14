package com.davidfmatheson.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleController {

	@ResponseBody
	@RequestMapping(value = "/something", method = RequestMethod.GET)
	public String doSomething() {
		return "something";
	}
}
