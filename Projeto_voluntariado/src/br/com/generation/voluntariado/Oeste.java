package br.com.generation.voluntariado;

import java.util.Scanner;

public class Oeste {

	void oeste() {
		
		Scanner entrada =new Scanner(System.in);
		int  RegOeste;
		System.out.println("Escolha uma das institui��es para saber mais: \n[1] Instituto Sorrir Para Vida\n[2]  Associa��o crian�a Brasil\n[3] Liga das Senhoras Cat�licas de S�o Paulo\r\n[4] Instituto Fazendo Hist�ria");
		RegOeste=entrada.nextInt();
		
    	if(RegOeste==1) {
    		System.out.println("Raz�o Social: Instituto Sorrir Para Vida\r\n"
    				+ "Descri��o: Organiza��o social sem fins lucrativos, criada para garantir o tratamento odontol�gico\n"
    				+ "de pessoas com c�ncer e com defici�ncia em situa��o de vulnerabilidade social. \r\n"
    				+ "�rea de Atua��o: Tratamento odontol�gico de pessoas com cancer \r\n"
    				+ "rua Ferreira de Araujo, 957\r\n"
    				+ "Pinheiros\r\n"
    				+ "CEP 05428-002\r\n"
    				+ "(11) 2977-4626\r\n"
    				+ "contato@sorrirparavida.org.br\r\n");
        }
    	else if(RegOeste==2) {
    		System.out.println("Raz�o Social: Associa��o crian�a Brasil\r\n"            		
    				+ "Descri��o:Associa��o Crian�a Brasil � uma organiza��o social sem fins econ�micos com Certificado\n"
    				+ "de Entidade Beneficente de Assist�ncia Social (CEBAS), inscrita no Conselho Municipal de Assist�ncia Social\n"
    				+ "(COMAS) e no Conselho Municipal dos Direitos da Crian�a e do Adolescente (CMDCA).\r\n"
    				+ "�rea de Atua��o: Assist�ncia a crian�as"
    				+ "Rua Jacund�, 112\r\n"
    				+ "Jardim Panorama\r\n"
    				+ "CEP 05679-060\r\n"
    				+ "(11) 3773-4992\r\n"
    				+ "crianca@criancabrasil.org.br\r\n");
    	}
    	else if(RegOeste==3) {
    		System.out.println(" Raz�o Social: Liga das Senhoras Cat�licas de S�o Paulo\r\n"    				
    				+ "Descri��o:A Liga Solid�ria desenvolve programas sociais de educa��o e cidadania para crian�as,\n"
    				+ "jovens e adultos que residem em �reas de alta vulnerabilidade social.\r\n"
    				+ "�rea de Atua��o: Educa��o e cidadania\r\n"
    				+ "Av. Dr. Arnaldo 1943\r\n"
    				+ "Sumar�\r\n"
    				+ "CEP 01255-000\r\n"
    				+ "(11) 3017-0613\r\n"
    				+ "contatovoluntariado@ligasolidaria.org\r\n");
    	}
    	else if(RegOeste==4) {
    		System.out.println("Raz�o Social: Associa��o Fazendo Hist�ria\r\n"
    				+ "Descri��o: H� 15 anos, o Instituto Fazendo Hist�ria trabalha pelo direito de cada uma das 40 mil crian�as\n"
    				+ "e adolescentes que vivem separados de suas fam�lias, em abrigos e outros servi�os de acolhimento, para que\n"
    				+ "se desenvolvam plenamente em fam�lia e na comunidade.\r\n"
    				+ "�rea de Atua��o: Acolhimento de crian�as e adolecentes\r\n"
    				+ "Rua Pedro Ortiz 114\r\n"
    				+ "Sumarezinho\r\n"
    				+ "CEP 05440-010\r\n"
    				+ "(11) 3021-9889\r\n"
    				+ "daniela@fazendohistoria.org.br\r\n");
    	}
    	else {
    		System.out.println("Voc� digitou um n�mero inv�lido");
    	}
    	entrada.close();

}
}
