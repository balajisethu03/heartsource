package com.zetcode.controller;

import com.zetcode.bean.Heart;
import com.zetcode.service.ICountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private ICountryService countryService;

    @RequestMapping("/heart")
    public List<Heart> listCountries() {
        
        return countryService.findAll();
    }
}