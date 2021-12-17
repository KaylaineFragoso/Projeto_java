package br.com.generation.voluntariado;

import java.util.Scanner;

public class Abc {

	void abc() {
		
        System.out.println("Escolha uma cidade do ABC Paulista: "
                + "\n[1] Santo Andr� \n[2] S�o Bernardo do Campo");
        Scanner entrada = new Scanner (System.in);
        int voluntariarAbc, regAndre, regBernardo;
        voluntariarAbc=entrada.nextInt();
        if(voluntariarAbc==1) {
        
        System.out.println("Escolha uma das institui��es para saber mais: \n[1] Am�lia Rodrigues\n[2] Projeto J.E.D.A\n[3] Casa do Caminho Ananias\n[4] AVSSA");
        	
        regAndre=entrada.nextInt();
        if(regAndre==1) {
        		System.out.println("Raz�o Social: Institui��o Assistencial e Educacional Am�lia Rodrigues\r\n"
        				+ "Descri��o: A Institui��o Am�lia Rodrigues tem como objetivo proporcionar o desenvolvimento \n"
        				+ "integral de crian�as e oferecer condi��es de trabalho �s m�es, visando melhoria na renda familiar. \r\n"
        				+ "�rea de Atua��o: Educa��o\r\n"
        				+ "R. Tamarutaca, 190\r\n"
        				+ "Vila Guiomar\r\n"
        				+ "CEP 09071-130\r\n"
        				+ "ameliarodrigues@ameliarodrigues.org.br\r\n"
        				+ "www.ameliarodrigues.org.br\r\n"
        				);
        }
        else if(regAndre==2) {
        		System.out.println("Raz�o Social: Assoc.Civil Projeto Juventude Esperan�a do Amanh�\r\n"                		
        				+ "�rea de Atua��o: Educa��o"
        				+ "Descri��o: O JEDA atua na defesa dos direitos de crian�as, adolescentes e suas fam�lias,\n"
        				+ "executando a��es que previnem a ocorr�ncia de situa��es de risco social e fortalecendo a \n"
        				+ "conviv�ncia familiar e comunit�ria. \r\n"
        				+ "R. Dr. Eduardo Monteiro, 946\r\n"
        				+ "Jd. Bela Vista\r\n"
        				+ "CEP 09041-300 \r\n"
        				+ "projetojeda@aol.com\r\n"
        				+ "http://www.projetojeda.org.br/index.html\r\n");
        }
        else if(regAndre==3) {
        		System.out.println("Raz�o Social: Institui��o Assistencial Casa do Caminho Ananias\r\n"
        				+ "�rea de Atua��o: Assist�ncia a idosos e adultos\r\n"
        				+ "Descri��o: A Casa do Caminho Ananias oferece acolhimento de idosas acamadas e o fortalecimento \n"
        				+ "de v�nculos para crian�as, adolescentes e fam�lias em situa��o de vulnerabilidade social e econ�mica.\r\n"
        				+ "Rua Andorinhas, n� 09\r\n"
        				+ "Jardim do Sol\r\n"
        				+ "CEP 09071-120\r\n"
        				+ "https://www.casadocaminhoananias.org.br/\r\n");
        }
        else if(regAndre==4) {
        		System.out.println("Raz�o Social: Associa��o dos Volunt�rios da Sa�de de Santo Andr� - AVSSA\r\n"
        				+ "Descri��o: A Associa��o busca humanizar o atendimento da rede p�blica de sa�de de Santo Andr� \n"
        				+ "atrav�s de a��es de apoio e acolhimento. \r\n"
        				+ "�rea de Atua��o: Sa�de\r\n"
        				+ "Av. Jo�o Ramalho, 305\r\n"
        				+ "Vila Assun��o\r\n"
        				+ "CEP 09041-030\r\n"
        				+ "mariaemilia@avssa.org.br\r\n"
        				+ "www.avssa.org.br\r\n");
        }
        else {
        		System.out.println("Voc� digitou um n�mero inv�lido");
        }
        	
     }
        
        else if(voluntariarAbc==2) {
          
        	System.out.println("Escolha uma das institui��es para saber mais: \n[1] Casa dos Velhinhos Dona Adelaide\n[2] IAIP - Irm�o Palminha\n[3] AGDS\n[4] Casa de Estar S�o Luiz\n[5] Instituto Mam�e Clory"); 
        	
        regBernardo=entrada.nextInt();
        if(regBernardo==1) {
        		System.out.println("Raz�o Social: Casa dos Velhinhos Dona Adelaide\r\n"
        				+ "Descri��o: A institui��o promove a qualidade de vida e inclus�o social da pessoa idosa em situa��o\n"
        				+ "de vulnerabilidade atrav�s de moradia e atividades sociais. \r\n"
        				+ "�rea de Atua��o: Assist�ncia a idosos e adultos\r\n"
        				+ "Rua Pr�ncipe Humberto, 250\r\n"
        				+ "Campestre\r\n"
        				+ "CEP 09725-200\r\n"
        				+ "contato@velhinhosadelaide.org.br\r\n"
        				+ "http://velhinhosadelaide.org.br/\r\n"
        				);
        }
        else if(regBernardo==2) {
        		System.out.println("Raz�o Social: Institui��o Assistencial Irm�o Palminha\r\n"                		
        				+ "�rea de Atua��o: Assist�ncia a crian�as"
        				+ "Descri��o: A IAIP realiza atendimento socioassistencial para fam�lias em situa��o de vulnerabilidade, \n"
        				+ "exclus�o e risco social pois acredita que o n�cleo familiar, independente de sua organiza��o, � o primeiro\n"
        				+ "espa�o de refer�ncia, prote��o e socializa��o do indiv�duo. \r\n"
        				+ "Rua Benedito Conrado Filho, 65\r\n"
        				+ "Jardim Beatriz\r\n"
        				+ "CEP 09895-110\r\n"
        				+ "palminha@palminha.org.br\r\n"
        				+ "www.iaip.org.br\r\n");
        }
        else if(regBernardo==3) {
        		System.out.println("Raz�o Social: Assoc.Global para o Desenvolvimento Sustentado\r\n"
        				+ "�rea de Atua��o: Ambientalismo\r\n"
        				+ "Descri��o: A Associa��o desenvolve e implanta projetos e programas de educa��o ambiental, gest�o\n"
        				+ "e recupera��o de �reas a serem preservadas nos diversos biomas brasileiros e representa a sociedade\n"
        				+ "junto aos f�runs oficiais em temas relacionados � educa��o e ao meio ambiente.\r\n"
        				+ "Av.Vivaldi, 1421\r\n"
        				+ "Rudge Ramos\r\n"
        				+ "CEP 09617-000\r\n"
        				+ "agds@agds.org.br\r\n"
        				+ "www.agds.org.br\r\n");
        }
        else if(regBernardo==4) {
        		System.out.println("Raz�o Social: Associa��o S�o Luiz\r\n"
        				+ "Descri��o: A entidade promove o acolhimento e a preserva��o dos v�nculos familiares, sociais \n"
        				+ "e comunit�rios atrav�s do exerc�cio da cidadania. Oferece atendimento e acompanhamento m�dico,\n"
        				+ "odontol�gico e psicol�gico, atividades pedag�gicas e recreativas e tratamento especializado para\n"
        				+ "crian�as com necessidades especiais. \r\n"
        				+ "�rea de Atua��o: Assist�ncia a crian�as\r\n"
        				+ "R. Miguel Arco e Flecha, 41\r\n"
        				+ "Vila Euclides\r\n"
        				+ "CEP 09725-500\r\n"
        				+ "https://associacaosaoluiz.org.br/\r\n");
        }
        else if(regBernardo==5) {
        		System.out.println("Raz�o Social: Lar da Mam�e Clory\r\n"
        				+ "Descri��o: O Lar da Mam�e Clory atua com o objetivo de amparar e assistir crian�as e adolescentes\n"
        				+ "e mant�m diversas atividades como creche, apoio educacional, cultural e esportivo, n�cleo de educa��o\n"
        				+ "ambiental e n�cleo de atendimento � fam�lia. \r\n"
        				+ "�rea de Atua��o: Assist�ncia e servi�os sociais\r\n"
        				+ "R. Francisco Visentainer, 438\r\n"
        				+ "Assun��o\r\n"
        				+ "CEP 09861-630\r\n"
        				+ "diretoria@mamaeclory.org.br\r\n"
        				+ "www.mamaeclory.org.br\r\n");
        }
        else {
        	System.out.println("Voc� digitou um n�mero inv�lido");
        }
   }
        entrada.close();
   }
}
