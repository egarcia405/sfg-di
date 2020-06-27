package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		//run returns an application context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		//System.out.println("hello world");

		//Can request the context to give an instance of the controller you also need to cast since getBean returns an Object. Name has to be class name with lowercase
		//At startup Spring will go and scan for beans and create them into the context

		MyController myController = (MyController)ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);


	}

}
