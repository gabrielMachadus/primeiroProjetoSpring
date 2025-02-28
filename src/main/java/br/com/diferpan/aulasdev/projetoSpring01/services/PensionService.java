package br.com.diferpan.aulasdev.projetoSpring01.services;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@Service
public class PensionService {
    public double discount(double amount){
        return amount * 0.10;
    }
}
