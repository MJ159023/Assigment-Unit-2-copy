/*
 * The program runs part two of main
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

// gets constant package
import ConstantsPackage.Constants;

public class MainPart2 {
    /**
     * method runs main part 2.
     */
    public void runMain2() {
        Hare hare = new Hare(Constants.HARE_COLOR, Constants.HARE_NAME,
                        Constants.HARE_INTIAL_HEALTH, Constants.HARE_DEFENSE,
                        Constants.SLIP_SPEED, Constants.HOP_HEIGHT,
                        Constants.HARE_CLIMB_DISTANCE);
        hare.setSpeed(Constants.INTIAL_SPEED);
        hare.setHeight(Constants.INTIAL_HEIGHT);
        hare.setFallDistance(Constants.FALL_DISTANCE);
        hare.setAttackPower(Constants.HARE_ATTACK_POWER);
        hare.setAttackAccuracy(Constants.HARE_ATTACK_ACCURACY);

        Tortoise tortoise = new Tortoise(Constants.TORTOISE_COLOR,
                        Constants.TORTOISE_NAME,
                        Constants.TORTOISE_INTIAL_HEALTH,
                        Constants.TORTOISE_DEFENSE,
                        Constants.STIFF_LIMB_DEBUFF, Constants.SWIM_SPEED,
                        Constants.DEFENSE_BONUS);
        tortoise.setSpeed(Constants.INTIAL_SPEED);
        tortoise.setHeight(Constants.INTIAL_HEIGHT);
        tortoise.setFallDistance(Constants.FALL_DISTANCE);
        tortoise.setAttackPower(Constants.TORTOISE_ATTACK_POWER);
        tortoise.setAttackAccuracy(Constants.TORTOISE_ATTACK_ACCURACY);

        Fox fox = new Fox(Constants.FOX_COLOR, Constants.FOX_NAME,
                        Constants.FOX_INTIAL_HEALTH, Constants.FOX_DEFENSE,
                        Constants.FOX_CLIMB_DISTANCE);
        fox.setSpeed(Constants.INTIAL_SPEED);
        fox.setHeight(Constants.INTIAL_HEIGHT);
        fox.setFallDistance(Constants.FALL_DISTANCE);
        fox.setAttackPower(Constants.FOX_ATTACK_POWER);
        fox.setAttackAccuracy(Constants.FOX_ATTACK_ACCURACY);

        Squirrel squirrel = new Squirrel(Constants.SQUIRREL_COLOR,
                        Constants.SQUIRREL_NAME,
                        Constants.SQUIRREL_INTIAL_HEALTH,
                        Constants.SQUIRREL_DEFENSE,
                        Constants.SQUIRREL_CLIMB_DISTANCE,
                        Constants.GLIDE_DISTANCE);
        squirrel.setSpeed(Constants.INTIAL_SPEED);
        squirrel.setHeight(Constants.SQUIRREL_INTIAL_HEIGHT);
        squirrel.setFallDistance(Constants.FALL_DISTANCE);
        squirrel.setAttackPower(Constants.SQUIRREL_ATTACK_POWER);
        squirrel.setAttackAccuracy(Constants.SQUIRREL_ATTACK_ACCURACY);

        tortoise.setDamage(squirrel.basicAttack(squirrel.getAttackPower(),
                                squirrel.getAttackAccuracy(),
                                tortoise.getDefense(), tortoise.getName()));
        tortoise.damageTaken();

        System.out.println("\n");

        System.out.println("While the " + tortoise.getName() + " protects the "
                        + hare.getName() + " the " + fox.getName() + " uses "
                        + "its magic to heal the " + hare.getName() + ".");
        fox.specialAbility(hare.getName(), Constants.FOX_HEAL);

        System.out.println("The " + hare.getName() + " primes itself to jump "
                        + "and grab the trunk of the tree.");
        hare.specialMovement();

        System.out.println("The " + tortoise.getName() + " moves the last 20 "
                        + "feet forward and tries to climb the tree with the "
                        + hare.getName() + ".");
        tortoise.climb();
        System.out.println("Meanwhile the " + hare.getName() + " tries to "
                        + "level the playing field with the "
                        + squirrel.getName() + ".\nThe " + hare.getName()
                        + " throws their trusted boomerang at the "
                        + squirrel.getName() + ".");
        squirrel.setDamage(hare.basicAttack(hare.getAttackPower(),
                                hare.getAttackAccuracy(),
                                squirrel.getDefense(), squirrel.getName()));
        squirrel.damageTaken();
        System.out.println("The " + squirrel.getName() + " has "
                        + squirrel.getHealth() + "hp left.\nThe "
                        + squirrel.getName() + " tries to flee to safety, "
                        + "but before it can react");
        hare.climb();

        hare.specialMovement();
        hare.falling(Constants.FALL_DAMAGE_MULTIPLYER);
        hare.falling(Constants.FALL_DAMAGE_MULTIPLYER);
        System.out.println("The " + hare.getName() + " is 10 feet above the "
                        + squirrel.getName() + ".");
        squirrel.setDamage(hare.specialAbility(squirrel.getName(),
                                Constants.HARE_SPECIAL_DAMAGE));
        squirrel.damageTaken();
        System.out.println("The " + squirrel.getName() + " has "
                        + squirrel.getHealth() + "hp left.");

        System.out.println("\n");

        System.out.println("The " + fox.getName() + " and the "
                                + tortoise.getName()
                                + " follow up with another attack.");
        fox.setAllyName(tortoise.getName());
        fox.setForcedMovement(Constants.TELEPORT_DISTANCE);
        fox.specialMovement();
        System.out.println("The " + tortoise.getName() + " is now up in the "
                        + "tree a few feet from the " + squirrel.getName()
                        + ".");
        squirrel.setDamage(tortoise.specialAbility(squirrel.getName(),
                                Constants.TORTOISE_SPECIAL_DAMAGE));

        squirrel.damageTaken();
        System.out.println("The " + squirrel.getName() + " has "
                        + squirrel.getHealth() + "hp left.");

        System.out.println("The " + squirrel.getName() + ", in one last "
                        + "desperate act, mades a run "
                        + "for its special acorn Gatling gun.");
        System.out.println("It travels for 3 seconds at a power of 7.");
        squirrel.accelerate(Constants.SQUIRREL_ACCELERATION_POWER,
                        Constants.SQUIRREL_ACCELERATION_TIME);
        System.out.println("As it travels it is unable to stop and crashes "
                        + "into the wall taking 5 damage and its momentum is "
                        + "lost due to the impact.");
        squirrel.setSpeed(0);
        squirrel.setDamage(Constants.SQUIRREL_CRASH_DAMAGE);
        squirrel.setHealth(squirrel.getHealth() - squirrel.getDamage());
        System.out.println("It then grabs the acorn Gatling gun and points it"
                        + " at the trio!");
        // gaulting gun hits multiple enemies except for fox which is a spirit
        hare.setDamage(squirrel.specialAbility(hare.getName(),
                                Constants.SQUIRREL_SPECIAL_DAMAGE));
        tortoise.setDamage(hare.getDamage());
        hare.damageTaken();
        tortoise.damageTaken();
        System.out.println("The acorns fired at the " + fox.getName()
                        + " travel right through it doing no damage.\nThe "
                        + hare.getName() + " has " + hare.getHealth()
                        + "hp left and the " + tortoise.getName() + " has "
                        + tortoise.getHealth() + "hp left.");
        System.out.println("\n");
        System.out.println("Depite the " + squirrel.getName() + " best efforts"
                        + " the trio stands firm.\nHe realizes he's "
                        + "lost, but instead of facing a cruel end he flees by"
                        + " jumping out of the tree.");
        squirrel.specialMovement();
        System.out.println("As the " + squirrel.getName() + " flees Jim's yard"
                        + " the trio celebrates and peace is restored.\nThe "
                        + "group takes back their stolen goods, and "
                        + "after a few months pass the two "
                        + "keep their promise to the "
                        + fox.getName() + ".\nWith that being said this is the"
                        + " end of our trio's adventure but certainly not "
                        + "the end of their story, but those tales "
                        + "are for another time so with that we end "
                        + "the story here.");
    }
}

