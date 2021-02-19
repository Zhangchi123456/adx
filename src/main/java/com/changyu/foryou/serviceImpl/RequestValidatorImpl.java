package com.changyu.foryou.serviceImpl;


import com.changyu.foryou.service.RequestValidator;
import org.springframework.stereotype.Service;

@Service
public class RequestValidatorImpl implements RequestValidator {

    @Override
    public boolean validator(String info) {
        return false;
    }
}
