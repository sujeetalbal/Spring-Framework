package aopdemo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {
	
	@Pointcut("within(aopdemo..*)") // ----> this will define for which particular class you want to execute for all the methods
	public void authenticationPointCut() {
		
	}
	
	@Pointcut("within(aopdemo..*)")  
	public void authorizationPointCut() {
		
	}
	
//	@Before("authenticationPointCut() && authorizationPointCut()")
	public void authenticate() {
		System.out.println("Authenticating the Request - BEFORE");
	}
	
//	@After("execution (* aopdemo.ShoppingCart.checkout())")
	public void authenticateSuccessful() {
		System.out.println("Authenticating the Request - AFTER");
	}

}
