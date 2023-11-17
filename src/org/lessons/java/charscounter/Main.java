package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		do {
			
			System.out.println("dammi una parola:");
			String word = in.nextLine();
			
			Map<Character, Integer> charFreq = new HashMap<>();
			
			for(Character c : word.toLowerCase().toCharArray()) {
				
				if (charFreq.containsKey(c)) {
					
					charFreq.put(c, charFreq.get(c) + 1);
					
				} 
				
				else {
					
					charFreq.put(c, 1);
				}
				
			}
			
			System.out.println(charFreq + "\n----------");
			
			System.out.println("vuoi provare ancora? (y/n)");
			
			String choice = in.nextLine();
			
			if(choice.equals("y")) continue;
			else if(choice.equals("n")) break;
			
		} while (true);
		
		in.close();
		System.out.println("fine");
		
	}

}
