package com.example.demo.service;

import com.example.demo.entity.Charges;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;


public interface ChargesService {
    Charges createCharges(Charges charges);
}
