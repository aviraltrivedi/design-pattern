package strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour;

import strategyPattern.strategyPatternActionAdventureGamePg25.behaviourInterface.WeaponBehaviour;

public class AxeBehaviour implements WeaponBehaviour {

    @Override
    public String useWeapon() {
        return ("Chop with Axe");
    }
}
