package com.dio.banco.model;

public abstract class Conta implements IConta {

	protected String agencia;
	protected String numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(String agencia, String numero, Cliente cliente) {
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = 0.0;
	}
	
	@Override
	public void sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			System.out.println(String.format("Saque de R$%.2f realizado.", valor));
		}else {
			System.out.println("Saldo insuficiente para saque.");
		}
	}
	
	@Override
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println(String.format("Deposito de R$%.2f realizado.", valor));
		}else {
			System.out.println("Valor de deposito invalido.");
		}
	}
	
	public void transferir(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println(String.format("Transferencia de R$%.2f realizada.", valor));
		}else {
			System.out.println("Saldo insuficiente para transferencia.");
		}
	}

	public String getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: R$%.2f", this.saldo));
	}
}
