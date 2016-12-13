package glows;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
  
	@Bean
	public CommandLineRunner demo(ApplicationDataRepository repository) {
		return (args) -> {
			// save an application
			ApplicationData application = new ApplicationData();
			application.setId(11L);
			application.setFirst_name("Abraham");
			application.setLast_name("Lincoln");
			application.setEmail_address("abe@usa.gov");
			application.setDate_of_birth("02/12/1809");
			application.setCity_of_birth("Hodgenville");
			application.setCountry_of_birth("USA");
			application.setState_province_of_birth("Kentucky");
			
			repository.save(application);

			// fetch all applications
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (ApplicationData lookup_application : repository.findAll()) {
				log.info(lookup_application.toString());
			}
			log.info("");

			// fetch an individual customer by ID
			ApplicationData lookup_application = repository.findOne(11L);
			log.info("Application found with findOne(1L):");
			log.info("--------------------------------");
			log.info(lookup_application.toString());
			log.info("");
		};
	}
}
