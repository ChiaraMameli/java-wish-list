package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static class StringComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			int o1Vowels = 0;
			int o2Vowels = 0;
			
			for(int x = 0; x < o1.length(); x++) {
				if(o1.charAt(x) == 'a' || o1.charAt(x) == 'e' || o1.charAt(x) == 'i' || o1.charAt(x) == 'o' || o1.charAt(x) == 'u') o1Vowels += 1;
			}
						
			for(int x = 0; x < o2.length(); x++) {
				if(o2.charAt(x) == 'a' || o2.charAt(x) == 'e' || o2.charAt(x) == 'i' || o2.charAt(x) == 'o' || o2.charAt(x) == 'u') o2Vowels += 1;
			}
			
			if(o1Vowels > o2Vowels) return 1;
			if(o1Vowels < o2Vowels) return -1;
			return 0;
		}
	}
	
	public static void main(String[] args) {
		List <String> giftList = new ArrayList<>();
		
		boolean answer = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Vuoi aggiungere un regalo alla tua lista? y/n  ");
		String proceed = sc.nextLine().toLowerCase();
		
		if(!proceed.equals("y") & !proceed.equals("n")) {
			System.out.println("Il valore inserito non è valido.");
		}
		
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
					for(String gift : giftList) {
						System.out.println(gift);
					}
				}
					
			}
			
			
			
			System.out.println("--------PART 2---------");
			
			System.out.print("Inserisci una parola: ");
			String word = sc.nextLine();
			
			Set <Character> wordsList = new HashSet<>();
			for(int x = 0; x < word.length(); x++) {
				wordsList.add(word.charAt(x));
			}
			
			System.out.println(wordsList);
			
			
			
			System.out.println("--------PART 3---------");
			
			System.out.print("Inserisci una parola: ");
			String wordMap = sc.nextLine();
			
			Map<Integer, Character> lettersMap = new HashMap<>();
			
			for (int x = 0; x < wordMap.length(); x++) {
				char wordChar = wordMap.charAt(x);
				lettersMap.put(x, wordChar);
			}
			
			System.out.println(lettersMap);
			
			sc.close();
			
		}
	}
}
