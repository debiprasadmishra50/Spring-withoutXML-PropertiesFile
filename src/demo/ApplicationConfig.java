package demo;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
@ComponentScan("demo")
public class ApplicationConfig {

	//Either define the bean explicitely or use @ComponentScan
//	@Bean
//	public BadmintonCoach badmintonCoach() {
//		return new BadmintonCoach();
//	}
}
