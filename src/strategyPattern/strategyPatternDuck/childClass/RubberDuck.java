package strategyPattern.strategyPatternDuck.childClass;

import strategyPattern.strategyPatternDuck.flyBehaviour.FlyNoWay;
import strategyPattern.strategyPatternDuck.parentClass.Duck;
import strategyPattern.strategyPatternDuck.quackBehaviour.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Looks like RubberDuck");
    }
}
