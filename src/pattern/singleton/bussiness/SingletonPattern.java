package pattern.singleton.bussiness;

public class SingletonPattern {

    private static SingletonPattern singletonPattern;

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        if(null == singletonPattern){
            singletonPattern = new SingletonPattern();
            return singletonPattern;
        }
        return singletonPattern;
    }

}
