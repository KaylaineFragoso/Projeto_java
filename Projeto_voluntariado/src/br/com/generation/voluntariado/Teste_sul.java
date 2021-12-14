package br.com.generation.voluntariado;

import java.util.Scanner;

public class Teste_sul {

	void sul() {
		Scanner entrada =new Scanner(System.in);
		int  teste;
		System.out.println("Escolha uma das instituições para saber mais: \n[1] Associação Beneficente Parsifal\n[2] Salva Vidas Mirim\n[3] Fundação Bunge\n[4] Assoc.Desportiva para Deficientes");
		teste=entrada.nextInt();
    	if(teste==1) {
    		System.out.println("Razão Social: Assoc.Beneficente Parsifal\r\n"
    				+ "Descrição: A Parsifal, instituição de Pedagogia Curativa e Terapia Social, foi fundada em 1991 e tem como objetivo promover o desenvolvimento pessoal e o convívio social de crianças, jovens e adultos com deficiências e distúrbios psíquicos. \r\n"
    				+ "Área de Atuação: Assistência a pessoas com deficiência\r\n"
    				+ "R.Robélia 59\r\n"
    				+ "Jardim Prudência\r\n"
    				+ "CEP 04648-240\r\n"
    				+ "(11) 5547 0201\r\n"
    				+ "aparsifal@terra.com.br\r\n"
    				+ "https://parsifal.org.br\r\n"
    				);
    	}
    	else if(teste==2) {
    		System.out.println("Razão Social: GRAACC - Grupo de Apoio a Adolescentes e à Criança com Câncer\r\n"                		
    				+ "Área de Atuação: Assistência a crianças"
    				+ "Descrição: Garantir a crianças e adolescentes com câncer, dentro do mais avançado padrão científico, o direito de alcançar todas as chances de cura com qualidade de vida. \r\n"
    				+ "R.Botucatu 743\r\n"
    				+ "Vila Clementino\r\n"
    				+ "CEP 04023-062 \r\n"
    				+ "(11) 5080 8400\r\n"
    				+ "graacc@graacc.org.br\r\n"
    				+ "www.graacc.org.br\r\n");
    	}
    	else if(teste==3) {
    		System.out.println("Razão Social: Fundação Bunge\r\n"
    				+ "Área de Atuação: Educação e pesquisa\r\n"
    				+ "Descrição: Contribuir para o desenvolvimento sustentável por meio de ações que valorizem o avanço da ciência, a educação e a conservação dos recursos naturais.\r\n"
    				+ "Av.Maria Coelho Aguiar 215 Bloco D - 5º andar\r\n"
    				+ "Jardim São Luiz\r\n"
    				+ "CEP 05804-900\r\n"
    				+ "(11) 3741 6832\r\n"
    				+ "fundacao@bunge.com.br\r\n"
    				+ "www.fundacaobunge.org.br\r\n");
    	}
    	else if(teste==4) {
    		System.out.println("Razão Social: ADD- Assoc.Desportiva para Deficientes\r\n"
    				+ "Descrição: Missão Incentivar e promover o desenvolvimento e a inclusão de pessoas com deficiência por meio do esporte e do apoio educacional em âmbito nacional. Princípios e Valores A ADD valoriza os talentos e capacidades das pessoas, apoiando-se em princípios éticos e morais. \r\n"
    				+ "Área de Atuação: Assistência a pessoas com deficiência\r\n"
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
    		System.out.println("Você digitou um numero invalido");
    	}
    	entrada.close();
    	}

	}

