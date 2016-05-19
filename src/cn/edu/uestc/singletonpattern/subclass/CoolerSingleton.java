/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.uestc.singletonpattern.subclass;

/**
 *
 * @author Liranan
 */
public class CoolerSingleton extends Singleton {

    protected static Singleton uniqueInstance;

    private CoolerSingleton() {
        super();
    }
}
