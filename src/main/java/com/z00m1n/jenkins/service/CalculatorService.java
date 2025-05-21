package com.z00m1n.jenkins.service;

import com.z00m1n.jenkins.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plusTwoNumbers(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }
}
