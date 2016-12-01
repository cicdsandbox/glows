package glows;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    private static final List<String> names = Arrays.asList(
        "Abraham Lincoln", "George Washington", "Bob Marley");
    private static Random generator = new Random();

    @CrossOrigin()
    @RequestMapping("/name")
    public Name name(@RequestParam(value="index", defaultValue="-1") String index_str) {
        int index = -1;
        try {
            index = Integer.parseInt(index_str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input index");
        }
        
        int num_names = names.size();
        
        if (index < 0 || index >= num_names) {
            index = generator.nextInt(num_names);
        }
        String[] split_names = names.get(index).split("\\s");
        return new Name(split_names[0], split_names[1]);
    }
}
