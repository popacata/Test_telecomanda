package com.buttons;

import com.buttons.interfete.Sens;

public class Volum implements Sens {
    private int valoare = 0;


    @Override
    public void adauga() {
        if (valoare<100){
            valoare++;
        }
        System.out.println("Volumul este la valoarea " +valoare);
    }

    @Override
    public void scade() {
        if (valoare>0){
            valoare--;
        }
        System.out.println("Volumul este la valoarea " +valoare);
    }
}
