package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello, HUDSON BAY V2!!";
    }

    @RequestMapping("/version")
    public String getVersion() {
        return "2.0";
    }

}
