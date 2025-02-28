package br.com.diferpan.aulasdev.projetoSpring01.services;

import br.com.diferpan.aulasdev.projetoSpring01.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Service
public class SalaryService {

    private TaxService taxService;

    private  PensionService pensionService;

    public double netSalary (Employee employee){
        return employee.getGrossSalary()
                - taxService.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());
    }
}
