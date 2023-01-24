package aopdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopLearningMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class); // from this context we will get beans
		
		ShoppingCart cart = context.getBean(ShoppingCart.class);
		
		cart.checkout();
	//	cart.quantity();
	//	cart.checkout("*****Cancelled*****");
		
	}

}


// Note - after adding parameters, make sure to aspect matches the input parameters
