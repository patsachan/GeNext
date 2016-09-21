package proj.proj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspact {
	
	@Before("execution(public String getData())")
	public void loggingAdvice(){
		System.out.println("logging Advice");
	}

}
