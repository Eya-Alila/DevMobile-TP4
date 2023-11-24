package com.example.eya_alila_mesure_glycemie.controller;

import com.example.eya_alila_mesure_glycemie.model.Patient;

public class Controller {
    private static Patient patient;
    private static Controller instance = null;
    //User Action
    private Controller()
    { super();}

    public static final Controller getInstance()
    {
        if(Controller.instance == null)
            Controller.instance=new Controller();
        return Controller.instance;
    }
    public void createPatient  (int age, boolean bouton, float valeur) //User action View --> Controller (age,valeur,bouton)
    {
        //Update Controller --> Model
        patient=new Patient(age, bouton, valeur);
    }
    //Notify Controller --> View
    public String getresult()
    {
        return patient.getResult(); //Notify Model --> Controller
    }
}

















































