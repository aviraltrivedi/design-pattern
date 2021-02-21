package strategyPattern.strategyPatternActionAdventureGamePg25.childClass;

import strategyPattern.strategyPatternActionAdventureGamePg25.exception.NoWeaponAssignedException;
import strategyPattern.strategyPatternActionAdventureGamePg25.parentClass.Hero;

public class Queen extends Hero {

    @Override
    public void fight() throws NoWeaponAssignedException {
        System.out.println("I am a queen: " + getWeaponBehaviour());
    }
}
