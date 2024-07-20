package application;

import java.util.Locale;
import java.util.Scanner;
import entities.TaxPayer;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// git@github.com:MichaelRealTec/desafioContribuintesOOeLista.git
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double salaryIncome;
		double servicesIncome;
		double capitalIncome;
		double healthSpending;
		double educationSpending;
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		n = sc.nextInt();
	
		System.out.println();
		
		
		List<TaxPayer> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Digite os dados do %do contribuinte:\n",(i+1));
			System.out.print("Renda anual com salário: ");
			salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			healthSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			educationSpending = sc.nextDouble();
			
			TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending);		
			list.add(taxPayer);
			System.out.println();
		}
		int i = 1;
		for(TaxPayer taxPayer : list) {			
			System.out.printf("Resumo do %do contribuinte: \n", i);
			i = i + 1;
			System.out.println(taxPayer);
		}
		
		
		sc.close();
	}

}
