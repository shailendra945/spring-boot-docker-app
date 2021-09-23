package com.infoiv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeCotroller {

	@GetMapping("/{name}")
	public String getWelcomeMessage(@PathVariable String name) {
		return getFromattedMessage(name);
	}

	private String getFromattedMessage(String name) {
		return "<div id='blinkDiv' style='color:red;font-weight:bold;'>"
				+ " Hi, "+name+" welcome to the app !!!</div>"
				+ "<script>"
				+ "var blink_speed = 1000;"
				+ "var t = setInterval(function () {"
				+ "    var ele = document.getElementById('blinkDiv');"
				+ "    ele.style.visibility = (ele.style.visibility == 'hidden' ? '' : 'hidden');"
				+ "}, blink_speed);"
				+ "</script>";
	}
	
}
