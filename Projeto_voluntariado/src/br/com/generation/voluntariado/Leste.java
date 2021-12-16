package br.com.generation.voluntariado;

import java.util.Scanner;

public class Leste {
	
    void leste(){
    	
	  Scanner entrada = new Scanner(System.in);
	  int regLeste;
	  System.out.println("Escolha uma das instituições para saber mais: \n[1] Grupo da Sopa\n[2] Lar da Redenção\n[3] Casa do Cristo Redentor\n[4] Missões Quilombo");
	  regLeste=entrada.nextInt();
	  if (regLeste==1) {
		
        System.out.println("Razão Social: Grupo da Sopa\r\n"
     			+ "Descrição: Preparo e distribuição de refeições, atendimento e orientação para moradores de rua \n"
     			+ "na cidade de São Paulo. Formado por um grupo de amigos que prepara 320 refeições todas as quintas\n"
     			+ "das 17 às 21h e depois deste horário sai para a entrega nas regiões do Brás, Centro, Ipiranga e Jabaquara.\n"
     			+ "Aos sábados são 120 refeições preparadas das 9 às 12h e depois sai para entrega até as 14h na região do Brás \n"
     			+ "e Glicério. Além das refeições também são levadas roupas, kits de higiene, cobertores, etc.\r\n"
     			+ "Área de Atuação: Outros/Assistência\r\n"
     			+ "Rua Borges de Figueiredo, 82\r\n"
     			+ "Mooca\r\n"
     			+ "CEP 03110-010\r\n"                    			
     			+ "(11) 994465312 ou (11) 96332-4165\r\n"
     			+ "contato@grupodasopa.org ou norivalnogueira@gmail.com\r\n"
     			+ "www.grupodasopa.org\r\n"
     			+ "/grupo.dasopa\r\n");
     	}
        else if(regLeste==2) {
     	    System.out.println("Razão Social: Lar da Redenção\r\n"
     			+ "Descrição:Oferecer moradia e tratamento adequado a crianças especiais portadoras de deficiência física mental e múltipla,\n"
     			+ "em condição de abandono e maus tratos, desenvolvendo ao máximo suas potencialidades enquanto houver prognostico reabilitacional.\n"
     			+ "Promover a intervenção precoce para quando possível, facilitar sua autonomia e inclusão social. \r\n"
     			+ "Área de Atuação: Assistência a pessoas com deficiência\r\n"
     			+ "R.Cassandoca 535\r\n"
     			+ "Mooca\r\n"
     			+ "CEP 03169-010\r\n"                    			
     			+ "(11) 2605 4879\r\n"
     			+ "lardaredencao@lardaredencao.org.br\r\n"
     			+ "www.lardaredencao.org.br\r\n");
        }
        else if(regLeste==3) {
     	    System.out.println("Razão Social: Casa do Cristo Redentor\r\n"
     			+ "Descrição: Tem o objetivo de acolher, educar e promover o bem-estar físico e social de crianças, adolescentes \n"
     			+ "e famílias em situação de vulnerabilidade social. \r\n"
     			+ "Área de Atuação: Assistência a crianças\r\n"
     			+ "R.Agrimensor Sugaya 986\r\n"
     			+ "Itaquera\r\n"
     			+ "CEP 08260-030\r\n"
     			+ "(11) 6521 6222\r\n"
     			+ "ccr@casadocristoredentor.org.br\r\n"
     			+ "www.casadocristoredentor.org.br\r\n");
        }
        else if(regLeste==4) {
     	    System.out.println("Razão Social: Sociedade Cultural Missões Quilombo\r\n"
     			+ "Descrição: Tem o objetivo de levar à consciência negra e à negritude cristã, debate racial com a sociedade.\n"
     			+ "Promover a discussão bíblico-teológica sobre o racismo. Debater os preconceitos ainda encontrados na igreja, \n"
     			+ "na teologia e na educação religiosa\r\n"
     			+ "Área de Atuação: Direitos Humanos e Cidadania\r\n"
     			+ "R.João Bodin 296 Quadra M Casa 01\r\n"
     			+ "Jardim Aurora\r\n"
     			+ "CEP 08431-060\r\n"                    			
     			+ "(11) 6135 3867\r\n"
     			+ "hernaniquilombo@yahoo.com.br\r\n"
     			+ "www.mquilombo.com.br\r\n");
       }
       else {
 		   System.out.println("Você digitou um número inválido");
 	   }
	   entrada.close();
   }
}
