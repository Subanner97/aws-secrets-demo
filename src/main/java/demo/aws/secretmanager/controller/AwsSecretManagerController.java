package demo.aws.secretmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.aws.secretmanager.configuration.AwsSecretManagerConfiguration;

@RestController
@RequestMapping("/")
public class AwsSecretManagerController {
	
	@Autowired
	private AwsSecretManagerConfiguration configuration;
	
	@GetMapping(path = "secretManager")
	public String keysSecretManager() {
		return String.format("apikey1 value: %s apikey2 value:%s", configuration.getUser(), configuration.getPassword());
	}
	
}
