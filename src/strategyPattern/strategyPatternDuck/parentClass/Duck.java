package strategyPattern.strategyPatternDuck.parentClass;

import strategyPattern.strategyPatternDuck.behaviourInterface.FlyBehaviour;
import strategyPattern.strategyPatternDuck.behaviourInterface.QuackBehaviour;

/**
 * All ducks quack and swim so superclass will take care of that
 */
public abstract class Duck {

    public FlyBehaviour flyBehaviour;
    public QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("Duck swims in water");
    }

    public void performFly(){
        flyBehaviour.fly();
    }
    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }

    abstract public void display();
}
