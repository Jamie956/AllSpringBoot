package com.example.demo.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/music")
public class MusicRest {

    @GetMapping
    public String guest() {
        return "Listen";
    }
}
