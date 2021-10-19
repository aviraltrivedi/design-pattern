package pattern.singleton;

import pattern.singleton.bussiness.SingletonPattern;

public class MainSingleton {



    public static void main(String[] args){
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
       // singletonPattern.getI();

        System.out.println(singletonPattern);

        singletonPattern = SingletonPattern.getInstance();
        System.out.println(singletonPattern);
    }
}
