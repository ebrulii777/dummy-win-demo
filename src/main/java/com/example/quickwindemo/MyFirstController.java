package com.example.quickwindemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyFirstController {

    @Autowired
    private MyFirstService myFirstService;

    @GetMapping                                                             // required false heisst muss nicht unbedingt gesetzt sein
    public HelloDatenTransferObject helloDatenTransferObject(@RequestParam(required = false) String user){

        return myFirstService.helloDatenTransferObject(user);
    }


}
