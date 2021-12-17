package br.com.generation.voluntariado;

import java.util.ArrayList;

public class Array {
private ArrayList<String> menu = new ArrayList<>();
private ArrayList<String> menu2 = new ArrayList<>();
String sp = "Escolha uma região do estado de São Paulo:";
String capital ="[1] Capital";
String litoral = "[2] Litoral";
String interior = "[3] Interior";
String abc = "[4] ABC";
 
String escolha = "Escolha uma região da capital de São Paulo: ";
String norte = "[1] Zona Norte";
String sul = "[2] Zona Sul ";
String leste= "[3] Zona Leste ";
String oeste ="[4] Zona Oeste";
public void lista() {
	menu.add(sp);
	menu.add(capital);
	menu.add(litoral);
	menu.add(interior);
	menu.add(abc);
	
	for(String i:menu) {
		System.out.println(i);
	}
}
public void regiao(){
	
	menu2.add(escolha);
	menu2.add(norte);
	menu2.add(sul);
	menu2.add(leste);
	menu2.add(oeste);
	for(String i:menu2) {
		System.out.println(i);
	}
}

}
