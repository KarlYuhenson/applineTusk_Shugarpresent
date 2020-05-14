package com.appline;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main ( String[] args ) throws IOException {
        ArrayList < Sweets > sweets = new ArrayList <> ( );
        boolean formed = false;
        int totalPrice = 0;
        int totalWeight = 0;
        BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) );
        System.out.println ( "Нажмите номер пункта, чтобы добавить продукт в подарок:" );
        System.out.println ( "'1' - шоколад \"Snikers\"" );
        System.out.println ( "'2' - шоколад \"Mars\"" );
        System.out.println ( "'3' - конфеты \"Rafaello\"" );
        System.out.println ( "'4' - конфеты \"Bear in the North\"" );
        System.out.println ( "'5' - печенье \"Yubileinor\"" );
        System.out.println ( "'6' - печенье \"Ovsyannoe\"" );
        System.out.println ( "'0' - закончить выбор" );

        while ( ! formed ) {
            String choice = reader.readLine ( );
            switch ( choice ) {
                case "1":
                    Chocolate snikers = new Chocolate ( "Snikers" , 50 , 70 , "have nuts" );
                    sweets.add ( snikers );
                    totalPrice += snikers.getPrice ( );
                    totalWeight += snikers.getWeight ( );
                    System.out.println ( "шоколад \"Snikers\" добавлен в подарок" );
                    break;
                case "2":
                    Chocolate mars = new Chocolate ( "Mars" , 50 , 70 , "not nuts" );
                    sweets.add ( mars );
                    totalPrice += mars.getPrice ( );
                    totalWeight += mars.getWeight ( );
                    System.out.println ( "шоколад \"Mars\" добавлен в подарок" );
                    break;
                case "3":
                    Cundy rafaello = new Cundy ( "Rafaello" , 100 , 200 , "have nuts" );
                    sweets.add ( rafaello );
                    totalPrice += rafaello.getPrice ( );
                    totalWeight += rafaello.getWeight ( );
                    System.out.println ( "конфеты \"Rafaello\" добавлены в подарок" );
                    break;
                case "4":
                    Cundy bearInTheNorth = new Cundy ( "Bear in the North" , 100 , 150 , "not nuts" );
                    sweets.add ( bearInTheNorth );
                    totalPrice += bearInTheNorth.getPrice ( );
                    totalWeight += bearInTheNorth.getWeight ( );
                    System.out.println ( "конфеты \"Bear in the North\" добавлены в подарок" );
                    break;
                case "5":
                    Ckoocki yubileinoe = new Ckoocki ( "Yubileinor" , 200 , 100 , "not nuts" );
                    sweets.add ( yubileinoe );
                    totalPrice += yubileinoe.getPrice ( );
                    totalWeight += yubileinoe.getWeight ( );
                    System.out.println ( "печенье \"Yubileinor\" добавлено в подарок" );
                case "6":
                    Ckoocki ovsyannoe = new Ckoocki ( "Ovsyannoe" , 200 , 100 , "have nuts" );
                    sweets.add ( ovsyannoe );
                    totalPrice += ovsyannoe.getPrice ( );
                    totalWeight += ovsyannoe.getWeight ( );
                    System.out.println ( "печенье \"Ovsyannoe\" добавлено в подарок" );
                    break;
                case "0":
                    formed = true;
                    break;
            }

            }
        int count = 0;
        System.out.println("\nПодарок состоит из:");
        for (Sweets sweet:sweets) {
            count++;
            System.out.println(count + ". " + sweet.getName() + " - " + sweet.getUniqueParameter ());
        }
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));
    }

}

