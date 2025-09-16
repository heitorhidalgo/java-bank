# 🏦 Java Bank - Desafio de Projeto DIO

## 📝 Descrição do Projeto

Este projeto é uma simulação de um sistema bancário básico, desenvolvido como solução para o Desafio de Programação Orientada a Objetos (POO) da [Digital Innovation One](https://www.dio.me/). O objetivo foi aplicar e consolidar os quatro pilares da POO — **Abstração, Encapsulamento, Herança e Polimorfismo** — para construir uma aplicação Java funcional e bem estruturada.

O sistema permite a criação de contas, a realização de operações financeiras essenciais como saques, depósitos e transferências, e a consulta de extratos, tudo através de um menu interativo no console.

## ✨ Funcionalidades

A aplicação oferece as seguintes operações:

-   **Criação de Contas:** Permite a criação de dois tipos de contas:
    -   Conta Corrente
    -   Conta Poupança
-   **Operações Bancárias:**
    -   **Depositar:** Adicionar valor ao saldo de uma conta específica.
    -   **Sacar:** Retirar valor do saldo de uma conta, com validação de saldo suficiente.
    -   **Transferir:** Mover valores entre duas contas existentes no banco.
-   **Consulta:**
    -   **Imprimir Extrato:** Exibe as informações detalhadas de uma conta, incluindo titular, agência, número e saldo atual.
    -   **Listar Contas:** Mostra um resumo de todas as contas cadastradas no banco.

## 🏛️ Estrutura e Design (POO)

O projeto foi modelado utilizando os conceitos fundamentais da Programação Orientada a Objetos:

-   **Abstração:** Uma classe `Conta` abstrata foi criada para definir o comportamento e os atributos comuns a todos os tipos de conta, enquanto uma interface `IConta` define o "contrato" das operações essenciais.
-   **Herança:** As classes `ContaCorrente` e `ContaPoupanca` herdam da classe `Conta`, reutilizando toda a lógica de saque, depósito e transferência.
-   **Polimorfismo:** O método `imprimirExtrato()` é implementado de forma específica em cada tipo de conta, permitindo que o sistema chame o método correto para cada objeto, mesmo quando estão em uma lista genérica de `Conta`.
-   **Encapsulamento:** Os atributos das classes são protegidos (usando `private` ou `protected`), e o acesso é feito através de métodos públicos (Getters), garantindo a integridade dos dados.

## 💻 Tecnologias Utilizadas

-   **Linguagem:** Java 21
-   **IDE:** Eclipse

## 🚀 Como Executar o Projeto

Para executar este projeto em seu ambiente local, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/heitorhidalgo/java-bank.git](https://github.com/heitorhidalgo/java-bank.git)
    ```
2.  **Abra o projeto em sua IDE:**
    -   Abra o Eclipse, STS ou a IDE de sua preferência.
    -   Importe o projeto (geralmente através da opção `File > Import > Existing Maven Project`).

3.  **Execute a aplicação:**
    -   A classe principal que inicia o programa é a `BancoApp.java`, localizada no pacote `com.dio.banco.app`.
    -   Clique com o botão direito no arquivo `BancoApp.java`.
    -   Selecione `Run As > Java Application`.
    -   O menu interativo do banco aparecerá no console da sua IDE, pronto para uso.

## 👨‍💻 Autor

**Heitor Hidalgo**

-   **GitHub:** [heitorhidalgo](https://github.com/heitorhidalgo)
-   **LinkedIn:** [Heitor Hidalgo](https://www.linkedin.com/in/heitorhidalgo)
