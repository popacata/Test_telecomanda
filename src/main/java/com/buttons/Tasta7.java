package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta7 implements IExecuta {
    private String name = "7";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
