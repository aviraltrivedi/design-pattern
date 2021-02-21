package strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour;

import strategyPattern.strategyPatternActionAdventureGamePg25.behaviourInterface.WeaponBehaviour;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return ("Cut with sword");
    }
}
