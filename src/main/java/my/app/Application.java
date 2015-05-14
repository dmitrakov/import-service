package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		// ApplicationContext ctx = new ClassPathXmlApplicationContext(
		// new String[] { "spring/application-config.xml" });

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(AppConfig.class);
		ctx.refresh();
		
		Controller controller = ctx.getBean(Controller.class);
		controller.doImport();
	}

}
