package com.dio.banco.model;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String agencia, String numero, Cliente cliente) {
		super(agencia, numero, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---Extrato da Conta Poupanca---");
		super.imprimirInfos();
	}

}
