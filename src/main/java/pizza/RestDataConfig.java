package pizza;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class RestDataConfig extends RepositoryRestMvcConfiguration{
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
    {
    	// https://jira.spring.io/browse/DATAREST-501
        super.configureRepositoryRestConfiguration(config);
        config.exposeIdsFor(Pizza.class);
    }
}