package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        ArrayList<CustomPair> vragenLijst = new ArrayList<CustomPair>();
        vragenLijst.add();


        Scanner sc = new Scanner(System.in);
        String antwoord = sc.nextLine();

    }

    public class CustomPair {
        long key;
        String vraag;
        ArrayList<String> antwoordOpties = new ArrayList<String>();
        char correctAntwoord;

        public CustomPair(long aKey, String aVraag, anCorrectAntwoord) {
            key = aKey;
            vraag = aVraag;
            correctAntwoord = anAntwoord;
        }
    }
}


