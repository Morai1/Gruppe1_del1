package com.company;

import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    private static void getSum() {
        
    }
    public static void main(String[] args) {
	// write your code here
        //Vi skal have lavet en master/development branch
        // getSum():int metode skal laves

        // de to terninger
         {
        }

// de to spillere
int spiller1;
int spiller2;
// Besked til brugeren ved spillets start.
        System.out.println("Hej og velkommen. Reglerne er simple. Den spiller der først opnår 40 point eller derover vinder");

        // her er det meningen at randomizeren skal virke
 int terning1;
        terning1 = (int)(Math.random()*6+1);
 int terning2;
        terning2 = (int)(Math.random()*6+1);
 AtomicInteger sum = new AtomicInteger();
        sum.set(terning1 + terning2);

        // her plusses værdien af de to terninger og oplyses til spilleren
        System.out.println("Du slog = "+sum);


        ///her tillæges værdien af de to terninger og totalscoren og oplyses til spilleren
int Total = 0;
   Total= Total + terning1 + terning2;

        System.out.println("Din totale score er nu "+Total);


// find ud af hvordan man får spillet til at stoppe, når ens score er 40 eller derover
        // loop evt. while - while total<40 do...
        if (Total>40)
        System.out.println("Tillykke. Du har vundet spillet");




    }

     
}
