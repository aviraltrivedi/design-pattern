package strategyPattern.strategyPatternDuck.flyBehaviour;

import strategyPattern.strategyPatternDuck.behaviourInterface.FlyBehaviour;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("This Duck can flies");
    }
}
