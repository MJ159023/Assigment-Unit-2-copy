/*

* This is main code that runs the Hare, Tortoise, Fox, and Squirell classes.

*

* @author  Michael Bruneau

* @version 1.0

* @since   20240-10-12

*/

// get constants
import ConstantsPackage.Constants;

/**

* This is the Main program.

*/

final class Main {
    /**
     * Private constructor to prevent instantiation.
     * Throw an excpetion IllegalState Exception
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated.");
    }

    public static void main(final String[] args) {
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
                        Constants.STIFF_LIMB_DEBUFF,
                        Constants.SWIM_SPEED, Constants.DEFENSE_BONUS);
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

        MainPart2 mainPart2 = new MainPart2();

        // opening of the story.
        System.out.println("There once was three animals in Jim's backyard.");
        System.out.println("There was the daring " + hare.getColor()
                        + " " + hare.getName() + " who mastered his trusty"
                        + " boomerang.\nThen there was the "
                        + tortoise.getColor() + " " + tortoise.getName()
                        + " the slowest of the pack but also the "
                        + "strongest of the group.\nFinally there was the "
                        + squirrel.getColor()
                        + " " + squirrel.getName() + " the schemer of the trio"
                        + " who had made his home in Sally's treehouse,"
                        + " Jim's daughter.");

        System.out.println("\n");

        System.out.println("All was well for the animals in the yard until "
                        + "winter came.\nThe " + hare.getName()
                        + " and " + tortoise.getName()
                        + " awoke to find that their winter "
                        + "rations had been plundered. The only clue left was "
                        + "a half-eaten acorn.\nAs the two went to question"
                        + " the " + squirrel.getName()
                        + " they realized he had baricaded "
                        + "himself inside the treehosue.\nThe two furious "
                        + "gathered supplies to fight back and take back what "
                        + "was rightfully theirs\nand called upon the spirit"
                        + " of the " + fox.getName() + " to aid them on their "
                        + "journey.");

        System.out.println("\n");

        System.out.println("The spirit of the " + fox.getName() + " accepted "
                        + "their request on the condition that they help "
                        + "turn Jim's yard into a safe haven for all the wild "
                        + "critters in the Peligara neighborhood.\nWhich they "
                        + "gladly agreed to, with that the three begin their "
                        + "journey to defeat the " + squirrel.getName() + "!");

        System.out.println("The group reached, Pepco, the great plastic pool. "
                        + "They could go around it, but it would take longer."
                        + "\nThe " + hare.getName() + " is unable to swim so "
                        + "the " + tortoise.getName() + " decides to bring the"
                        + " " + hare.getName() + " on it's back.");

        // sets swimTime to 4 seconds
        tortoise.setSwimTime(Constants.SWIM_TIME);
        System.out.println("The " + tortoise.getName()
                        + " swam for 4 seconds.");
        hare.setForcedMovement(tortoise.specialMovement());
        hare.forcedMovement();

        System.out.println("\n");

        System.out.println("Once reaching the end of the pool an "
                        + "acorn is suddenly fired from the tree "
                        + "directly at the " + hare.getName() + ".");

        hare.setDamage(squirrel.basicAttack(squirrel.getAttackPower(),
                        squirrel.getAttackAccuracy(), hare.getDefense(),
                        hare.getName()));
        hare.damageTaken();

        System.out.println("The " + hare.getName() + " has " + hare.getHealth()
                        + "hp left.\nThe " + hare.getName() + " looks up "
                        + "to see the " + squirrel.getName() + " firing its "
                        + "acorn cannon from the treehoue.");

        System.out.println("\n");

        System.out.println("The " + hare.getName()
                        + " begins to sprint towards the tree"
                        + " 100ft away while trying to dodge the acorn "
                        + "volley.\nThe " + hare.getName() + " sprint lasts "
                        + "two seconds at a power of 15.");

        hare.accelerate(Constants.HARE_ACCELERATION_POWER,
                        Constants.HARE_ACCELERATION_TIME);

        System.out.println("Another shot is fired out.");
        hare.setDamage(squirrel.basicAttack(squirrel.getAttackPower(),
                                squirrel.getAttackAccuracy(),
                                hare.getDefense(), hare.getName()));
        hare.setSpeed(0); // rests speed because hare has  been haulted
        hare.damageTaken();
        System.out.println("The " + hare.getName() + " has " + hare.getHealth()
                        + "hp left.\nAnd after getting hit it "
                        + "falls over and is unable to get back up.");

        System.out.println("The " + tortoise.getName() + " moves as fast as it"
                        + " can to protect the " + hare.getName() + ".");

        System.out.println("It sprints for 3 seconds at a power of 5");
        tortoise.accelerate(Constants.TORTOISE_ACCELERATION_POWER,
                        Constants.TORTOISE_ACCELERATION_TIME);
        System.out.println("As the " + tortoise.getName() + " gets closer it"
                        + " slows down for 5 seconds at power of 1 ");
        tortoise.brake(Constants.TORTOISE_BRAKE_POWER,
                        Constants.TORTOISE_BRAKE_TIME,
                        Constants.BRAKE_TIME_REDUCTION);
        System.out.println("The " + squirrel.getName() + " once again fires at"
                        + " the " + hare.getName() + ", but this time "
                        + tortoise.getName() + " blocks the shot.");
        mainPart2.runMain2();
    }
}
