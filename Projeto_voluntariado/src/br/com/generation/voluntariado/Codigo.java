package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3;
        
        Teste_sul a1 = new Teste_sul();
        Leste a2 = new Leste();
        Litoral a3 = new Litoral();
        Abc a4 = new Abc();
        Norte a5 = new Norte();
        Interior a6 = new Interior();
        Oeste a7 = new Oeste();
        
        System.out.println("Você gostaria de encontrar uma instituição para se voluntariar? \n1: Sim \n2: Não ");
        teste=entrada.nextInt();
        
        if(teste==1) {
            System.out.println("Escolha uma região do estado de São Paulo:"
                    + " \n[1] Capital\n[2] Litoral\n[3] Interior\n[4] ABC");
            
            teste2=entrada.nextInt();
            if(teste2==1) {
            	
            	System.out.println("Escolha uma região da capital de São Paulo: "
                        + "\n[1] Zona Norte \n[2] Zona Sul \n[3] Zona Leste \n[4] Zona Oeste");
                teste3=entrada.nextInt();
                if(teste3==1) {
                
                	a5.norte();
                	
                }
                else if(teste3==2) {
                
                a1.sul();
           
                }
                else if(teste3==3) {
                	
                    a2.leste();
                    
                }
                else if(teste3==4) {
                	
                	a7.oeste();
                }
                else {
                    System.out.println("Você digitou um numero invalido");
                }
            }


            else if(teste2==2) {
            	  
            	a3.litoral();
            }
            else if(teste2==3) {
            	
               a6.interior();
              
            }
            else if(teste2==4) {
                
                a4.abc();
                
            }
            else {
                System.out.println("Você digitou um numero invalido");
            }
        }
        else if(teste==2) {
        	System.out.println("Muito obrigado por visitar nosso projeto");
        }
        else {
            System.out.println("Você digitou um numero invalido");
        }
        
        entrada.close();

	}

}
