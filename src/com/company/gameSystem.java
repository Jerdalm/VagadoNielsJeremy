package com.company;
import java.util.Random;
import java.util.ArrayList;

public class gameSystem {
    Vraag huidigeVraag;
    long puntenAantal;

    public long getPuntenAantal(){
        return puntenAantal;
    }

    public void showVraag(ArrayList<Vraag> vragenLijst){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(6);
       huidigeVraag = vragenLijst.get(rand_int1);
        int antwoordNo = 0;
        System.out.println(vragenLijst.get(rand_int1).vraag);
        for(int antwoordAantal = 0; antwoordAantal < 4; ++antwoordAantal) {
            System.out.println(vragenLijst.get(rand_int1).antwoordOpties.get(antwoordNo));
            ++antwoordNo;
        }
    }
    public void inputCheck(String gegevenAntwoord){
        String controleAntwoord = huidigeVraag.correctAntwoord;
        boolean correctGeantwoord = gegevenAntwoord.equals(controleAntwoord);
    if(correctGeantwoord){
        ++puntenAantal;
        }
    }
}
