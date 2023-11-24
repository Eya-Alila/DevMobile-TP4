package com.example.eya_alila_mesure_glycemie.model;

public class Patient {
    private int Age;
    private float Valeur;
    private boolean bouton;
    private String Result;

    //Update Controller --> Model

    public Patient(int age, boolean bouton, float valeur) {
        Age = age;
        Valeur = valeur;
        this.bouton = bouton;
        calculer(); //calcul du resultat
    }
    public int getAge() {
        return Age;
    }

    public float getValeur() {
        return Valeur;
    }

    public boolean isBouton() {
        return bouton;
    }
    // Notify Model --> Controller
    public String getResult() {
        return Result;
    }
    private void calculer()
    {
        if (bouton)
            if(Age>=13)
                if(Valeur<5.0)
                    Result="Le niveau de glycémie est bas";
                else if(Valeur>=5.0 && Valeur<=7.2)
                    Result="Le niveau de glycémie est normal";
                else
                    Result="Le niveau de glycémie est élevé";
            else if(Age>=6)
                if(Valeur<5.0)
                    Result="Le niveau de glycémie est bas";
                else if(Valeur>=5.0 && Valeur<=10.0)
                    Result="Le niveau de glycémie est normal";
                else
                    Result="Le niveau de glycémie est élevé";
            else
            if(Valeur<5.5)
                Result="Le niveau de glycémie est bas";
            else if(Valeur>=5.5 && Valeur<=10.0)
                Result="Le niveau de glycémie est normal";
            else
                Result="Le niveau de glycémie est élevé";
        else
        if(Valeur<=10.5)
            Result="Le niveau de glycémie est normal";
        else
            Result="Le niveau de glycémie est élevé";
    }
}