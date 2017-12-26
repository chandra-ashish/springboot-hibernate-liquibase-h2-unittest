package com.hibernate.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanli zhou
 * @created 2017-12-06 10:32 AM.
 */
@Controller
@RequestMapping(path = "/multipleThread/", consumes = "application/json", produces = "application/json")
public class TestMultipleThreadController {

    @GetMapping()
    public ResponseEntity multipleThread(){


        return ResponseEntity.ok("");
    }

}
