package com.example.demo.serviceimpl;

import com.example.demo.entity.Charges;
import com.example.demo.repository.ChargesRepository;
import com.example.demo.service.ChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChargesServiceImpl implements ChargesService {
    @Autowired
    private ChargesRepository repo;
    @Override
    public Charges createCharges(Charges charges) {

        return repo.save(charges);
    }
}
