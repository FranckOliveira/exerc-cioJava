package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.next();
		
		System.out.print("Is there na initial deposit (y/n)?");
		char initial = sc.next().charAt(0);
		
		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depositoInicial  = sc.nextDouble();
			conta = new Conta(number, holder, depositoInicial );
		} else {
			conta = new Conta(number, holder);
		}
		
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double novoDeposito  = sc.nextDouble();
		conta.deposit(novoDeposito);
		System.out.printf("Updated account data: " );
		System.out.println(conta);
		
		System.out.print("Enter a withdraw value: ");
		double saque  = sc.nextDouble();
		conta.withdraw(saque);
		System.out.printf("Updated account data: ");
		System.out.println(conta);
		
		
		sc.close();

	}

}
