package br.com.generation.voluntariado;

import java.util.Scanner;

public class Abc {

	void abc() {
		
        System.out.println("Escolha uma cidade do ABC Paulista: "
                + "\n[1] Santo André \n[2] São Bernardo do Campo");
        Scanner entrada = new Scanner (System.in);
        int voluntariarAbc, regAndre, regBernardo;
        voluntariarAbc=entrada.nextInt();
        if(voluntariarAbc==1) {
        
        System.out.println("Escolha uma das instituições para saber mais: \n[1] Amélia Rodrigues\n[2] Projeto J.E.D.A\n[3] Casa do Caminho Ananias\n[4] AVSSA");
        	
        regAndre=entrada.nextInt();
        if(regAndre==1) {
        		System.out.println("Razão Social: Instituição Assistencial e Educacional Amélia Rodrigues\r\n"
        				+ "Descrição: A Instituição Amélia Rodrigues tem como objetivo proporcionar o desenvolvimento \n"
        				+ "integral de crianças e oferecer condições de trabalho às mães, visando melhoria na renda familiar. \r\n"
        				+ "Área de Atuação: Educação\r\n"
        				+ "R. Tamarutaca, 190\r\n"
        				+ "Vila Guiomar\r\n"
        				+ "CEP 09071-130\r\n"
        				+ "ameliarodrigues@ameliarodrigues.org.br\r\n"
        				+ "www.ameliarodrigues.org.br\r\n"
        				);
        }
        else if(regAndre==2) {
        		System.out.println("Razão Social: Assoc.Civil Projeto Juventude Esperança do Amanhã\r\n"                		
        				+ "Área de Atuação: Educação"
        				+ "Descrição: O JEDA atua na defesa dos direitos de crianças, adolescentes e suas famílias,\n"
        				+ "executando ações que previnem a ocorrência de situações de risco social e fortalecendo a \n"
        				+ "convivência familiar e comunitária. \r\n"
        				+ "R. Dr. Eduardo Monteiro, 946\r\n"
        				+ "Jd. Bela Vista\r\n"
        				+ "CEP 09041-300 \r\n"
        				+ "projetojeda@aol.com\r\n"
        				+ "http://www.projetojeda.org.br/index.html\r\n");
        }
        else if(regAndre==3) {
        		System.out.println("Razão Social: Instituição Assistencial Casa do Caminho Ananias\r\n"
        				+ "Área de Atuação: Assistência a idosos e adultos\r\n"
        				+ "Descrição: A Casa do Caminho Ananias oferece acolhimento de idosas acamadas e o fortalecimento \n"
        				+ "de vínculos para crianças, adolescentes e famílias em situação de vulnerabilidade social e econômica.\r\n"
        				+ "Rua Andorinhas, nº 09\r\n"
        				+ "Jardim do Sol\r\n"
        				+ "CEP 09071-120\r\n"
        				+ "https://www.casadocaminhoananias.org.br/\r\n");
        }
        else if(regAndre==4) {
        		System.out.println("Razão Social: Associação dos Voluntários da Saúde de Santo André - AVSSA\r\n"
        				+ "Descrição: A Associação busca humanizar o atendimento da rede pública de saúde de Santo André \n"
        				+ "através de ações de apoio e acolhimento. \r\n"
        				+ "Área de Atuação: Saúde\r\n"
        				+ "Av. João Ramalho, 305\r\n"
        				+ "Vila Assunção\r\n"
        				+ "CEP 09041-030\r\n"
        				+ "mariaemilia@avssa.org.br\r\n"
        				+ "www.avssa.org.br\r\n");
        }
        else {
        		System.out.println("Você digitou um número inválido");
        }
        	
     }
        
        else if(voluntariarAbc==2) {
          
        	System.out.println("Escolha uma das instituições para saber mais: \n[1] Casa dos Velhinhos Dona Adelaide\n[2] IAIP - Irmão Palminha\n[3] AGDS\n[4] Casa de Estar São Luiz\n[5] Instituto Mamãe Clory");
        	
        regBernardo=entrada.nextInt();
        if(regBernardo==1) {
        		System.out.println("Razão Social: Casa dos Velhinhos Dona Adelaide\r\n"
        				+ "Descrição: A instituição promove a qualidade de vida e inclusão social da pessoa idosa em situação\n"
        				+ "de vulnerabilidade através de moradia e atividades sociais. \r\n"
        				+ "Área de Atuação: Assistência a idosos e adultos\r\n"
        				+ "Rua Príncipe Humberto, 250\r\n"
        				+ "Campestre\r\n"
        				+ "CEP 09725-200\r\n"
        				+ "contato@velhinhosadelaide.org.br\r\n"
        				+ "http://velhinhosadelaide.org.br/\r\n"
        				);
        }
        else if(regBernardo==2) {
        		System.out.println("Razão Social: Instituição Assistencial Irmão Palminha\r\n"                		
        				+ "Área de Atuação: Assistência a crianças"
        				+ "Descrição: A IAIP realiza atendimento socioassistencial para famílias em situação de vulnerabilidade, \n"
        				+ "exclusão e risco social pois acredita que o núcleo familiar, independente de sua organização, é o primeiro\n"
        				+ "espaço de referência, proteção e socialização do indivíduo. \r\n"
        				+ "Rua Benedito Conrado Filho, 65\r\n"
        				+ "Jardim Beatriz\r\n"
        				+ "CEP 09895-110\r\n"
        				+ "palminha@palminha.org.br\r\n"
        				+ "www.iaip.org.br\r\n");
        }
        else if(regBernardo==3) {
        		System.out.println("Razão Social: Assoc.Global para o Desenvolvimento Sustentado\r\n"
        				+ "Área de Atuação: Ambientalismo\r\n"
        				+ "Descrição: A Associação desenvolve e implanta projetos e programas de educação ambiental, gestão\n"
        				+ "e recuperação de áreas a serem preservadas nos diversos biomas brasileiros e representa a sociedade\n"
        				+ "junto aos fóruns oficiais em temas relacionados à educação e ao meio ambiente.\r\n"
        				+ "Av.Vivaldi, 1421\r\n"
        				+ "Rudge Ramos\r\n"
        				+ "CEP 09617-000\r\n"
        				+ "agds@agds.org.br\r\n"
        				+ "www.agds.org.br\r\n");
        }
        else if(regBernardo==4) {
        		System.out.println("Razão Social: Associação São Luiz\r\n"
        				+ "Descrição: A entidade promove o acolhimento e a preservação dos vínculos familiares, sociais \n"
        				+ "e comunitários através do exercício da cidadania. Oferece atendimento e acompanhamento médico,\n"
        				+ "odontológico e psicológico, atividades pedagógicas e recreativas e tratamento especializado para\n"
        				+ "crianças com necessidades especiais. \r\n"
        				+ "Área de Atuação: Assistência a crianças\r\n"
        				+ "R. Miguel Arco e Flecha, 41\r\n"
        				+ "Vila Euclides\r\n"
        				+ "CEP 09725-500\r\n"
        				+ "https://associacaosaoluiz.org.br/\r\n");
        }
        else if(regBernardo==5) {
        		System.out.println("Razão Social: Lar da Mamãe Clory\r\n"
        				+ "Descrição: O Lar da Mamãe Clory atua com o objetivo de amparar e assistir crianças e adolescentes\n"
        				+ "e mantém diversas atividades como creche, apoio educacional, cultural e esportivo, núcleo de educação\n"
        				+ "ambiental e núcleo de atendimento à família. \r\n"
        				+ "Área de Atuação: Assistência e serviços sociais\r\n"
        				+ "R. Francisco Visentainer, 438\r\n"
        				+ "Assunção\r\n"
        				+ "CEP 09861-630\r\n"
        				+ "diretoria@mamaeclory.org.br\r\n"
        				+ "www.mamaeclory.org.br\r\n");
        }
        else {
        	System.out.println("Você digitou um número inválido");
        }
   }
        entrada.close();
   }
}
