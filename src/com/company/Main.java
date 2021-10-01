package com.company;
import java.util.Scanner;
public class Main {
    private static void getSum() {
        
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
// Besked til brugeren ved spillets start.
        System.out.println("Hej og velkommen. Reglerne er simple. Den spiller der først opnår 40 point eller derover vinder");

        // her er det meningen at randomizeren skal virke
 int terning1;
        terning1 = (int)(Math.random()*6+1);
 int terning2;
        terning2 = (int)(Math.random()*6+1);
        int sum = 0;

        sum = (terning1 + terning2);

        // her plusses værdien af de to terninger og oplyses til spilleren
        System.out.println("Du slog = "+sum);

        ///her tillæges værdien af de to terninger og totalscoren og oplyses til spilleren
final int Total = 40;
   Total= Total + terning1 + terning2;
boolean VinderScore = false;
while VinderScore == false){
            System.out.println("Din totale score er nu " + Total);

// find ud af hvordan man får spillet til at stoppe, når ens score er 40 eller derover
            // loop evt. while - while total<40 do...
            if (Total > 40){
                System.out.println("Tillykke. Du har vundet spillet");
        }else{
            


    }

     
}
