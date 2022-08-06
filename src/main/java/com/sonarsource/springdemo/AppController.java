package com.sonarsource.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

    @Autowired
    DataUtils du;

	@GetMapping("/person/address")
    public @ResponseBody String getAddress(@RequestParam String name) {
        return du.getAddress(name);
    }

}