package strategyPattern.strategyPatternDuck;

import strategyPattern.strategyPatternDuck.childClass.MallardDuck;
import strategyPattern.strategyPatternDuck.childClass.RubberDuck;
import strategyPattern.strategyPatternDuck.parentClass.Duck;
import strategyPattern.strategyPatternDuck.quackBehaviour.Squeak;

public class MainStrategyPatternDuckSimulator {

    public static void main(String[] args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.setQuackBehaviour(new Squeak());
        System.out.println("Changing quack behaviour of Duck on the fly: ");
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.swim();
        mallardDuck.display();



        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.swim();
        rubberDuck.display();

    }
}
