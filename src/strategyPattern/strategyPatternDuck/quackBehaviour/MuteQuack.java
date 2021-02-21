package strategyPattern.strategyPatternDuck.quackBehaviour;

import strategyPattern.strategyPatternDuck.behaviourInterface.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Do nothing, can't quack");
    }
}
