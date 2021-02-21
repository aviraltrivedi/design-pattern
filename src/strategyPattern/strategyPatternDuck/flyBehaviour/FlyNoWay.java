package strategyPattern.strategyPatternDuck.flyBehaviour;

import strategyPattern.strategyPatternDuck.behaviourInterface.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour {

    public void fly(){
        System.out.println("No wings, can't fly");
    }
}
