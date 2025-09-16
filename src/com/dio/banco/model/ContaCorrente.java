package com.dio.banco.model;

public class ContaCorrente extends Conta {

	public ContaCorrente(String agencia, String numero, Cliente cliente) {
		super(agencia, numero, cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("---Extrato da Conta Corrente---");
		super.imprimirInfos();
	}
}