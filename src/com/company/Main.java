package com.company;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> colors = new ArrayList<String>();
	colors.add("green");
	colors.add("blue");
	colors.add("yellow");
	System.out.println(colors);
	System.out.println(colors.get(1));

	String new_color = "";
	String choice = "";
	Boolean continue_loop = true;

	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter a new color: ");
	new_color = scanner.next();
	colors.add(new_color);

	System.out.println(colors);

	System.out.println("Continue or To quit press q/Q or type quit/Quit");
	choice = scanner.next();

	do {



		if (choice.equalsIgnoreCase("q") ||
				choice.equalsIgnoreCase("quit")) {
			continue_loop = false;
		}

	    else if (!(choice.equalsIgnoreCase("q")) &&
			 !(choice.equalsIgnoreCase("quit"))) {
			continue_loop = true;
			System.out.println("Enter a new color: ");
			new_color = scanner.next();
			colors.add(new_color);
			System.out.println("Continue or To quit press q/Q or type quit/Quit");
			choice = scanner.next();
		}
	} while (continue_loop);


		System.out.println(colors);
    }
}
