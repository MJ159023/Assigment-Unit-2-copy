/*
 * The program runs part two of main
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

// File: MainPart2.java
import ConstantsPackage.*;

public class MainPart2 {
    /**
     * methdod runs main part 2.
     */
    public void runMain2() {
        Hare hare = new Hare(HARE_COLOR, HARE_NAME, INTIAL_SPEED,
                        HARE_INTIAL_HEALTH, HARE_DEFENSE, HARE_ATTACK_POWER,
                        HARE_ATTACK_ACCURACY, INTIAL_HEIGHT, FALL_DISTANCE,
                        SLIP_SPEED, HOP_HEIGHT, HARE_CLIMB_DISTANCE);

        Tortoise tortoise = new Tortoise(TORTOISE_COLOR, TORTOISE_NAME,
                        INTIAL_SPEED, TORTOISE_INTIAL_HEALTH, TORTOISE_DEFENSE,
                        TORTOISE_ATTACK_POWER, TORTOISE_ATTACK_ACCURACY,
                        INTIAL_HEIGHT, FALL_DISTANCE, STIFF_LIMB_DEBUFF,
                        SWIM_SPEED, DEFENSE_BONUS);

        Fox fox = new Fox(FOX_COLOR, FOX_NAME, INTIAL_SPEED, FOX_INTIAL_HEALTH,
                        FOX_DEFENSE, FOX_ATTACK_POWER, FOX_ATTACK_ACCURACY,
                        INTIAL_HEIGHT, FALL_DISTANCE, FOX_CLIMB_DISTANCE);

        Squirell squirell = new Squirell(SQUIRELL_COLOR, SQUIRELL_NAME,
                        INTIAL_SPEED, SQUIRELL_INTIAL_HEALTH, SQUIRELL_DEFENSE,
                        SQUIRELL_ATTACK_POWER, SQUIRELL_ATTACK_ACCURACY,
                        SQUIRELL_INTIAL_HEIGHT, FALL_DISTANCE,
                        SQUIRELL_CLIMB_DISTANCE, GLIDE_DISTANCE);

        System.out.println("While the " + tortoise.getName() + " protects the "
                        + hare.getName() + " the " + fox.getName() + " uses "
                        + "it's magic to heal the " + hare.getName() + ".");
        fox.specialAbility(hare.getName(), FOX_HEAL);

        System.out.println("The " + hare.getName() + " primes itself to jump "
                        + "and grab the trunk of the tree.");
        hare.specialMovement();

        System.out.println("The " + tortoise.getName() + " moves the last 20ft "
                        + "forward and tries to climb the tree with the "
                        + hare.getName() + ".");
        tortoise.climb();
        System.out.println("Meanwhile the " + hare.getName() + " tries to "
                        + "level the playing field with the "
                        + squirell.getName() + ".\nThe " + hare.getName()
                        + " throws their trusted boomerang at the "
                        + squirell.getName() + ".");
        squirell.setDamage(hare.basicAttack(hare.getAttackPower(),
                                hare.getAttackAccuracy(),
                                squirell.getDefense(), squirell.getName()));
        squirell.damageTaken();
        System.out.println("The " + squirell.getName() + " has "
                        + squirell.getHealth() + "hp left.\nThe "
                        + squirell.getName() + "tries to flee to safety, "
                        + "but before it can react the " + hare.getName());
        hare.climb();

        hare.specialMovement();
        hare.falling(FALL_DAMAGE_MULTIPLYER);
        hare.falling(FALL_DAMAGE_MULTIPLYER);
        System.out.println("The " + hare.getName() + " is 10ft above the "
                        + squirell.getName() + ".");
        squirell.setDamage(hare.specialAbility(squirell.getName(),
                                HARE_SPECIAL_DAMAGE));
        squirell.damageTaken();
        System.out.println("The " + squirell.getName() + " has "
                        + squirell.getHealth() + "hp left.");

        System.out.println("\n");

        System.out.println("The " + fox.getName() + " and the "
                                + tortoise.getName()
                                + " folow up with another attack.");
        fox.setAllyName(tortoise.getName());
        fox.setForcedMovement(TELEPORT_DISTANCE);
        fox.specialMovement();
        System.out.println("The " + tortoise.getName() + " now up in the tree "
                        + " a few ft from the " + squirell.getName() + ".");
        squirell.setDamage(tortoise.specialAbility(squirell.getName(),
                                TORTOISE_SPECIAL_DAMAGE));

        squirell.damageTaken();
        System.out.println("The " + squirell.getName() + " has "
                        + squirell.getHealth() + "hp left.");

        System.out.println("The " + squirell.getName() + " in one last "
                        + "desperate act the mades a run "
                        + "for their special acorn gautling gun.");

        squirell.accelerate(SQUIRELL_ACCELERATION_POWER,
                        SQUIRELL_ACCELERATION_TIME);

        System.out.println("As he travels he is unable to stop and crashes "
                        + "into the wall taking 5 damage and his momentum is "
                        + "lost by the impact.");
        squirell.setSpeed(0);
        squirell.setDamage(SQUIRELL_CRASH_DAMAGE);
        squirell.setHealth(squirell.getHealth() - squirell.getDamage());
        System.out.println("He then grabs the acorn gautling gun and points it"
                        + " at the trio!");

        // gaulting gun hits multiple enemies except for fox which is a spirit
        hare.setDamage(squirell.specialAbility(hare.getName(),
                                SQUIRELL_SPECIAL_DAMAGE));
        tortoise.setDamage(hare.getDamage());
        hare.damageTaken();
        tortoise.damageTaken();
        System.out.println("The acorns fired at the " + fox.getName()
                        + " travel right through it doing no damage.\nThe "
                        + hare.getName() + " has " + hare.getHealth()
                        + "hp left and the " + tortoise.getName() + " has "
                        + tortoise.getHealth() + "hp left.");

        System.out.println("\n");
        System.out.println("Depite the " + squirell.getName() + " best efforts"
                        + " the trio stands firm.\nThe he realizes he's "
                        + "lost, butinstead facing cruel end he fleas by "
                        + "jumping out of the tree.");
        squirell.specialMovement();
        System.out.println("As the " + squirell.getName() + " flees Jim's yard"
                        + " the trio celabrate and peace is restored.\nThe "
                        + "group takes back their stolen goods and "
                        + "after few months pass  the two "
                        + "keep their promise to the "
                        + fox.getName() + ".\nWith that being said this is the"
                        + " end of our trio's adventure but certainly not "
                        + "the end of of their story, but those tales "
                        + "are for another time so with that we end "
                        + "the story here.");

    } 
}

