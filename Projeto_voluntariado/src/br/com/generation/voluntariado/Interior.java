package br.com.generation.voluntariado;

import java.util.Scanner;

   public class Interior { 
	   
		void interior() {
			
		Scanner entrada = new Scanner(System.in);
		 int voluntariarInt, regSerra, regEmbu, regArtes;
		 System.out.println("Escolha uma cidade do Interior Paulista: "
	             + "\n[1] Itapecerica da Serra \n[2] Embu-Gua�u\n[3] Embu das Artes"); 
		 voluntariarInt=entrada.nextInt();
		 
		 
		if(voluntariarInt==1) {
			System.out.println("[1]Assoc.Cultural dos Amigos da Inform�tica \n[2]Clave de Sol\n");
			regSerra=entrada.nextInt();
	 	if(regSerra==1) {
	 		System.out.println("Raz�o social: Assoc.Cultural dos Amigos da Inform�tica\r\n"
	 				+ "Descri��o: O Lixo eletr�nico � muito perigoso para o meio ambiente! Vamos ajudar \n"
	 				+ "a preservar a natureza e tamb�m a nossa hist�ria? DOE AGORA!\r\n"
	 				+ "�rea de Atua��o: Museus \\r\\n"
	 				+ "Rua Itanhaem 5\r\n"
    				+ "Jd.Jo�o Montesano\r\n"
    				+ "CEP 06853-500\r\n"
    				+ "(11) 46667545\r\n"
	 				+ "curador@museudocomputador.org.br\r\n"
	 				+ "www.museudocomputador.org.br");
	 	}
	 	else if(regSerra==2) {
	 		System.out.println("Raz�o social : Assoc.Comunit�ria Clave de Sol \r\n"
	 				+ "Descri��o: A Associa��o Comunit�ria Clave de Sol venha visando � gest�o e execu��o\n"
	 				+ "de atividades do Servi�o de Prote��o Social B�sica\r\n"
	 				+ "�rea de Atua��o: Educa��o\\r\\n"
	 				+ "Estrada das Palmeiras 969\r\n"
    				+ "Parque Yara Cecy\r\n"
    				+ "CEP 06872-240\r\n"
	 				+ "Tel (11) 4667 7708.\r\n"
	 				+ "clavedesol-diretoria@uol.com.br\r\n"
	 				+ "www.clavedesol.org.br");
	 	}
	 	else {
	 		System.out.println("Voc� digitou um numero invalido");
	 		}
		}
	 	else if(voluntariarInt==2) {
	 		System.out.println("[1]Lar Volunt�rios do Amor\n");
	 		regEmbu=entrada.nextInt();
	 		if(regEmbu==1) {
	 		System.out.println("Raz�o social : Lar Volunt�rios do Amor\r\n"
	 				+ "Descri��o: O Lar Volunt�rios do Amor � uma entidade sem fins lucrativos \n"
	 				+ "que visa os cuidados com o ser humano em desenvolvimento.\r\n"
	 				+ "�rea de Atua��o: Assist�ncia e servi�os sociais\r\n"
	 				+ "R.Volunt�rios do Amor 580 Cx.90\r\n"
	 				+ "Cip�\r\n"
	 				+ "CEP 06900-000\r\n"
	 				+ "(11) 95781-2914; (11) 94015-9481; (11) 94700-3817; (11) 97255-0227; (11) 4663-2606\r\n"
	 				+ "https://www.larvoluntariosdoamor.com\r\n");
	 	}
	 		else {
		 		System.out.println("Voc� digitou um numero invalido");
		 		}
	 	}
	 	else if(voluntariarInt==3) {
	 		System.out.println("[1]Alian�a Cultural Brasil Filipinas\n");
	 		 regArtes=entrada.nextInt();
	 	 if( regArtes==1) {
	 		System.out.println("Raz�o social: Alian�a Cultural Brasil Filipinas\r\n"
	 				+ "Descri��o: Transformando Nossa Comunidade atrav�s de Projetos Sociais, Culturais e Esportivos\r\n"
	 				+ "�rea de Atua��o: Cultura\r\n"
	 				+ "Rua Calif�rnia, 512\r\n"
	 				+ "Jardim Santo Eduardo\r\n"
	 				+ "CEP 06823-020\r\n"
	 				+ "(11) 42034106\r\n"
	 				+ "aliancaculturalbrasilfilipinas@gmail.com\r\n"
	 				+ "Brasilfilipinas.org.br");
	 	}
	 	else {
	 		System.out.println("Voc� digitou um n�mero inv�lido");
	 	}
    }
	 	else {
	 		System.out.println("Voc� digitou um n�mero inv�lido");
	 	}
	 	
	 	entrada.close();
	}
}


