package bowling.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class GameApiController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }
}
