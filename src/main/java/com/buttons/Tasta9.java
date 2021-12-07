package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta9 implements IExecuta {
    private String name = "9";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
