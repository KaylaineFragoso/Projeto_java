package br.com.generation.voluntariado;

import java.util.Scanner;

public class Oeste {

	void oeste() {
		
		Scanner entrada =new Scanner(System.in);
		int  RegOeste;
		System.out.println("Escolha uma das instituições para saber mais: \n[1] Instituto Sorrir Para Vida\n[2]  Associação criança Brasil\n[3] Liga das Senhoras Católicas de São Paulo\r\n[4] Instituto Fazendo História");
		RegOeste=entrada.nextInt();
		
    	if(RegOeste==1) {
    		System.out.println("Razão Social: Instituto Sorrir Para Vida\r\n"
    				+ "Descrição: Organização social sem fins lucrativos, criada para garantir o tratamento odontológico\n"
    				+ "de pessoas com câncer e com deficiência em situação de vulnerabilidade social. \r\n"
    				+ "Área de Atuação: Tratamento odontológico de pessoas com cancer \r\n"
    				+ "rua Ferreira de Araujo, 957\r\n"
    				+ "Pinheiros\r\n"
    				+ "CEP 05428-002\r\n"
    				+ "(11) 2977-4626\r\n"
    				+ "contato@sorrirparavida.org.br\r\n");
        }
    	else if(RegOeste==2) {
    		System.out.println("Razão Social: Associação criança Brasil\r\n"            		
    				+ "Descrição:Associação Criança Brasil é uma organização social sem fins econômicos com Certificado\n"
    				+ "de Entidade Beneficente de Assistência Social (CEBAS), inscrita no Conselho Municipal de Assistência Social\n"
    				+ "(COMAS) e no Conselho Municipal dos Direitos da Criança e do Adolescente (CMDCA).\r\n"
    				+ "Área de Atuação: Assistência a crianças"
    				+ "Rua Jacundá, 112\r\n"
    				+ "Jardim Panorama\r\n"
    				+ "CEP 05679-060\r\n"
    				+ "(11) 3773-4992\r\n"
    				+ "crianca@criancabrasil.org.br\r\n");
    	}
    	else if(RegOeste==3) {
    		System.out.println(" Razão Social: Liga das Senhoras Católicas de São Paulo\r\n"    				
    				+ "Descrição:A Liga Solidária desenvolve programas sociais de educação e cidadania para crianças,\n"
    				+ "jovens e adultos que residem em áreas de alta vulnerabilidade social.\r\n"
    				+ "Área de Atuação: Educação e cidadania\r\n"
    				+ "Av. Dr. Arnaldo 1943\r\n"
    				+ "Sumaré\r\n"
    				+ "CEP 01255-000\r\n"
    				+ "(11) 3017-0613\r\n"
    				+ "contatovoluntariado@ligasolidaria.org\r\n");
    	}
    	else if(RegOeste==4) {
    		System.out.println("Razão Social: Associação Fazendo História\r\n"
    				+ "Descrição: Há 15 anos, o Instituto Fazendo História trabalha pelo direito de cada uma das 40 mil crianças\n"
    				+ "e adolescentes que vivem separados de suas famílias, em abrigos e outros serviços de acolhimento, para que\n"
    				+ "se desenvolvam plenamente em família e na comunidade.\r\n"
    				+ "Área de Atuação: Acolhimento de crianças e adolecentes\r\n"
    				+ "Rua Pedro Ortiz 114\r\n"
    				+ "Sumarezinho\r\n"
    				+ "CEP 05440-010\r\n"
    				+ "(11) 3021-9889\r\n"
    				+ "daniela@fazendohistoria.org.br\r\n");
    	}
    	else {
    		System.out.println("Você digitou um número inválido");
    	}
    	entrada.close();

}
}
