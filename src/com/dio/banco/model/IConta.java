package com.dio.banco.model;

public interface IConta {

	void sacar(double valor);
	void depositar(double valor);
	void transferir(double valor);
	void imprimirExtrato();
}
