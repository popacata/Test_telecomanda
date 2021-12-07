package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta8 implements IExecuta {
    private String name = "8";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
