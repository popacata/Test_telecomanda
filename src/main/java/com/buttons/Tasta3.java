package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta3 implements IExecuta {
    private String name = "3";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
