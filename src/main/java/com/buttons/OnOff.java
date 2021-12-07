package com.buttons;

import com.buttons.interfete.IExecuta;

public class OnOff implements IExecuta {
    private String name ="On/Off";

    @Override
    public void afiseaza() {
        System.out.println("Tasta aleasa este "+ name);
    }
}
