package com.company;

public class methode_2 implements BonusPunten{

    @Override
    public long berekenPunten(long tijd) {
        return 50-tijd;
    }
}
