package br.com.generation.voluntariado;

import java.util.Scanner;

    public class Litoral {
    	
	  void litoral() {
	
        Scanner entrada = new Scanner(System.in);
	    int voluntariarLit, litNorte, litSul;
	    System.out.println("Escolha uma cidade do Litoral Paulista: "
             + "\n[1] Santos \n[2] Litoral norte");
	    voluntariarLit=entrada.nextInt();
	    
	 
	 
	    if(voluntariarLit==1) {
		    System.out.println("[1]Entrega por Santos \n[2]Lar vicentino \n[3]Ecofaxina \n[4]Brinquedos do Bem \n");
		    litSul=entrada.nextInt();
		    
 	    if(litSul==1) {
 		    System.out.println("Raz�o social: Entrega por Santos\r\n"
 				+ "Descri��o: O projeto Entrega por Santos � uma mobiliza��o solid�ria, sem fins lucrativos ou v�nculos pol�ticos,\n"
 				+ "que busca resgatar sorrisos daqueles que vivem nas ruas de Santos e S�o Vicente.\n"
 				+ "Conhe�a mais sobre o projeto e seja um voluntario!\n"
 				+ "�rea de Atua��o: Cidadania e vida \n"
 				+ "http://www.instagram.com/entregaporsantos\n"
 				+ "Email entregaporsantos@gmail.com\n"
 				+ "https://pt-br.facebook.com/entregaporsantos/");
 	   }
 	   else if(litSul==2) {
 		   System.out.println("Raz�o social : Lar vicentino \r\n"
 				+ "Descri��o: O lar procura pessoas para conversar com os idosos residentes. Se voc� tem paci�ncia e esp�rito jovem, � bem-vindo! \r\n"
 				+ "�rea de Atua��o: Cidadania e ajuda a idosos \r\n"
 				+ "Tel (13) 3466-3331. \r\n"
 				+ "Rua Carij�s, 139\r\n"
 				+ "S�o Vicente.\r\n"
 				+ "CEP 09951-450\r\n"
 				+ "Conhe�a mais sobre o projeto e seja um voluntario!\r\n"
 				+ "https://www.facebook.com/larvicentinos");
 	   }
 	   else if(litSul==3) {
 		  System.out.println("Raz�o social : Ecofaxina\r\n"
 				+ "Descri��o: O Instituto EcoFaxina atua desde 2008 com foco no desenvolvimento e apoio a pol�ticas p�blicas, pesquisas, programas e a��es voltadas � prote��o do Meio Ambiente e ao Desenvolvimento Sustent�vel.\r\nSeus esfor�os est�o focados na expans�o da consci�ncia ambiental.\r\n"
 				+ "�rea de Atua��o: Saude e prote��o do meio ambiente \r\n"
 				+ "Rua Nabuco de Ara�jo, 71, Boqueir�o\r\n"
 				+ "Santos\r\n"
 				+ "CEP: 11025-010\r\n"
 				+ "https://www.instagram.com/ecofaxina/\r\n"
 				+ "https://www.institutoecofaxina.org.br/voluntariado-beta");
 	   }
       else if(litSul==4) {
 		  System.out.println("Raz�o social: Brinquedos do bem \r\n"
 				+ "Descri��o:  O grupo tem como objetivo levar brinquedos para as crian�as internadas nos hospitais da cidade. O mais legal � que, al�m de espalhar sorrisos, ainda h� um ensinamento: repassar os brinquedos:\r\n"
 				+ "�rea de Atua��o: Assistencia e doa��o a crian�as  \r\n"
 				+ "(13) 99719-3069 e (13) 99110-9398\r\n"
 				+ "Conhe�a mais sobre o projeto e seja um voluntario!\r\n"
 				+ "https://www.facebook.com/Brinquedos-do-Bem-1474359839529099/");
 	   }
 	   else {
 		   System.out.println("Voc� digitou um n�mero inv�lido");
 	   }
}
 	   else if(voluntariarLit==2) {
 		   System.out.println("[1]Supereco \n [2]Associa��o viva e deixe viver contadores de hist�rias");
 		   litNorte=entrada.nextInt();
 		   
 	   if(litNorte==1) {
 		  System.out.println("Raz�o social: Supereco \r\n"
 				+ "Descri��o: Voc� tem algum talento e um prop�sito de vida? Quer viver uma experi�ncia �nica e especial? Gosta das causas ambientais e sociais? Quer ensinar algo e aprender, compartilhando saberes com a comunidade?  Pode doar seu tempo para fazer a diferen�a? Conhe�a mais sobre o projeto e seja um voluntario\r\n"
 				+ "�rea de Atua��o: Cidadania e vida \r\n"
 				+ "Rua Maria Cristiano, 72 - S�o Francisco\r\n"
 				+ "S�o Sebasti�o - SP\r\n"
 				+ "CEP 11629-263\r\n"
 				+ "Email: administrativo@supereco.org.br\r\n"
 				+ "https://www.supereco.org.br/voluntariado-1");
 	   }
 	   else if(litNorte==2) {
 		   System.out.println("Raz�o social: Associa��o viva e deixe viver contadores de hist�rias\r\n"
 				+ "Descri��o: Levar a leitura, a brincadeira, as hist�rias para onde quer que vamos � o primeiro passo para transformar o atendimento cl�nico e interna��o hospitalar de crian�as e adolescentes que passam por momentos dif�ceis em um momento mais alegre, saud�vel, agrad�vel e terap�utico.\r\n"
 				+ "�rea de Atua��o: Cultura e educa��o \r\n"
 				+ "https://www.instagram.com/vivavdv/\r\n"
 				+ "https://www.vivaedeixeviver.org.br/seja-um-voluntario/");
 		
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