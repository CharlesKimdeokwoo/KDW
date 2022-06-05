package com.example.KDW_project;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @RequestMapping(value = "/aws", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest(){
        return "{\"OpenCmd\":\"CloseCmd\"}";
    }

}
