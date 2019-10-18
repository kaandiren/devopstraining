package com.thy.devopstraining.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.thy.devopstraining.model.Config;

@Service
public class ConfigService {

	@Value("${config.status}")
	private String statusValue;
	
	@Value("${config.ip}")
	private String ipValue;
	
	@Value("${config.author}")
	private String authorValue;
	
	public ArrayList<Config> getConfigData() {
		Config c = new Config("Status", statusValue);
		Config c1 = new Config("IP", ipValue);
		Config c2 = new Config("Author", authorValue);
		
		ArrayList<Config> arr = new ArrayList<Config>();
		arr.add(c);
		arr.add(c1);
		arr.add(c2);
		
		return arr;
		
	}
}
