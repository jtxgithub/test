package com.xwtec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/get")
	@ResponseBody
	public String get() {
		return "hel111";
	}
	@RequestMapping("/get1")
	@ResponseBody
	public String get1() {
		return "get1";
	}
}
