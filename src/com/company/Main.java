package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        gameSystem M = new gameSystem();
        SpelerVragenLijst SP = new SpelerVragenLijst();
        int secondenInMinuut = 60;
        int millisecondenInSeconden = 100;
        long quizTijdBegin = System.currentTimeMillis();
        ArrayList<Vraag> vragenLijst = SP.setVragenLijst();
        for(int vraagNummer = 1; vraagNummer < 10; vraagNummer++) {
                M.showVraag(vragenLijst);
            Scanner sc = new Scanner(System.in);
                String inputAntwoord = sc.nextLine();
                System.out.println(inputAntwoord);
                M.inputCheck(inputAntwoord);
        }
        long quizTijdEind = System.currentTimeMillis();
        long besteeddeTijd = ((quizTijdEind - quizTijdBegin)/millisecondenInSeconden)/secondenInMinuut;
        System.out.println(besteeddeTijd);
        long bonusTotaal = M.berekenBonusPunten(besteeddeTijd);
        long behaaldTotaal = M.getPuntenAantal();
       Eindtotaal = bonusTotaal + behaaldTotaal;

        System.out.println("u heeft " + Eindtotaal + " behaald waarvan " + bonusTotaal +" bonuspunten");
    }
}


