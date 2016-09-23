/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import java.lang.String;

/**
 *
 * @author kbwschuler
 */
public class Nim {

    int reihe1 = (int) ((Math.random() * 5) + 1);
    int reihe2 = (int) ((Math.random() * 5) + 1);
    int reihe3 = (int) ((Math.random() * 5) + 1);

    int reihe1binaer = 0;
    int reihe2binaer = 0;
    int reihe3binaer = 0;
    
    private void spiel() {

        while (!(reihe1 == 0 && reihe2 == 0 && reihe3 == 0)) {
            
            
            
            //******************************************************************************Streichhoelzer ausgeben:
            for (int i = 0; reihe1 > i; i++) {
                System.out.print("i");

            }

            System.out.println("");
            for (int i = 0; reihe2 > i; i++) {
                System.out.print("i");

            }

            System.out.println("");
            for (int i = 0; reihe3 > i; i++) {
                System.out.print("i");

            }
            
            //**********************************************************************************eingabe des nutzers
            System.out.println("");
            System.err.println("Geben Sie die Reihe und die Anzahl Streichhölzer ein, die Sie wegnehmen wollen(z.B. Reihenzahl, Anzahl)");
            Scanner scan = new Scanner(System.in);
            String[] a = scan.nextLine().split(", ");
            int zeile = Integer.parseInt(a[0]);
            int anzahl = Integer.parseInt(a[1]);

            // ********************************************************************************nutzer nimmt weg
            if (zeile == 1) {
                if (reihe1 != 0) {
                    reihe1 = reihe1 - anzahl;

                } else {
                    System.out.println("Diese Reihe ist leer");
                }
                /**
                 * *****************************************
                 */
            } else if (zeile == 2) {
                if (reihe2 != 0) {
                    reihe2 = reihe2 - anzahl;

                } else {
                    System.out.println("Diese Reihe ist leer");
                }

            } /**
             * ******************************************************************
             */
            else if (zeile == 3) {
                if (reihe3 != 0) {
                    reihe3 = reihe3 - anzahl;

                } else {
                    System.out.println("Diese Reihe ist leer");
                }

            } /**
             * ********************************************************************
             */
            else {
                System.out.println("Diese Zeile existiert nicht, sie haben verloren.");
            }

            //******************************************************************************Streichhoelzer ausgeben:
            for (int i = 0; reihe1 > i; i++) {
                System.out.print("i");

            }

            System.out.println("");
            for (int i = 0; reihe2 > i; i++) {
                System.out.print("i");

            }

            System.out.println("");
            for (int i = 0; reihe3 > i; i++) {
                System.out.print("i");

            }
            
            //*********************************************************************************anzahl in binaer aendern und einzelne ziffern
            
            
            if(reihe1 != 0){
                reihe1binaer = Integer.parseInt(Integer.toBinaryString(reihe1));
            }
            if(reihe2 != 0){
                reihe2binaer = Integer.parseInt(Integer.toBinaryString(reihe2));
            }
            if(reihe3 != 0){
                reihe3binaer = Integer.parseInt(Integer.toBinaryString(reihe3));
            }
            

            String binaeraufteil1 = String.valueOf(reihe1binaer);
            int[] aufgeteilt1 = new int[binaeraufteil1.length()];
            for (int i = 0; i < aufgeteilt1.length; i++) {
                aufgeteilt1[i] = Integer.parseInt(String.valueOf(binaeraufteil1.charAt(i)));
            }
            String binaeraufteil2 = String.valueOf(reihe2binaer);
            int[] aufgeteilt2 = new int[binaeraufteil2.length()];
            for (int i = 0; i < aufgeteilt2.length; i++) {
                aufgeteilt2[i] = Integer.parseInt(String.valueOf(binaeraufteil2.charAt(i)));
            }
            String binaeraufteil3 = String.valueOf(reihe3binaer);
            int[] aufgeteilt3 = new int[binaeraufteil3.length()];
            for (int i = 0; i < aufgeteilt3.length; i++) {
                aufgeteilt3[i] = Integer.parseInt(String.valueOf(binaeraufteil3.charAt(i)));
            }

            //***********************************************************************************Computer am zug

            for (int m = 0; m < aufgeteilt1.length; m++) {
                System.out.println(aufgeteilt1[m]);
            }
            for (int m = 0; m < aufgeteilt2.length; m++) {
                System.out.println(aufgeteilt2[m]);
            }
            for (int m = 0; m < aufgeteilt3.length; m++) {
                System.out.println(aufgeteilt3[m]);
            }
            
            int summe1 = 0;
            int summe2 = 0;
            int summe3 = 0;
            if(aufgeteilt3.length == 3 && aufgeteilt2.length == 3 && aufgeteilt1.length == 3){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt1[1] + aufgeteilt2[1] + aufgeteilt3[1];
                summe3 = aufgeteilt1[2] + aufgeteilt2[2] + aufgeteilt3[2];
            }
            //*******************************************************************************************************nur fuer aufgeteilt3
            
            else if(aufgeteilt3.length == 2 && aufgeteilt2.length == 3 && aufgeteilt1.length == 3){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt1[1] + aufgeteilt2[1] + aufgeteilt3[1];
                summe3 = aufgeteilt1[2] + aufgeteilt2[2];
            }
            else if(aufgeteilt3.length == 1 && aufgeteilt2.length == 3 && aufgeteilt1.length == 3){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt1[1] + aufgeteilt2[1];
                summe3 = aufgeteilt1[2] + aufgeteilt2[2];
            }
            
            //*******************************************************************************************************nur fuer aufgeteilt2
           
            else if(aufgeteilt3.length == 3 && aufgeteilt2.length == 2 && aufgeteilt1.length == 3){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt1[1] + aufgeteilt2[1] + aufgeteilt3[1];
                summe3 = aufgeteilt1[2] + aufgeteilt3[2];
            }
            else if(aufgeteilt3.length == 3 && aufgeteilt2.length == 1 && aufgeteilt1.length == 3){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt1[1] + aufgeteilt3[1];
                summe3 = aufgeteilt1[2] + aufgeteilt3[2];
            }
            
            //*******************************************************************************************************nur fuer aufgeteilt1
            
            else if(aufgeteilt3.length == 3 && aufgeteilt2.length == 3 && aufgeteilt1.length == 2){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt1[1] + aufgeteilt2[1] + aufgeteilt3[1];
                summe3 = aufgeteilt1[2] + aufgeteilt2[2];
            }
            else if(aufgeteilt3.length == 3 && aufgeteilt2.length == 3 && aufgeteilt1.length == 1){
                summe1 = aufgeteilt1[0] + aufgeteilt2[0] + aufgeteilt3[0];
                summe2 = aufgeteilt3[1] + aufgeteilt2[1];
                summe3 = aufgeteilt3[2] + aufgeteilt2[2];
            }
            
           

            if (summe1 % 2 != 0) {
                reihe1 = reihe1 - 1;
            } else if (summe2 % 2 != 0) {
                reihe2 = reihe2 - 1;
            } else if (summe3 % 2 != 0) {
                reihe3 = reihe3 - 1;
            } else {
                int zufallsreihe = (int) ((Math.random() * 3) + 1);
                if (zufallsreihe == 1) {
                    reihe1 = reihe1 - 2;
                } else if (zufallsreihe == 2) {
                    reihe2 = reihe2 - 2;
                } else if (zufallsreihe == 3) {
                    reihe3 = reihe3 - 2;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Nim beginn = new Nim();

        beginn.spiel();

    }

}
