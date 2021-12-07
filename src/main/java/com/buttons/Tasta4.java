package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta4 implements IExecuta {
    private String name = "4";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
