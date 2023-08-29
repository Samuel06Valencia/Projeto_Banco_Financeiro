package application;


import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------");
        System.out.println("Bem-Vindo ao Banco Financeiro!");
        System.out.println("------------------------------");
        System.out.println("Deseja criar uma conta conosco? (s/n)");
        char resp = sc.next().charAt(0);
        double dep = 0.0;

        while(resp == 's') {
            System.out.println("--------------------------------------");
            System.out.println("Parabéns, excelente escolha!");
            System.out.println("--------------------------------------");
            System.out.println("Digite seu Nome: ");
            sc.next();
            String name = sc.nextLine();
            System.out.println("Digite seu CPF: ");
            long cpf = sc.nextLong();
            System.out.println("Digite sua numeração escolhida para 'número de conta': ");
            int numConta = sc.nextInt();
            System.out.println("Digite sua numeração de 'número de agência': ");
            int numAgencia = sc.nextInt();

            Conta cont = new Conta(name, numConta, numAgencia, cpf);
            System.out.println(cont.toString());


            System.out.println("Deseja realizar seu primeiro depósito?  (s/n)");
            resp = sc.next().charAt(0);

            while(resp == 's') {
                System.out.println("-------------------------------------");
                System.out.println("Digite o valor de depósito desejado: ");
                System.out.println("-------------------------------------");
                dep = sc.nextDouble();

                Conta cont1 = new Conta(name, numConta, numAgencia, cpf, dep);
                System.out.println(cont1.toString());
                System.out.println("Mensagem: Depósito realizado com Sucesso!");
                break;
            }
            while (resp == 'n') {
                System.out.println("---------------------");
                System.out.println("Programa Encerrado!!!");
                System.out.println("---------------------");

            }

            System.out.println("-------------------------");
            System.out.println("Menu-Opções");
            System.out.println("Opção 1- Depósito");
            System.out.println("Opção 2- Saque");
            System.out.println("-------------------------");
            int resp1 = sc.nextInt();
            double deposit = 0.0;
            double saque = 0.0;
            switch (resp1) {
                case 1:
                    System.out.println("Digite quanto deseja realizar de Depósito: ");
                    deposit = sc.nextDouble();

                    Conta count = new Conta(name, numConta, numAgencia, cpf, dep);
                    count.adicionaSaldo(deposit);
                    System.out.println(count.toString());
                    break;
                case 2:
                    System.out.println("Digite quanto deseja realizar de Saque: ");
                    saque = sc.nextDouble();

                    Conta count2 = new Conta(name, numConta, numAgencia, cpf, dep);
                    count2.adicionaSaque(saque);
                    System.out.println(count2.totalSaque());
                    break;
                default:
                    System.out.println("Opção Inválida!!");
            }

            System.out.println("Programa Encerrado!!");

            break;
        }


    }
}