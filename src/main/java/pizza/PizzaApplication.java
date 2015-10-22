package pizza;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class PizzaApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(PizzaApplication.class, args);

		RepositoryRestConfiguration restConfiguration = ctx.getBean(RepositoryRestConfiguration.class);

		restConfiguration.setReturnBodyOnCreate(true);
		restConfiguration.setReturnBodyOnUpdate(true);
	}

}
