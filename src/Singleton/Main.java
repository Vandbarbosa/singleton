package Singleton;

import Iphone.Iphone;

public class Main {
    public static void main(String[] args) {
        SingletonIphone sigleton = SingletonIphone.getInstance(new Iphone());
        sigleton.iphone.ligar("123456");
    }
}
