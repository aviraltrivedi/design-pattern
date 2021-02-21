package strategyPattern.strategyPatternActionAdventureGamePg25.parentClass;

import strategyPattern.strategyPatternActionAdventureGamePg25.behaviourInterface.WeaponBehaviour;
import strategyPattern.strategyPatternActionAdventureGamePg25.exception.NoWeaponAssignedException;

public abstract class Hero {
    public WeaponBehaviour weaponBehaviour;

    public abstract void fight() throws NoWeaponAssignedException;

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public String getWeaponBehaviour() throws NoWeaponAssignedException {
        if(weaponBehaviour == null){
            throw new NoWeaponAssignedException();
        }else {
            return weaponBehaviour.useWeapon();
        }
    }
}
