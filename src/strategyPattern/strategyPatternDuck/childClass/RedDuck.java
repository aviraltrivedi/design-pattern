package strategyPattern.strategyPatternDuck.childClass;

import strategyPattern.strategyPatternDuck.flyBehaviour.FlyWithWings;
import strategyPattern.strategyPatternDuck.parentClass.Duck;
import strategyPattern.strategyPatternDuck.quackBehaviour.Quack;

public class RedDuck extends Duck {

    public RedDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Looks like RedDuck");
    }
}
