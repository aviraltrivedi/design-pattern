package strategyPattern.strategyPatternDuck.quackBehaviour;

import strategyPattern.strategyPatternDuck.behaviourInterface.QuackBehaviour;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Duck can quack");
    }
}
