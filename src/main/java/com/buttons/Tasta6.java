package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta6 implements IExecuta {
    private String name = "6";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
