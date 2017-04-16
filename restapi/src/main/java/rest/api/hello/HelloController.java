package rest.api.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by deepak on 16/4/17.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHi()
    {
        return "Hello Rest!";
    }
}
