package strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour;

import strategyPattern.strategyPatternActionAdventureGamePg25.behaviourInterface.WeaponBehaviour;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return ("Shoots an arrow with bow");
    }
}
