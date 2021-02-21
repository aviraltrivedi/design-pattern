package strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour;

import strategyPattern.strategyPatternActionAdventureGamePg25.behaviourInterface.WeaponBehaviour;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return ("Stab with knife");
    }
}
