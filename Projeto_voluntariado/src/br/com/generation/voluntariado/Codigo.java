package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		
		System.out.println("=====================================================");
		System.out.println("|\t \t   VOLUNTARIE-SE                    |");
		System.out.println("|\t     Juntos somos mais fortes               |");
		System.out.println("=====================================================");
		
		
		Scanner entrada = new Scanner(System.in);
        int voluntariar, voluntariarReg, voluntariarSp;
        
        Norte a5 = new Norte();
        Teste_sul a1 = new Teste_sul();
        Leste a2 = new Leste();
        Oeste a7 = new Oeste();
        Litoral a3 = new Litoral();
        Interior a6 = new Interior();
        Abc a4 = new Abc();
        
        
        System.out.println("\nVocê gostaria de encontrar uma instituição para se voluntariar? \n1: Sim \n2: Não ");
        voluntariar=entrada.nextInt();
        
        if(voluntariar==1) {
             System.out.println("Escolha uma região do estado de São Paulo:"
                    + " \n[1] Capital\n[2] Litoral\n[3] Interior\n[4] ABC");
            
        voluntariarReg=entrada.nextInt();
        if(voluntariarReg==1) {   
        	 System.out.println("Escolha uma região da capital de São Paulo: "
                        + "\n[1] Zona Norte \n[2] Zona Sul \n[3] Zona Leste \n[4] Zona Oeste");
        	    
        voluntariarSp=entrada.nextInt();
        if(voluntariarSp==1) {
                
             a5.norte();
                	
        }
        else if(voluntariarSp==2) {
                
        a1.sul();
           
        }
        else if(voluntariarSp==3) {
                	
        a2.leste();
                    
        }
        else if(voluntariarSp==4) {
                	
             a7.oeste();
        }
        else {
             System.out.println("Você digitou um numero invalido");
        }
  }

        else if(voluntariarReg==2) {
            	  
            a3.litoral();
        }
        else if(voluntariarReg==3) {
            	
            a6.interior();
              
        }
        else if(voluntariarReg==4) {
                
            a4.abc();
                
        }
        else {
            System.out.println("Você digitou um numero invalido");
        }
  }
        else if(voluntariar==2) {
        	System.out.println("Muito obrigado por visitar nosso projeto!");
        }
        else {
            System.out.println("Você digitou um numero invalido");
        }
        
        entrada.close();

	}

}
