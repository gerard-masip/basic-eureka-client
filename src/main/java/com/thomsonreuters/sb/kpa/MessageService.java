package com.thomsonreuters.sb.kpa;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
@EnableEurekaClient
public class MessageService {



    public static void main(String[] args) throws Exception {
        SpringApplication.run(MessageService.class, args);
    }

    @RequestMapping(value = "/{message}", method = RequestMethod.GET)
    @ResponseBody
    String returnMessage(@PathVariable String message) {
        return message + "from 1";
    }

}
