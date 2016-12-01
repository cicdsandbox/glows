package scheduling;

import java.util.Random;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScheduleController {

    private static Random generator = new Random();

    @CrossOrigin()
    @RequestMapping("/days")
    public Schedule schedule() {
        return new Schedule(generator.nextInt(100));
    }
}
