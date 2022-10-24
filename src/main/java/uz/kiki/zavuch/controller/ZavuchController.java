package uz.kiki.zavuch.controller;

import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZavuchController {

    @GetMapping("bye")
    public String bye(@RequestParam @Nullable String name) {
        return "Bye, " + name;
    }

}
