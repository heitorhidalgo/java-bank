package com.dio.banco.app;

import java.util.Optional;
import java.util.Scanner;

import com.dio.banco.core.Banco;
import com.dio.banco.model.Cliente;
import com.dio.banco.model.Conta;
import com.dio.banco.model.ContaCorrente;
import com.dio.banco.model.ContaPoupanca;

public class BancoApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Banco banco = new Banco("Java Bank");
		
		Cliente c1 = new Cliente("Urahara","111.222.333.-44");
		Conta cc1 = new ContaCorrente("001", "1001-1", c1);
 		Conta cp1 = new ContaPoupanca("001", "1002-2", c1);
 		
 		cc1.depositar(500);
		
		banco.adicionarConta(cc1);
		banco.adicionarConta(cp1);
		
		int opcao;
		
		do {
			System.out.println("\n---Bem-vindo ao " + banco.getNome() + " ---");
			System.out.println("1 - Listar todas as contas");
			System.out.println("2 - Depositar");
			System.out.println("3 - Sacar");
			System.out.println("4 - Transferir");
			System.out.println("0 - Sair");
			System.out.println("Digite a opcao desejada: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1:
					banco.listarContas();
					break;
				case 2:
					System.out.println("Digite o numero da conta para deposito: ");
					String numContaDeposito = sc.next();
					Optional<Conta> contaDepositoOpt = banco.buscarContaPorNumero(numContaDeposito);
					
					if(contaDepositoOpt.isPresent()) {
						System.out.println("Digite o valor do deposito: ");
						double valorDeposito = sc.nextDouble();
						contaDepositoOpt.get().depositar(valorDeposito);
					}else {
						System.out.println("Conta nao encontrada.");
					}
					break;
				case 3:
					System.out.println("Digite o numero da conta para saque: ");
					String numContaSaque = sc.next();
					Optional<Conta> contaSaqueOpt = banco.buscarContaPorNumero(numContaSaque);
					
					if(contaSaqueOpt.isPresent()) {
						System.out.println("Digite o valor do saque: ");
						double valorSaque = sc.nextDouble();
						contaSaqueOpt.get().depositar(valorSaque);
					}else {
						System.out.println("Conta nao encontrada.");
					}
					break;
				case 4:
					System.out.println("Digite o numero da conta que deseja transferir: ");
					String numContaDestino = sc.next();
					
					Optional<Conta> contaDestinoOpt = banco.buscarContaPorNumero(numContaDestino);
					
					if(contaDestinoOpt.isPresent()) {
						System.out.println("Digite o valor da transferencia: ");
						double valorTransferencia = sc.nextDouble();
						contaDestinoOpt.get().transferir(valorTransferencia);
					}else {
						System.out.println("Conta nao encontrada.");
					}
					break;
				case 0:
					System.out.println("Obrigado por utilizar nosso banco!");
					break;
				default:
						System.out.println("Opcao invalida. Tente novamente.");
						break;
			}
		} while(opcao != 0);
		
		sc.close();
	}

}