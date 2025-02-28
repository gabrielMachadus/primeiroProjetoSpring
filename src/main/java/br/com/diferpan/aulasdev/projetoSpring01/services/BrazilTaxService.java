package br.com.diferpan.aulasdev.projetoSpring01.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class BrazilTaxService extends TaxService{
    @Override
    public double tax(double amount){
        return amount * 0.3;
    }
}
