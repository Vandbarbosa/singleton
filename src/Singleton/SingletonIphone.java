package Singleton;

import Iphone.Iphone;

public class SingletonIphone{
    private static SingletonIphone instance;
    public Iphone iphone;

    private SingletonIphone(Iphone iphone){
        this.iphone = iphone;
    }

    public static SingletonIphone  getInstance(Iphone iphone){
        if (instance == null){
            instance = new SingletonIphone(iphone);
        }
        return instance;
    }
}