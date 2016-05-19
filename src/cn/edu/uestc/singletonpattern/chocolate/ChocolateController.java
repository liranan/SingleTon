/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.uestc.singletonpattern.chocolate;

/**
 *
 * @author Liranan
 */
public class ChocolateController {

    public static void main(String[] args) {
             
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println(boiler);
        boiler.fill();
        boiler.boil();
        boiler.drain();

        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println(boiler2);
    }
}
