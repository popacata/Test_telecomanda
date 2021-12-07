package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta1 implements IExecuta {
    private String name = "1";


    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
