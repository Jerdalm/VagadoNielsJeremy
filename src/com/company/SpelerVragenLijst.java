package com.company;

import java.util.ArrayList;

public class SpelerVragenLijst {

    public ArrayList<Vraag> setVragenLijst(){
        ArrayList<String> antwoordOpties = new ArrayList<String>();
        antwoordOpties.add("A. een knakworst");
        antwoordOpties.add("B. een boterham");
        antwoordOpties.add("C. een salade");
        antwoordOpties.add("D. een ijsje");

        ArrayList<Vraag> vragenLijst = new ArrayList<Vraag>();
        vragenLijst.add(new Vraag(1, "Wat hiervan kun je eten?", antwoordOpties, "a"));
        vragenLijst.add(new Vraag(2, "Wat hiervan kun je gooien?", antwoordOpties, "b"));
        vragenLijst.add(new Vraag(3, "Wat hiervan kun je zien?", antwoordOpties, "c"));
        vragenLijst.add(new Vraag(4, "Wat hiervan kun je delen?", antwoordOpties, "d"));
        vragenLijst.add(new Vraag(5, "Wat hiervan kun je meenemen naar werk?", antwoordOpties, "a"));
        vragenLijst.add(new Vraag(6, "Wat hiervan kun je aan je hond geven?", antwoordOpties, "b"));
        return vragenLijst;
    }
}
