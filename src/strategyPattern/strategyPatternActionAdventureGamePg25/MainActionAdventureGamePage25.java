package strategyPattern.strategyPatternActionAdventureGamePg25;

import strategyPattern.strategyPatternActionAdventureGamePg25.childClass.Knight;
import strategyPattern.strategyPatternActionAdventureGamePg25.childClass.Queen;
import strategyPattern.strategyPatternActionAdventureGamePg25.exception.NoWeaponAssignedException;
import strategyPattern.strategyPatternActionAdventureGamePg25.parentClass.Hero;
import strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour.AxeBehaviour;
import strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour.KnifeBehaviour;
import strategyPattern.strategyPatternActionAdventureGamePg25.weaponBehaviour.SwordBehaviour;

public class MainActionAdventureGamePage25 {

    public static void main(String[] args) throws NoWeaponAssignedException {
        Hero queen = new Queen();
        Hero knight = new Knight();

        queen.setWeaponBehaviour(new KnifeBehaviour());
        queen.fight();

        queen.setWeaponBehaviour(new AxeBehaviour());
        queen.fight();

        //if knight.setWeaponBehviour() is not done it will throw an Exception
        knight.setWeaponBehaviour(new SwordBehaviour());
        knight.fight();
    }

}
