package demo.aws.secretmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.aws.secretmanager.configuration.AwsSecretManagerConfiguration;

@RestController
@RequestMapping("/")
public class AwsSecretManagerController {
	
	@Autowired
	private AwsSecretManagerConfiguration configuration;
	
	@Value("${api-key1}")
	private String api1;
	
	@Value("${value1}")
	private String value1;
	
	@GetMapping(path = "secretManager")
	public String keysSecretManager() {
		return String.format("This is a value from aws secret manager: %s and this is from cloud config: %s ", api1, value1);
	}
	
}
