package br.com.generation.voluntariado;

import java.util.Scanner;

public class Norte {
	void norte() {
		Scanner entrada =new Scanner(System.in);
		int  teste;
		System.out.println("Escolha uma das instituições para saber mais: \n[1] Instituto Resgatando Vidas\n[2] Associação Tia Marly\n[3] Associação Cultural e Esportiva Viva ZN\r\n[4] Casa Taiguara das Expedições\r\n");
		teste=entrada.nextInt();
    	if(teste==1) {
    		System.out.println("Razão Social: Instituto Resgatando Vidas Para Vida\r\n"
    				+ "Descrição: Tem como objetivo principal promover cidadania e transformação social através da educação e empreendedorismo junto à população aos arredores do bairro da Vila Nova Cachoeirinha \r\n"
    				+ "Área de Atuação: Cidadania e vida \r\n"
    				+ "Rua Augusto Gil 465\r\n"
    				+ "Vila Dionisia\r\n"
    				+ "CEP  02670-070\r\n"
    				+ "(11) 3774-5981\r\n"
    				+ "contato@institutoresgatandovidas.org.br\r\n"
    				);
    	}
    	else if(teste==2) {
    		System.out.println("Razão Social: Associação Tia Marly\r\n"                		
    				+ "Descrição: A associação Tia Marly é uma organização social, não conveniada a órgãos públicos, sem fins lucrativos, fundada em 27 de junho de 2007, através da iniciativa de um grupo de amigos. Na unidade são oferecidas 17 vagas para acolhida integral de crianças e adolescentes de 0 a 17 anos e 11 meses. Vítimas de maus tratos, abuso, violência e abandono.  \r\n"
    				+ "Área de Atuação: Assistência a crianças"
    				+ "Rua Duarte de Azevedo 608\r\n"
    				+ "Santana- SP\r\n"
    				+ "CEP 02036-022\r\n"
    				+ "(11) 2099-3725\r\n"
    				+ "marly@casatiamarly.org.br\r\n");
    	}
    	else if(teste==3) {
    		System.out.println("Razão Social: Associação Cultural e Esportiva Viva ZN\r\n"
    				+ "Descrição: A Viva ZN é uma entidade sem fins lucrativos que acredita no potencial que a cultura, a educação e o esporte têm para transformar a realidade social de crianças e adolescentes que vivem em regiões periféricas.\r\n"
    				+ "Área de Atuação: Cultura, educação e esportes\r\n"
    				+ "Rua Engenheiro César 76\r\n"
    				+ "Santana - SP\r\n"
    				+ "CEP 02018-070\r\n"
    				+ "(11) 9989-6654\r\n"
    				+ "associacaovivazn@gmail.com\r\n");
    	}
    	else if(teste==4) {
    		System.out.println("Razão Social: Moradia Associação Civil\r\n"
    				+ "Descrição: As Casas Taiguara são Casas de Acolhimento e Abrigos para crianças e adolescentes sem moradia, principalmente aqueles que estão nas ruas de São Paulo. Desde 1996, seguem uma metodologia de trabalho pioneira e atuante: o acolhimento 24 horas, oferecendo moradia segura, volta à escola, boa alimentação e calor humano.\r\n"
    				+ "Área de Atuação: Acolhimento e abrigos para moradores de rua\r\n"
    				+ "Rua Felipe Fragoso 177\r\n"
    				+ "Bairro Freguesia do Ó\r\n"
    				+ "CEP 02558-060\r\n"
    				+ "(11) 3951-6987\r\n"
    				+ "valeriagonpassaro@gmail.com\r\n");
    	}
    	else {
    		System.out.println("Você digitou um numero invalido");
    	}
    	entrada.close();

}
}
