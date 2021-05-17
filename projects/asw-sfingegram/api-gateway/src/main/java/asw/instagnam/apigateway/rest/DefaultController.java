package asw.instagnam.apigateway.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*; 

@RestController
public class DefaultController {

	@GetMapping("/")
	public Collection<String> index() {
		return Arrays.asList(
			"http://localhost:8080/enigmi/swagger-ui/", 
			"http://localhost:8080/connessioni/swagger-ui/", 
			"http://localhost:8080/enigmi-seguiti/swagger-ui/", 
			"http://localhost:8080/actuator" 
		); 
	}
	
}
