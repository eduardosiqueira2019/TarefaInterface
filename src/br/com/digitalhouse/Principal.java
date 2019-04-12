package br.com.digitalhouse;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int opcaoMenu;

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();


        System.out.println("Escolha uma opção:");
        System.out.println("");
        System.out.println("1   -   Soma");
        System.out.println("2   -   Subtração");
        System.out.println("3   -   Multiplicação");
        System.out.println("4   -   Divisão");
        System.out.println("5   -   Sair");
        System.out.print("-> ");

        Scanner opcaoDesejada = new Scanner(System.in);
        opcaoMenu = opcaoDesejada.nextInt();

        if(opcaoMenu > 5){
            System.out.println("Opção incorreta. Opração Cancelada.");
            System.exit(0);
        } else if(opcaoMenu == 5){
            System.exit(0);
        }

        System.out.println("Digite o primeiro número:");
        Scanner sc = new Scanner(System.in);
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();


        if (opcaoMenu == 1) {
            System.out.println("Resultado: " + soma.calcula(numero1, numero2));
        } else if (opcaoMenu == 2) {
            System.out.println("Resultado: " + subtracao.calcula(numero1, numero2));
        } else if (opcaoMenu == 3) {
            System.out.println("Resultado: " + multiplicacao.calcula(numero1, numero2));
        } else if (opcaoMenu == 4) {
            System.out.println("Resultado: " + divisao.calcula(numero1,numero2));
        }


    }
}
