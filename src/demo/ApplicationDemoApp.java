package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDemoApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		BadmintonCoach theBadmintonCoach = context.getBean("badmintonCoach", BadmintonCoach.class);
		
		System.out.println(theBadmintonCoach.getName());
		System.out.println(theBadmintonCoach.getEmail());
		
		context.close();
	}
}
