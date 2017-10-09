package com.hibernate.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wanli zhou
 * @created 2017-10-09 11:00 PM.
 */
@Controller
@RequestMapping(path = "/address/", consumes = "application/json", produces = "application/json")
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }


    @GetMapping("province/id/{id}")
    public ResponseEntity getProvinceById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(addressService.getProvinceById(id));
    }
    @GetMapping("province/{name}")
    public ResponseEntity getProvinceByName(@PathVariable("name") String name){
        return ResponseEntity.ok(addressService.getProvinceByName(name));
    }

    @GetMapping("city/{name}")
    public ResponseEntity getCityByName(@PathVariable("name") String name){
        return ResponseEntity.ok(addressService.getCityByName(name));
    }

    @GetMapping("county/{name}")
    public ResponseEntity getCountyByName(@PathVariable("name") String name){
        return ResponseEntity.ok(addressService.getCountyByName(name));
    }
}
