package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta0 implements IExecuta {
    private String name = "0";



    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
