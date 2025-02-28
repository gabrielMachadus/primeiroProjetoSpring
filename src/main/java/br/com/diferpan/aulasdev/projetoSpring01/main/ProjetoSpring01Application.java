package br.com.diferpan.aulasdev.projetoSpring01.main;

import br.com.diferpan.aulasdev.projetoSpring01.entities.Employee;
import br.com.diferpan.aulasdev.projetoSpring01.services.PensionService;
import br.com.diferpan.aulasdev.projetoSpring01.services.SalaryService;
import br.com.diferpan.aulasdev.projetoSpring01.services.TaxService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"br.com.diferpan.aulasdev.projetoSpring01"})
public class ProjetoSpring01Application implements CommandLineRunner {

	SalaryService salaryService ;

	public ProjetoSpring01Application(SalaryService salaryService) {
		this.salaryService = salaryService;
	}

	public static void main(String[] args) {

		SpringApplication.run(ProjetoSpring01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String name = "";
		double grossSalary = 0;
		System.out.println("------Programa inicialiSzado------");
		System.out.println("Name:");
		name = sc.nextLine();

		System.out.println("Gross Salary:");
		grossSalary = sc.nextDouble();

		Employee employee = new Employee(name,grossSalary);
		System.out.println(employee.toString());

		TaxService taxService = new TaxService();
		PensionService pensionService = new PensionService();
		salaryService = new SalaryService(taxService, pensionService);
		System.out.println("------Salário liquido:"+salaryService.netSalary(employee)+"------");

		System.out.println("------Programa Finalizado------");
	}
}
