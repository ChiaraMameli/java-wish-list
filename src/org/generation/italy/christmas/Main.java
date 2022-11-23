package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
//	Creare una classe Main con metodo `main`, in cui implementare il seguente programma:
//	creare una nuova *ArrayList* dove salvare la lista dei desideri
//	continuare a chiedere all’utente di inserire un nuovo desiderio nella lista, fino a che l’utente sceglie di fermarsi
//	Ad ogni iterazione mostrare la lunghezza della lista e chiedere all’utente se vuole continuare.
//	Ad ogni iterazione aggiungere il desiderio alla lista.
//	Al termine dell’inserimento ordinare la lista e stampare a video la lista ordinata.
	
	public static void main(String[] args) {
		List <String> giftList = new ArrayList<>();
		
		boolean answer = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Vuoi aggiungere un regalo alla tua lista? y/n  ");
		String proceed = sc.nextLine().toLowerCase();
		
		if(proceed != "y" && proceed != "n")
			System.out.println("Il valore inserito non è valido.");
		
		if(proceed.equals("y")){
			answer = true;
			
			while(answer == true) {
				System.out.print("Inserisci un nuovo regalo: ");
				String newGift = sc.nextLine();
				giftList.add(newGift);
				
				System.out.print("La tua lista ha " + giftList.size() + " regal" + (giftList.size() == 1 ? "o" : "i") + ". Vuoi aggiungere un altro regalo alla tua lista? y/n  ");
				String proceedAgain = sc.nextLine();
				if(proceedAgain.equals("n")) {
					answer = false;
					
					System.out.println("Ecco la tua lista: ");
					Collections.sort(giftList);
					for(String gift : giftList) {
						System.out.println(gift);
					}
				}
					
			}
		}
	}
}
