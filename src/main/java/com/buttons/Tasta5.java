package com.buttons;

import com.buttons.interfete.IExecuta;

public class Tasta5 implements IExecuta {
    private String name = "5";



    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
