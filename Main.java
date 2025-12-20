/*

* This is main code that runs the Hare, Tortoise, Fox, and Squirell classes.

*

* @author  Michael Bruneau

* @version 1.0

* @since   20240-10-12

*/

// get constants
import ConstantsPackage.*;

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
                        Constants.INTIAL_SPEED, Constants.HARE_INTIAL_HEALTH,
                        Constants.HARE_DEFENSE, Constants.HARE_ATTACK_POWER,
                        Constants.HARE_ATTACK_ACCURACY,
                        Constants.INTIAL_HEIGHT, Constants.FALL_DISTANCE,
                        Constants.SLIP_SPEED, Constants.HOP_HEIGHT, 
                        Constants.HARE_CLIMB_DISTANCE);

        Tortoise tortoise = new Tortoise(Constants.TORTOISE_COLOR,
                        Constants.TORTOISE_NAME, Constants.INTIAL_SPEED,
                        Constants.TORTOISE_INTIAL_HEALTH,
                        Constants.TORTOISE_DEFENSE,
                        Constants.TORTOISE_ATTACK_POWER,
                        Constants.TORTOISE_ATTACK_ACCURACY,
                        Constants.INTIAL_HEIGHT, FALL_DISTANCE,
                        Constants.STIFF_LIMB_DEBUFF,
                        Constants.SWIM_SPEED, DEFENSE_BONUS);

        Fox fox = new Fox(Constants.FOX_COLOR, Constants.FOX_NAME,
                        Constants.INTIAL_SPEED, Constants.FOX_INTIAL_HEALTH,
                        Constants.FOX_DEFENSE, Constants.FOX_ATTACK_POWER,
                        Constants.FOX_ATTACK_ACCURACY,
                        Constants.INTIAL_HEIGHT, Constants.FALL_DISTANCE,
                        Constants.FOX_CLIMB_DISTANCE);

        Squirell squirell = new Squirell(Constants.SQUIRELL_COLOR,
                        Constants.SQUIRELL_NAME, Constants.INTIAL_SPEED,
                        Constants.SQUIRELL_INTIAL_HEALTH,
                        Constants.SQUIRELL_DEFENSE,
                        Constants.SQUIRELL_ATTACK_POWER,
                        Constants.SQUIRELL_ATTACK_ACCURACY,
                        Constants.SQUIRELL_INTIAL_HEIGHT,
                        Constants.FALL_DISTANCE,
                        Constants.SQUIRELL_CLIMB_DISTANCE, GLIDE_DISTANCE);

        MainPart2 mainPart2 = new MainPart2();

        constants constantsVariables = new constants();

        // opening of the story.
        System.out.println("There once was three animals in Jim's back yard.");
        System.out.println("There was the daring " + hare.getColor()
                        + " " + hare.getName() + " who mastered his trusty"
                        + " boomerang.\nThen there was the "
                        + tortoise.getColor() + " " + tortoise.getName()
                        + " the slowest of the pack but also the "
                        + "strongest of the group.\nFinally there was the "
                        + squirell.getColor()
                        + " " + squirell.getName() + " the schemer of the trio"
                        + " who had made his home in sally's treehouse,"
                        + " Jim's daughter.");

        System.out.println("\n");

        System.out.println("All was well for animals in the yard until winter "
                        + "came.\nSuddenly the " + hare.getName() + " and "
                        + tortoise.getName() + " awoke to find there winter "
                        + "rations had been plundered. The only clue left was "
                        + "a half eaten acorn.\nAs the two went to question"
                        + " the " + squirell.getName()
                        + " they realized he'd baricaded "
                        + "himself inside the treehosue.\nThe two furious "
                        + "gathered suplies to fight back and take back what "
                        + "was rightfully their's\nand called to the spirit"
                        + " of the " + fox.getName() + " to aid them on their "
                        + "journey.");

        System.out.println("\n");

        System.out.println("The spirit of the " + fox.getName() + " accepts "
                        + "their request on the condition that they help to "
                        + "turn Jim's yard into a safe haven for all the wild "
                        + "critters in the Peligara neighborhood.\nWhich they "
                        + "gladly agree to. With that the three begin to "
                        + "journey to defeat the " + squirell.getName() + "!");

        System.out.println("The group reach the great plastic pool of Pepco "
                        + "they could go around but it would take longer.\n"
                        + "The " + hare.getName() + " is unable to swim so "
                        + "the " + tortoise.getName() + " decides to bring the"
                        + " " + hare.getName() + " on it's back.");

        // sets swimTime to 4 seconds
        tortoise.setSwimTime(Constants.SWIM_TIME);
        System.out.println("For 4 seconds the");
        hare.setForcedMovement(tortoise.specialMovement());
        hare.forcedMovement();

        System.out.println("\n");



        System.out.println("Suddenly an acorn is fired from the tree "
                        + "directly at the " + hare.getName() + ".");

        hare.setDamage(squirell.basicAttack(squirell.getAttackPower(),
                        squirell.getAttackAccuracy(), hare.getDefense(),
                        hare.getName()));
        hare.damageTaken();

        System.out.println("The " + hare.getName() + " has " + hare.getHealth()
                        + "hp left.\nThe " + hare.getName() + " looks up "
                        + "to see the " + squirell.getName() + " firing it's "
                        + "acorn cannon from the treehoue.");

        System.out.println("\n");

        System.out.println("As the pair finally cross the pool the "
                        + hare.getName() + " begins to sprint towords the tree"
                        + " 100ft away while trying to dodge the acorn "
                        + "volley.\nThe " + hare.getName() + " sprint lasts "
                        + "two seconds at a power of 15.");

        hare.accelerate(Constants.HARE_ACCELERATION_POWER,
                        Constants.HARE_ACCELERATION_TIME);

        System.out.println("Another shot fires out.");
        hare.setDamage(squirell.basicAttack(squirell.getAttackPower(),
                                squirell.getAttackAccuracy(),
                                hare.getDefense(), hare.getName()));
        hare.setSpeed(0); // rests speed because hare has  been haulted
        hare.damageTaken();
        System.out.println("The " + hare.getName() + " has " + hare.getHealth()
                        + "hp left.\nAnd after getting hit it "
                        + "falls over unable to get back up.");

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

        System.out.println("The " + squirell.getName() + " once again fires at"
                        + " the " + hare.getName() + " but instead the "
                        + tortoise.getName() + " blocks the shot.");

        tortoise.setDamage(squirell.basicAttack(squirell.getAttackPower(),
                                squirell.getAttackAccuracy(),
                                tortoise.getDefense(), tortoise.getName()));
        tortoise.damageTaken();

        System.out.println("\n");

        mainPart2.runMainpart2();
    }
}
