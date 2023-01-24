package aopdemo;

import java.time.Duration;
import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // --> Whatever aspects you are creating - those needs to be annotated with
		// @Aspect annotation
@Component
public class LoggingAspect {

	private LocalTime startTime;

	@Before("execution (* aopdemo.ShoppingCart.checkout())")
//	@Before("execution (* aopdemo.ShoppingCart.checkout(..))") // --> For any parameters
	public void beforeLoggers(JoinPoint joinPoint) {
		this.startTime = LocalTime.now();
		 System.out.println("Before Method");
		// System.out.println(joinPoint.getSignature());
		// String arg = joinPoint.getArgs()[0].toString();
		// System.out.println("Before Method with argument: " + arg);
	}

	@After("execution (* aopdemo.ShoppingCart.checkout())")
//	@After("execution (* *.*.checkout())") // --> 1. * Any return type 2. * Any package 3. * any class - if there is a checkout method
//	@After("execution (* *.*.checkout(..))") // --> For any parameters --> execution says for which particular method
												// you want to execute
	public void afterLoggers(JoinPoint joinPoint) {

		System.out.println("After Method");

		Duration timeEllapsed = Duration.between(startTime, LocalTime.now());
		Signature signature = joinPoint.getSignature();

		String methodName = signature.getName() + "()";
		String className = signature.getDeclaringTypeName();
		className = className.substring(className.lastIndexOf(".") + 1);

		System.out.println(String.format("		%s - %s - %d ms", className, methodName, timeEllapsed.toMillis()));
	}

/*	@Pointcut("execution (* aopdemo.ShoppingCart.quantity(..))")
	public void afterReturningPointCut() {

	}

	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "retValue")
	public void afterReturning(JoinPoint joinPoint, Object retValue) {
		System.out.println("After Returning" + joinPoint.getSignature());
		System.out.println("After Returning: " + retValue);
	} */

}
