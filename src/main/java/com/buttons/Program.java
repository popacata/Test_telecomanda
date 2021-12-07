package com.buttons;

import com.buttons.interfete.Sens;

public class Program implements Sens {
    private int pozitieCanal = 0;


    @Override
    public void adauga() {
        if (pozitieCanal<50){
            pozitieCanal++;
        }
        System.out.println("Pozitia canalul TV este " + pozitieCanal);
    }

    @Override
    public void scade() {
        if (pozitieCanal>0){
            pozitieCanal--;
        }
        System.out.println("Pozitia canalul TV este " + pozitieCanal);
    }
}
