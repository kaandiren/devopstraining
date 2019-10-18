package com.thy.devopstraining.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thy.devopstraining.model.Config;
import com.thy.devopstraining.service.ConfigService;

@RestController
public class RootController {
	
	@Autowired
	public ConfigService configService;

	@GetMapping("/conf")
	public ArrayList<Config> getConfig() {
		ArrayList<Config> arr = configService.getConfigData();
		return arr;
	}
}
