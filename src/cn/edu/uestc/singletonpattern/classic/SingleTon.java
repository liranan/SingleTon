/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.uestc.singletonpattern.classic;

/**
 *
 * @author Liranan
 * this is not thread safe!
 */
public class SingleTon {
    private static SingleTon uniqueInstance;
    
    private SingleTon() {}
    
    public static SingleTon getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingleTon();
        }
        return uniqueInstance;
    }
}
