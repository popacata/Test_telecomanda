import com.buttons.*;

import java.util.Scanner;

public class App {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Salut!!");
        System.out.println("\n" +"-----------" +
                "\n" +"|"+"On/Off   "+ "|"+
                "\n" +"|"+ " 1 " + " 2 " + " 3 " +"|"+
                "\n" +"|"+ " 4 " + " 5 " + " 6 " +"|"+
                "\n" +"|"+ " 7 " + " 8 " + " 9 " +"|"+
                "\n" +"|"+ "   " + " 0 " + "   " +"|"+
                "\n" +"|"+ " V+ " + "  " + "P+ " +"|"+
                "\n" +"|"+ " V- " + "  " + "P- " +"|"+
                "\n" +"-----------");
        System.out.println("Alege un BUTON:");


        OnOff onOff = new OnOff();
        Tasta0 tasta0 = new Tasta0();
        Tasta1 tasta1 = new Tasta1();
        Tasta2 tasta2 = new Tasta2();
        Tasta3 tasta3 = new Tasta3();
        Tasta4 tasta4 = new Tasta4();
        Tasta5 tasta5 = new Tasta5();
        Tasta6 tasta6 = new Tasta6();
        Tasta7 tasta7 = new Tasta7();
        Tasta8 tasta8 = new Tasta8();
        Tasta9 tasta9 = new Tasta9();

        Volum volum = new Volum();
        volum.adauga();
        volum.adauga();

        Program program = new Program();
        program.adauga();
        program.adauga();


        String button = scanner.nextLine() ;
        switch (button){
            case "0": tasta0.afiseaza();
                break;
            case "1": tasta1.afiseaza();
                break;
            case "2": tasta2.afiseaza();
                break;
            case "3": tasta3.afiseaza();
                break;
            case "4": tasta4.afiseaza();
                break;
            case "5": tasta5.afiseaza();
                break;
            case "6": tasta6.afiseaza();
                break;
            case "7": tasta7.afiseaza();
                break;
            case "8": tasta8.afiseaza();
                break;
            case "9": tasta9.afiseaza();
                break;
            case "P-": program.scade();
                break;
            case "P+": program.adauga();
                break;
            case "V-": volum.scade();
                break;
            case "V+": volum.adauga();
                break;
            case "on/off": onOff.afiseaza();
                break;
            default:
                System.out.println("Nu exista aceasta tasta!");
        }

        scanner.close();




    }
}
