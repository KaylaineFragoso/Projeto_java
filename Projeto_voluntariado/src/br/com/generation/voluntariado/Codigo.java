package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3;

        System.out.println("Você gostaria de encontrar uma instituição para se voluntariar? \n1: Sim \n2: Não ");
        teste=entrada.nextInt();

        if(teste==1) {
            System.out.println("Escolha uma região do estado de São Paulo:"
                    + " \n[1] Capital\n[2] Litoral\n[3] Interior\n[4] ABC");


            teste2=entrada.nextInt();
            if(teste2==1) {
                System.out.println("Escolha uma região da capital de São Paulo: "
                        + "\n[1] Norte \n[2] Sul \n[3] Leste \n[4] Oeste");
                teste3=entrada.nextInt();
                if(teste3==1) {
                    System.out.println("essas são as instituições do Norte");
                }
                else if(teste3==2) {
                    System.out.println("essas são as instituições do sul");
                }
                else if(teste3==3) {
                    System.out.println("essas são as instituições do leste");
                }
                else if(teste3==1) {
                    System.out.println("essas são as instituições do oeste");
                }
                else {
                    System.out.println("Você digitou um numero invalido");
                }
            }


            else if(teste2==2) {
                System.out.println("essas são a opção do Litoral");
            }
            else if(teste2==3) {
                System.out.println("essas são a opção do Interior");
            }
            else if(teste2==4) {
                System.out.println("essas são a opção do ABC");
            }
            else {
                System.out.println("Você digitou um numero invalido");
            }
        }
        else {
            System.out.println("Você digitou um numero invalido");
        }
        entrada.close();

	}

}
