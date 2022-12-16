package lv.tsi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "My name is %s!";

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(
                    value = "name",
                    defaultValue = "Spring") String name) {
        return new Greeting(String.format(template, name));
    }
}
