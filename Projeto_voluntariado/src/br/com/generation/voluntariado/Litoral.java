package br.com.generation.voluntariado;

import java.util.Scanner;

public class Litoral {
	void litoral() {
	Scanner entrada = new Scanner(System.in);
	 int teste, teste2, teste3;
	 System.out.println("Escolha uma cidade do Litoral Paulista: "
             + "\n[1] Santos \n[2] Litoral norte");
	 teste2=entrada.nextInt();
	 
	 
	if(teste2==1) {
		System.out.println("[1]Entrega por Santos \n[2]Lar vicentino \n[3]Ecofaxina \n[4]Brinquedos do Bem \n");
		 teste=entrada.nextInt();
 	if(teste==1) {
 		System.out.println("Razão social: Entrega por Santos\r\n"
 				+ "Descrição: O projeto Entrega por Santos é uma mobilização solidária, sem fins lucrativos ou vínculos políticos, que busca resgatar sorrisos daqueles que vivem nas ruas de Santos e São Vicente. Conheça mais sobre o projeto e seja um voluntario!\r\n"
 				+ "Área de Atuação: Cidadania e vida \r\n"
 				+ "http://www.instagram.com/entregaporsantos\r\n"
 				+ "Email entregaporsantos@gmail.com\r\n"
 				+ "https://pt-br.facebook.com/entregaporsantos/");
 	}
 	else if(teste==2) {
 		System.out.println("Razão social : Lar vicentino \r\n"
 				+ "Descrição: O lar procura pessoas para conversar com os idosos residentes. Se você tem paciência e espírito jovem, é bem-vindo! \r\n"
 				+ "Área de Atuação: Cidadania e ajuda a idosos \r\n"
 				+ "Tel (13) 3466-3331. \r\n"
 				+ "Rua Carijós, 139\r\n"
 				+ "São Vicente.\r\n"
 				+ "CEP 09951-450\r\n"
 				+ "Conheça mais sobre o projeto e seja um voluntario!\r\n"
 				+ "https://www.facebook.com/larvicentinos");
 	}
 	else if(teste==3) {
 		System.out.println("Razão social : Ecofaxina\r\n"
 				+ "Descrição: O Instituto EcoFaxina atua desde 2008 com foco no desenvolvimento e apoio a políticas públicas, pesquisas, programas e ações voltadas à proteção do Meio Ambiente e ao Desenvolvimento Sustentável. Seus esforços estão focados na expansão da consciência ambiental.\r\n"
 				+ "Área de Atuação: Saude e proteção do meio ambiente \r\n"
 				+ "Rua Nabuco de Araújo, 71, Boqueirão\r\n"
 				+ "Santos\r\n"
 				+ "CEP: 11025-010\r\n"
 				+ "https://www.instagram.com/ecofaxina/\r\n"
 				+ "https://www.institutoecofaxina.org.br/voluntariado-beta");
 	}
 	else if(teste==4) {
 		System.out.println("Razão social: Brinquedos do bem \r\n"
 				+ "Descrição:  O grupo tem como objetivo levar brinquedos para as crianças internadas nos hospitais da cidade. O mais legal é que, além de espalhar sorrisos, ainda há um ensinamento: repassar os brinquedos:\r\n"
 				+ "Área de Atuação: Assistencia e doação a crianças  \r\n"
 				+ "(13) 99719-3069 e (13) 99110-9398\r\n"
 				+ "Conheça mais sobre o projeto e seja um voluntario!\r\n"
 				+ "https://www.facebook.com/Brinquedos-do-Bem-1474359839529099/");
 	}
 	else {
 		System.out.println("Você digitou um numero invalido");
 	}
	}
 	else if(teste2==2) {
 		System.out.println("[1]Supereco \\n[2]Associação viva e deixe viver contadores de histórias");
 		teste3=entrada.nextInt();
 	 if(teste3==5) {
 		System.out.println("Razão social: Supereco \r\n"
 				+ "Descrição: Você tem algum talento e um propósito de vida? Quer viver uma experiência única e especial? Gosta das causas ambientais e sociais? Quer ensinar algo e aprender, compartilhando saberes com a comunidade?  Pode doar seu tempo para fazer a diferença? Conheça mais sobre o projeto e seja um voluntario\r\n"
 				+ "Área de Atuação: Cidadania e vida \r\n"
 				+ "Rua Maria Cristiano, 72 - São Francisco\r\n"
 				+ "São Sebastião - SP\r\n"
 				+ "CEP 11629-263\r\n"
 				+ "Email: administrativo@supereco.org.br\r\n"
 				+ "https://www.supereco.org.br/voluntariado-1");
 	}
 	else if(teste3==6) {
 		System.out.println("Razão social: Associação viva e deixe viver contadores de histórias\r\n"
 				+ "Descrição: Levar a leitura, a brincadeira, as histórias para onde quer que vamos é o primeiro passo para transformar o atendimento clínico e internação hospitalar de crianças e adolescentes que passam por momentos difíceis em um momento mais alegre, saudável, agradável e terapêutico.\r\n"
 				+ "Área de Atuação: Cultura e educação \r\n"
 				+ "https://www.instagram.com/vivavdv/\r\n"
 				+ "https://www.vivaedeixeviver.org.br/seja-um-voluntario/");
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