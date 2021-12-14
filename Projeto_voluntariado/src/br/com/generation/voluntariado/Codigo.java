package br.com.generation.voluntariado;

import java.util.Scanner;

public class Codigo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int teste, teste2, teste3, teste4, teste5;

        System.out.println("Você gostaria de encontrar uma instituição para se voluntariar? \n1: Sim \n2: Não ");
        teste=entrada.nextInt();
        //começo dos laços para saber se a pessoa quer ou não se voluntariar
        //
        if(teste==1) {
            System.out.println("Escolha uma região do estado de São Paulo:"
                    + " \n[1] Capital\n[2] Litoral\n[3] Interior\n[4] ABC");
            //escolha das regiões
            //
            teste2=entrada.nextInt();
            if(teste2==1) {
            	// escolha da capital
                //
            	System.out.println("Escolha uma região da capital de São Paulo: "
                        + "\n[1] Zona Norte \n[2] Zona Sul \n[3] Zona Leste \n[4] Zona Oeste");
                teste3=entrada.nextInt();
                if(teste3==1) {
                	//escolha da Zona norte em SP                	
                    //
                	System.out.println("Essas são as instituições:  do Norte");
                }
                else if(teste3==2) {
                   
                	System.out.println("Escolha uma das instituições para saber mais: \n[1] Associação Beneficente Parsifal\n[2] Salva Vidas Mirim\n[3] Fundação Bunge\n[4] Assoc.Desportiva para Deficientes");
                	//escolha da Zona sul em SP                 	
                	//
                	teste4=entrada.nextInt();
                	if(teste4==1) {
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
                	else if(teste4==2) {
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
                	else if(teste4==3) {
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
                	else if(teste4==4) {
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
                	
                }
                else if(teste3==3) {
                	//escolha da Zona leste em SP 
                    //
                	System.out.println("Escolha uma das instituições para saber mais: \n[1] Grupo da Sopa\n[2] Casa do Cristo Redentor\n[3] Assistência a pessoas com deficiência\n[4] Missões Quilombo");
                    teste5=entrada.nextInt();
                    if (teste5==1) {
                    	System.out.println("Razão Social: Grupo da Sopa\r\n"
                    			+ "Descrição: Preparo e distribuição de refeições, atendimento e orientação para moradores de rua na cidade de São Paulo. Formado por um grupo de amigos que prepara 320 refeições todas as quintas das 17 às 21h e depois deste horário sai para a entrega nas regiões do Brás, Centro, Ipiranga e Jabaquara. Aos sábados são 120 refeições preparadas das 9 às 12h e depois sai para entrega até as 14h na região do Brás e Glicério. Além das refeições também são levadas roupas, kits de higiene, cobertores, etc.\r\n"
                    			+ "Área de Atuação: Outros/Assistência\r\n"
                    			+ "Rua Borges de Figueiredo, 82\r\n"
                    			+ "Mooca\r\n"
                    			+ "CEP 03110-010\r\n"                    			
                    			+ "(11) 994465312 ou (11) 96332-4165\r\n"
                    			+ "contato@grupodasopa.org ou norivalnogueira@gmail.com\r\n"
                    			+ "www.grupodasopa.org\r\n"
                    			+ "/grupo.dasopa\r\n");
                    	}
                    else if(teste5==2) {
                    	System.out.println("Razão Social: Lar da Redenção\r\n"
                    			+ "Área de Atuação: Assistência a pessoas com deficiência\r\n"
                    			+ "Descrição:Oferecer moradia e tratamento adequado a crianças especiais portadoras de deficiência física mental e múltipla, em condição de abandono e maus tratos, desenvolvendo ao máximo suas potencialidades enquanto houver prognostico reabilitacional. Promover a intervenção precoce para quando possível, facilitar sua autonomia e inclusão social. \r\n"
                    			+ "R.Cassandoca 535\r\n"
                    			+ "Mooca\r\n"
                    			+ "CEP 03169-010\r\n"                    			
                    			+ "(11) 2605 4879\r\n"
                    			+ "lardaredencao@lardaredencao.org.br\r\n"
                    			+ "www.lardaredencao.org.br\r\n");
                    }
                    else if(teste5==3) {
                    	System.out.println("Razão Social: Casa do Cristo Redentor\r\n"
                    			+ "Área de Atuação: Assistência a crianças\r\n"
                    			+ "Descrição: Tem o objetivo de acolher, educar e promover o bem-estar físico e social de crianças, adolescentes e famílias em situação de vulnerabilidade social. \r\n"
                    			+ "R.Agrimensor Sugaya 986\r\n"
                    			+ "Itaquera\r\n"
                    			+ "CEP 08260-030\r\n"
                    			+ "(11) 6521 6222\r\n"
                    			+ "ccr@casadocristoredentor.org.br\r\n"
                    			+ "www.casadocristoredentor.org.br\r\n");
                    }
                    else if(teste5==4) {
                    	System.out.println("Razão Social: Sociedade Cultural Missões Quilombo\r\n"
                    			+ "Área de Atuação: Direitos Humanos e Cidadania\r\n"
                    			+ "Descrição: Tem o objetivo de levar à consciência negra e à negritude cristã, debate racial com a sociedade. 	Promover a discussão bíblico-teológica sobre o racismo. Debater os preconceitos ainda encontrados na igreja, na teologia e na educação religiosa\r\n"
                    			+ "R.João Bodin 296 Quadra M Casa 01\r\n"
                    			+ "Jardim Aurora\r\n"
                    			+ "CEP 08431-060\r\n"                    			
                    			+ "(11) 6135 3867\r\n"
                    			+ "hernaniquilombo@yahoo.com.br\r\n"
                    			+ "www.mquilombo.com.br\r\n");
                    }
                }
                else if(teste3==1) {
                	//escolha da Zona norte em SP                 	
                    //
                	System.out.println("essas são as instituições do oeste");
                }
                else {
                    System.out.println("Você digitou um numero invalido");
                }
            }


            else if(teste2==2) {
                System.out.println("essas são a opção do Litoral");
                //Escolha do litoral dentro do 2 if                
                //
            }
            else if(teste2==3) {
                System.out.println("essas são a opção do Interior");
                //Escolha do interior dentro do 2 if 
                //
            }
            else if(teste2==4) {
                System.out.println("essas são a opção do ABC");
                //Escolha do litoral dentro do 2 if        
                //
            }
            else {
                System.out.println("Você digitou um numero invalido");
            }
        }
        else if(teste==2) {
        	System.out.println("Muito obrigado por visitar nosso projeto");
        }
        else {
            System.out.println("Você digitou um numero invalido");
        }
        
        entrada.close();

	}

}
