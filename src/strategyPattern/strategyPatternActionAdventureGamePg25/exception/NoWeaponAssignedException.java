package strategyPattern.strategyPatternActionAdventureGamePg25.exception;

/**
 * If weapon is not assigned to a Hero it will throw a NoWeaponAssignedException
 */
public class NoWeaponAssignedException extends Exception {
    public NoWeaponAssignedException(){
        System.out.println("No weapon assigned");
    }
}
