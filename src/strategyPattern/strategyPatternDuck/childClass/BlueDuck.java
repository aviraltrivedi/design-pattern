package strategyPattern.strategyPatternDuck.childClass;

import strategyPattern.strategyPatternDuck.parentClass.Duck;

public class BlueDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Looks like BlueDuck");
    }
}
