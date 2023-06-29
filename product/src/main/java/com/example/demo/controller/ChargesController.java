package com.example.demo.controller;

import com.example.demo.entity.Charges;
import com.example.demo.service.ChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/charges")
public class ChargesController {
        @Autowired
        private ChargesService service;
        @PostMapping("/create")
        public Charges createCharges(@RequestBody Charges charges){
                System.out.println(charges.getDelivery());
          return service.createCharges(charges);
        }
}
