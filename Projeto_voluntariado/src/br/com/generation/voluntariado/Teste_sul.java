package br.com.generation.voluntariado;

import java.util.Scanner;

public class Teste_sul {

	void sul() {
		
		Scanner entrada =new Scanner(System.in);
		int  regSul;
		System.out.println("Escolha uma das institui��es para saber mais: \n[1] Associa��o Beneficente Parsifal\n[2] GRAACC - Grupo de Apoio a Adolescentes e � Crian�a com C�ncer\n[3] Funda��o Bunge\n[4] Assoc.Desportiva para Deficientes");
		regSul=entrada.nextInt();
		
    	if(regSul==1) {
    		System.out.println("Raz�o Social: Assoc.Beneficente Parsifal\r\n"
    				+ "Descri��o: A Parsifal, institui��o de Pedagogia Curativa e Terapia Social, foi fundada em 1991\n"
    				+ "e tem como objetivo promover o desenvolvimento pessoal e o conv�vio social de crian�as, jovens\n"
    				+ "e adultos com defici�ncias e dist�rbios ps�quicos. \r\n"
    				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
    				+ "R.Rob�lia 59\r\n"
    				+ "Jardim Prud�ncia\r\n"
    				+ "CEP 04648-240\r\n"
    				+ "(11) 5547 0201\r\n"
    				+ "aparsifal@terra.com.br\r\n"
    				+ "https://parsifal.org.br\r\n"
    				);
    	}
    	else if(regSul==2) {
    		System.out.println("Raz�o Social: GRAACC - Grupo de Apoio a Adolescentes e � Crian�a com C�ncer\r\n"                		
    				+ "Descri��o: Garantir a crian�as e adolescentes com c�ncer, dentro do mais avan�ado padr�o cient�fico,\n"
    				+ "o direito de alcan�ar todas as chances de cura com qualidade de vida. \r\n"
    				+ "�rea de Atua��o: Assist�ncia a crian�as"
    				+ "R.Botucatu 743\r\n"
    				+ "Vila Clementino\r\n"
    				+ "CEP 04023-062 \r\n"
    				+ "(11) 5080 8400\r\n"
    				+ "graacc@graacc.org.br\r\n"
    				+ "www.graacc.org.br\r\n");
    	}
    	else if(regSul==3) {
    		System.out.println("Raz�o Social: Funda��o Bunge\r\n"
    				+ "Descri��o: Contribuir para o desenvolvimento sustent�vel por meio de a��es que valorizem o avan�o da ci�ncia,\n"
    				+ "a educa��o e a conserva��o dos recursos naturais.\r\n"
    				+ "�rea de Atua��o: Educa��o e pesquisa\r\n"
    				+ "Av.Maria Coelho Aguiar 215 Bloco D - 5� andar\r\n"
    				+ "Jardim S�o Luiz\r\n"
    				+ "CEP 05804-900\r\n"
    				+ "(11) 3741 6832\r\n"
    				+ "fundacao@bunge.com.br\r\n"
    				+ "www.fundacaobunge.org.br\r\n");
    	}
    	else if(regSul==4) {
    		System.out.println("Raz�o Social: ADD- Assoc.Desportiva para Deficientes\r\n"
    				+ "Descri��o: Miss�o Incentivar e promover o desenvolvimento e a inclus�o de pessoas com defici�ncia por meio\n"
    				+ "do esporte e do apoio educacional em �mbito nacional. Princ�pios e Valores A ADD valoriza os talentos\n"
    				+ "e capacidades das pessoas, apoiando-se em princ�pios �ticos e morais. \r\n"
    				+ "�rea de Atua��o: Assist�ncia a pessoas com defici�ncia\r\n"
    				+ "Rua das Pitombeiras, 296\r\n"
    				+ "Vila Parque Jabaquara\r\n"
    				+ "CEP 04321-160\r\n"
    				+ "(11) 50116133\r\n"
    				+ "contato@add.org.br\r\n"
    				+ "www.add.org.br\r\n"
    				+ "addassociacao\r\n"
    				+ "@addaddociacao\r\n");
    	}
    	else {
    		System.out.println("Voc� digitou um n�mero inv�lido");
    	}
    	entrada.close();
    	}

	}

