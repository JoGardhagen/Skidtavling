package com.ya.skidtavling.menu;

import com.ya.skidtavling.deltagare.Participants;
import com.ya.skidtavling.simulering.Simulator;
import com.ya.skidtavling.tavla.TavlingsTavla;

public class MenuManager {
	
	public static void switchMenu(int userChoice, TavlingsTavla tagare) throws InterruptedException {
	
		
		switch (userChoice) {			// 
		case 0:
			System.out.println("Det h�r var inget val ajabaja");
			break;
		case 1:
			System.out.println("Fyll T�vlingstavla");
			tagare.fill();			//Min eclipse bugga ur s� h�r tar jag en paus
			break;
		case 2:
			System.out.println("Skriv ut T�vlingstavla");
			tagare.printList();
			break;
		case 3:
			System.out.println("S�k en Deltagare");

		//	System.out.println(tagare.printOne(getInput2()));
			break;
		case 4:
			System.out.println("Sim Demo Ish");
			//tagare.Race();
			tagare.race();
			break;
		case 5:
			System.out.println("liilili");
			break;
		case 6:
			System.out.println("BYE\n");
			PrintMenu.printByeByeBox();
			//quit = true;
			break;
		default:
			System.out.println("N�got gick snett");
		}
	}

	
	
}