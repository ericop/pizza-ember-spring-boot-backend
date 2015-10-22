package pizza;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pizzas", path = "pizzas")
public interface PizzaRepository extends MongoRepository<Pizza, String>{
	
	//List<Pizza> findById(@Param("id") String id);
	
}