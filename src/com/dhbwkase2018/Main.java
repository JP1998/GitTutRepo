package com.dhbwkase2018;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Geben Sie uns Ihren Namen (indem Sie Enter drücken willigen Sie unseren Datenschutzbestimmungen zu): ");
	String name = input.nextLine();

	if (name.equals("Daniel")) {
            System.out.println("Hallo Daniel!");
	} else if (name.equals("Jean-Pierre")) {
            System.out.println("Hallo Jean-Pierre!");
        }
        
        System.out.println("Tschüss " + name + " :)");
    }
    
}
