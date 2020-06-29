package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BadmintonCoach {

	@Value("${foo.name}")
	private String name;
	@Value("${foo.email}")
	private String email;
	
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
