package demo.aws.secretmanager.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
public class AwsSecretManagerConfiguration {

	@Getter @Setter
	@Value("${api-key1}")
	private String user;
	
	@Getter @Setter
	@Value("${api-key2}")
	private String password;	

}
