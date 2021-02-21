package strategyPattern.strategyPatternDuck.quackBehaviour;

import strategyPattern.strategyPatternDuck.behaviourInterface.QuackBehaviour;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Fake duck, squeak");
    }
}
