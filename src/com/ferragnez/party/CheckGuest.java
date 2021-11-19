package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean invitato = false;
		int counter = 0;
		
		String[] listaInvitati = {"Dua Lipa" , "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi" , "Bebe Vio" , "Luis" , "Pardis Zarei", "Martina Maccherone" , "Rachel Zeilic" };
		
		System.out.println("Inserisci il tuo nome : ");
		String nome = scan.nextLine();
		System.out.println(nome);

		/*
		for(int i=0; i<listaInvitati.length; i++) {
			if(nome.equals(listaInvitati[i])) {
				invitato = true;
				System.out.println("Sei tra gli invitati!");
				
				break;
			}
		}
		**/
		
		while(!invitato && counter < listaInvitati.length){
			if(nome.equals(listaInvitati[counter])) {
				invitato = true;
				System.out.println("Sei tra gli invitati!");
			}
			else {
				counter++;
			}
		}
		if(!invitato) {
			System.out.println("Non sei tra gli invitati");
		}
		scan.close();
	}
}
