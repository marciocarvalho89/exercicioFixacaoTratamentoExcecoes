package entities;

import exceptions.MyException;

public class Conta {

	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteDeSaque;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteDeSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteDeSaque = limiteDeSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteDeSaque() {
		return limiteDeSaque;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}
	
	public void saque(double quantia) {
		if (saldo >= quantia && quantia <= limiteDeSaque) {
		saldo -= quantia;
	    }
		else if(saldo < quantia) {
			throw new MyException("Saldo insuficiente!");
		}
		else {
			throw new MyException("A quantia é maior do que o limite de saque!");
		}
    
	}	
}
