package com.sil.azure.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/sample/1")
    public String sample1(){
        return "Sample 1";
    }

    @GetMapping("/sample/2")
    public String sample2(){
        return "Sample 2";
    }

    @GetMapping("/sample/3")
    public String sample3(){
        return "Sample 3";
    }


}
