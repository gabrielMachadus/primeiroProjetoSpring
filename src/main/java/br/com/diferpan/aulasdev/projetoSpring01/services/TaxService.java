package br.com.diferpan.aulasdev.projetoSpring01.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class TaxService {
    public double tax(double amount){
        return amount * 0.2;
    }
}
