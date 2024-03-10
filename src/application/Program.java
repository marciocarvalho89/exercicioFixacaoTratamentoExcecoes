package application;

import java.util.Scanner;

import entities.Conta;
import exceptions.MyException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		try {
		System.out.println("Entrar com os dados da conta: ");
		System.out.print("Número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome do titular: ");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		Double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		Double limiteDeSaque = sc.nextDouble();
		
		Conta conta = new Conta(numero,titular,saldo,limiteDeSaque);
		
		System.out.println("");
		System.out.print("Entrar com a quantia para saque: ");
		Double quantia = sc.nextDouble();
		conta.saque(quantia);
		
		System.out.println("Novo saldo: " + String.format("%.2f",conta.getSaldo()));
		}
		
		catch(MyException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		





		
		
		sc.close();
		
	}

}
