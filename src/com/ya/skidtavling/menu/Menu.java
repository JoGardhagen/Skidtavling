package com.ya.skidtavling.menu;
import java.util.Scanner;

import com.ya.skidtavling.main.PrintMenu;


public class Menu {
	
	boolean quit;
	
	public void runMenu() {
		PrintMenu.printWelcomeBox();
		
		while(!quit) {
			PrintMenu.printMenu();
			int userChoice = getInput();		// getInput ny metod f�r att behandla anv�ndarens input 
			switchMenu(userChoice);
			
		}
	}
	private int getInput() {
		Scanner scan = new Scanner(System.in);
		int userChoice = -1;					// index p� -1 s� while loopen inte evighetsloopar
		while(userChoice < 0 || userChoice > 6) {		// Satte val 0 ifall anv�ndaren r�kar s� f�r den ett meddelande
			try {
				System.out.print("\nSkriv en siffra: ");
				userChoice = Integer.parseInt(scan.nextLine());
			}
			catch (NumberFormatException e) {
				System.out.println("F�rs�k igen");		
			}
			
		}
		return userChoice;
	}
	
	public void switchMenu(int userChoice) {
	
		
		switch (userChoice) {			// 
		case 0:
			System.out.println("Det h�r var inget val ajabaja");
			break;
		case 1:
			System.out.println("lalala");
//			Time();			//Min eclipse bugga ur s� h�r tar jag en paus
			break;
		case 2:
			System.out.println("n�got annat");
			break;
		case 3:
			System.out.println("blablabla");
			break;
		case 4:
			System.out.println("hej hej hej");
			break;
		case 5:
			System.out.println("liilili");
			break;
		case 6:
			System.out.println("BYE\n");
			quit = true;
			break;
		default:
			System.out.println("N�got gick snett");
		}
	}
}