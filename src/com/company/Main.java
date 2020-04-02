package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        gameSystem M = new gameSystem();
        SpelerVragenLijst SP = new SpelerVragenLijst();
        long Eindtotaal;
        ArrayList<Vraag> vragenLijst = SP.setVragenLijst();
        for(int vraagNummer = 1; vraagNummer < 10; vraagNummer++) {
                M.showVraag(vragenLijst);
            Scanner sc = new Scanner(System.in);
                String inputAntwoord = sc.nextLine();
                System.out.println(inputAntwoord);
                M.inputCheck(inputAntwoord);
        }
       Eindtotaal = M.getPuntenAantal();
        System.out.println("u heeft " + Eindtotaal + " behaald");
    }
}


