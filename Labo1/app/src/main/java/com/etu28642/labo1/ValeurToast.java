package com.etu28642.labo1;

/**
 * Created by etu28642 on 28-09-16.
 */
public class ValeurToast extends android.app.Application
{
    private int valeur;

    @Override
    public void onCreate()
    {
        super.onCreate();
        valeur = 100;
    }

    public int getValeur()
    {
        return valeur;
    }
}
