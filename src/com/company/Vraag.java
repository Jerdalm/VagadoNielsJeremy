package com.company;

import java.util.ArrayList;

public class Vraag {
    public long key;
    public String vraag;
    public ArrayList<String> antwoordOpties = new ArrayList<String>();
    public String correctAntwoord;

    public Vraag(long aKey, String aVraag, ArrayList<String> antwoordOptiesList, String anCorrectAntwoord) {
        key = aKey;
        vraag = aVraag;
        antwoordOpties = antwoordOptiesList;
        correctAntwoord = anCorrectAntwoord;
    }
}
