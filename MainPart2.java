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

        Squirell squirell = new Squirell(Constants.SQUIRELL_COLOR,
                        Constants.SQUIRELL_NAME,
                        Constants.SQUIRELL_INTIAL_HEALTH,
                        Constants.SQUIRELL_DEFENSE,
                        Constants.SQUIRELL_CLIMB_DISTANCE,
                        Constants.GLIDE_DISTANCE);
        squirell.setSpeed(Constants.INTIAL_SPEED);
        squirell.setHeight(Constants.SQUIRELL_INTIAL_HEIGHT);
        squirell.setFallDistance(Constants.FALL_DISTANCE);
        squirell.setAttackPower(Constants.SQUIRELL_ATTACK_POWER);
        squirell.setAttackAccuracy(Constants.SQUIRELL_ATTACK_ACCURACY);

        tortoise.setDamage(squirell.basicAttack(squirell.getAttackPower(),
                                squirell.getAttackAccuracy(),
                                tortoise.getDefense(), tortoise.getName()));
        tortoise.damageTaken();

        System.out.println("\n");

        System.out.println("While the " + tortoise.getName() + " protects the "
                        + hare.getName() + " the " + fox.getName() + " uses "
                        + "it's magic to heal the " + hare.getName() + ".");
        fox.specialAbility(hare.getName(), Constants.FOX_HEAL);

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
                        + squirell.getName() + " tries to flee to safety, "
                        + "but before it can react the");
        hare.climb();

        hare.specialMovement();
        hare.falling(Constants.FALL_DAMAGE_MULTIPLYER);
        hare.falling(Constants.FALL_DAMAGE_MULTIPLYER);
        System.out.println("The " + hare.getName() + " is 10ft above the "
                        + squirell.getName() + ".");
        squirell.setDamage(hare.specialAbility(squirell.getName(),
                                Constants.HARE_SPECIAL_DAMAGE));
        squirell.damageTaken();
        System.out.println("The " + squirell.getName() + " has "
                        + squirell.getHealth() + "hp left.");

        System.out.println("\n");

        System.out.println("The " + fox.getName() + " and the "
                                + tortoise.getName()
                                + " folow up with another attack.");
        fox.setAllyName(tortoise.getName());
        fox.setForcedMovement(Constants.TELEPORT_DISTANCE);
        fox.specialMovement();
        System.out.println("The " + tortoise.getName() + " now up in the tree "
                        + " a few ft from the " + squirell.getName() + ".");
        squirell.setDamage(tortoise.specialAbility(squirell.getName(),
                                Constants.TORTOISE_SPECIAL_DAMAGE));

        squirell.damageTaken();
        System.out.println("The " + squirell.getName() + " has "
                        + squirell.getHealth() + "hp left.");

        System.out.println("The " + squirell.getName() + " in one last "
                        + "desperate act the mades a run "
                        + "for their special acorn gautling gun.");

        squirell.accelerate(Constants.SQUIRELL_ACCELERATION_POWER,
                        Constants.SQUIRELL_ACCELERATION_TIME);

        System.out.println("As he travels he is unable to stop and crashes "
                        + "into the wall taking 5 damage and his momentum is "
                        + "lost by the impact.");
        squirell.setSpeed(0);
        squirell.setDamage(Constants.SQUIRELL_CRASH_DAMAGE);
        squirell.setHealth(squirell.getHealth() - squirell.getDamage());
        System.out.println("He then grabs the acorn gautling gun and points it"
                        + " at the trio!");
        // gaulting gun hits multiple enemies except for fox which is a spirit
        hare.setDamage(squirell.specialAbility(hare.getName(),
                                Constants.SQUIRELL_SPECIAL_DAMAGE));
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
                        + "after few months pass the two "
                        + "keep their promise to the "
                        + fox.getName() + ".\nWith that being said this is the"
                        + " end of our trio's adventure but certainly not "
                        + "the end of of their story, but those tales "
                        + "are for another time so with that we end "
                        + "the story here.");
    }
}

