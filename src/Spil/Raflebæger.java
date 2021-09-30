package com.company;

import Spil.Die;

public class Raflebæger
{
    private int terningValue;
    Die die1 = new Die();
    Die die2 = new Die();

    public Raflebæger()
    {
        terningValue = 0 ;
    }
    public int getShake()
    {
        terningValue = die1.roll()+die2.roll();
        return terningValue;
    }
}
