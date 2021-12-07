package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta2 implements IExecuta {
    private String name = "2";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
