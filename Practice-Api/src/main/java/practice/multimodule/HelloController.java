package practice.multimodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "hello world2";
    }

    @GetMapping("/student")
    public String home2() {
        return "hello student";
    }
}