package com.dio.banco.core;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dio.banco.model.Conta;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	public void adicionarConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public Optional<Conta> buscarContaPorNumero(String numero){
		return this.contas.stream().filter(conta -> conta.getNumero().equals(numero)).findFirst();
	}
	
	public void listarContas() {
		System.out.println("---Lista de Contas do " + this.nome + "---");
		if(this.contas.isEmpty()) {
			System.out.println("Nenhuma conta cadastrada.");
		}else {
			for(Conta conta : this.contas) {
				conta.imprimirExtrato();
				System.out.println("-----------------------");
			}
		}
	}

	public String getNome() {
		return nome;
	}
}
