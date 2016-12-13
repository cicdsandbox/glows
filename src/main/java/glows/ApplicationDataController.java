package glows;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories
public class ApplicationDataController {
  @Autowired
  private ApplicationDataRepository repository;

  @CrossOrigin()
  @RequestMapping(path="/application-data/{id}", method=RequestMethod.GET)
  public ApplicationData getApplicationData(@PathVariable String id) {
    Long long_id = Long.parseLong(id);
    ApplicationData application = repository.findOne(long_id);
    System.out.println("Ryan (GET) the application is " + application);
    return application;
  }
  
  @CrossOrigin()
  @RequestMapping(path="/application-data/{id}", method=RequestMethod.PUT)
  public @ResponseBody ApplicationData updateApplicationData(
      @PathVariable String id, @RequestBody ApplicationData applicationData) {
    System.out.println("Ryan (PUT) the application is " + applicationData);
    repository.save(applicationData);
    return applicationData;
  }
}
