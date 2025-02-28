package br.com.diferpan.aulasdev.projetoSpring01.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Employee {
    private String name;
    private double grossSalary;

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + name + '\'' +
                ", Salario Bruto = R$" + grossSalary +
                '}';
    }
}
