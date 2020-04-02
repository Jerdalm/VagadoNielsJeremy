package com.company;
import java.lang.Math;

public class methode_1 implements BonusPunten{

    @Override
    public long berekenPunten(long tijd) {
       return (long) (10*(1/Math.log(tijd)));
    }
}
