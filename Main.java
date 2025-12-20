/*

* This is main code that runs the Hare, Tortoise, Fox, and Squirell classes.

*

* @author  Michael Bruneau

* @version 1.0

* @since   20240-10-12

*/


/**

* This is the Main program.

*/

final class Main {
    // MultipleStringLiterals & MagicNumbers

    /**
     * Creates a constant for Hare color.
     */
    private static final String HARE_COLOR = "White";

    /**
     * Creates a constant for Tortoise color.
     */
    private static final String TORTOISE_COLOR = "Green";

    /**
     * Creates a constant for Fox color.
     */
    private static final String FOX_COLOR = "BLUE";

    /**
     * Creates a constant for Squirell color.
     */
    private static final String SQUIRELL_COLOR = "Brown";

    /**
     * Creates a constant for Hare name.
     */
    private static final String HARE_NAME = "Hare";

    /**
     * Creates a constant for Tortoise name.
     */
    private static final String TORTOISE_NAME = "Tortoise";

    /**
     * Creates a constant for Fox name.
     */
    private static final String FOX_NAME = "Fox";

    /**
     * Creates a constant for Squirell name.
     */
    private static final String SQUIRELL_NAME = "Squirell";

    /**
     * Creates a constant for anaimals intial speeds.
     */
    private static final int INTIAL_SPEED = 0;

    /**
     * Creates a constant for Hare's intial health.
     */
    private static final int HARE_INTIAL_HEALTH = 80;

    /**
     * Creates a constant for Tortoise's intial health.
     */
    private static final int TORTOISE_INTIAL_HEALTH = 120;

    /**
     * Creates a constant for Fox's intial health.
     *
     * Fox is spirit and can't die which why it's health is so large
     */
    private static final int FOX_INTIAL_HEALTH = 1000000;

    /**
     * Creates a constant for Squirell's intial health.
     */
    private static final int SQUIRELL_INTIAL_HEALTH = 100;

    /**
     * Creates a constant for Hare's defense.
     */
    private static final int HARE_DEFENSE = 10;

    /**
     * Creates a constant for Tortoise's defense.
     */
    private static final int TORTOISE_DEFENSE = 14;

    /**
     * Creates a constant for Fox's defense.
     *
     * Fox is spirit and so can't be hit
     */
    private static final int FOX_DEFENSE = 100;

    /**
     * Creates a constant for Squirell's defense.
     */
    private static final int SQUIRELL_DEFENSE = 11;

    /**
     * Creates a constant for Hare's attack power.
     */
    private static final int HARE_ATTACK_POWER = 13;

    /**
     * Creates a constant for Tortoise's attack power.
     */
    private static final int TORTOISE_ATTACK_POWER = 18;

    /**
     * Creates a constant for Fox's attack power.
     *
     * Fox is a spirit and so can't hurt others
     */
    private static final int FOX_ATTACK_POWER = 0;

    /**
     * Creates a constant for Squirell's attack power.
     */
    private static final int SQUIRELL_ATTACK_POWER = 15;

    /**
     * Creates a constant for Hare's attack accuracy.
     */
    private static final int HARE_ATTACK_ACCURACY = 11;

    /**
     * Creates a constant for Tortoise's attack accuracy.
     */
    private static final int TORTOISE_ATTACK_ACCURACY = 10;

    /**
     * Creates a constant for Fox's attack accuracy.
     *
     * Fox is a spirit and so can't hit other animals
     */
    private static final int FOX_ATTACK_ACCURACY = 0;

    /**
     * Creates a constant for Squirell's attack accuracy.
     */
    private static final int SQUIRELL_ATTACK_ACCURACY = 12;

    /**
     * Creates a constant for animals intial height.
     */
    private static final int INTIAL_HEIGHT = 0;

    /**
     * Creates a constant for intial height of the Squirell.
     */
    private static final int SQUIRELL_INTIAL_HEIGHT = 40;

    /**
     * Creates a constant for animals fall distance.
     */
    private static final int FALL_DISTANCE = 10;

    /**
     * Creates a constant for Hare's slip speed.
     */
    private static final int SLIP_SPEED = 10;

    /**
     * Creates a consatnt for hwo high the Hare can jump.
     */
    private static final int HOP_HEIGHT = 30;

    /**
     * Creates a constant for Hare's climb distance.
     */
    private static final int HARE_CLIMB_DISTANCE = 10;

    /**
     * Creates a constant for Fox's climb distance.
     */
    private static final int FOX_CLIMB_DISTANCE = 10;

    /**
     * Creates a constant for Squirell's climb distance.
     */
    private static final int SQUIRELL_CLIMB_DISTANCE = 40;

    /**
     * Creates a constant for Tortoise's stiffness.
     */
    private static final int STIFF_LIMB_DEBUFF = 5;

    /**
     * Creates a constant for Tortoise's swim speed.
     */
    private static final int SWIM_SPEED = 15;

    /**
     * Creates a constant for Tortoise's defense bonus.
     */
    private static final int DEFENSE_BONUS = 2;

    /**
     * Creates a constant for Squirell's glide distance.
     */
    private static final int GLIDE_DISTANCE = 60;

    /**
     * Creates a constant for swim time.
     */
    private static final int SWIM_TIME = 4;

    /**
     * creates a constant for Hare acceleration power.
     */
    private static final int HARE_ACCELERATION_POWER = 15;

    /**
     * Creates a constant for Hare acceleration time.
     */
    private static final int HARE_ACCELERATION_TIME = 2;

    /**
     * Creates a constant for Tortiose acceleration power.
     */
    private static final int TORTOISE_ACCELERATION_POWER = 5;

    /**
     * Creates a constant for Tortoise acceleration time.
     */
    private static final int TORTOISE_ACCELERATION_TIME = 3;

    /**
     * Creates a constant for Tortoise brake power.
     */
    private static final int TORTOISE_BRAKE_POWER = 1;

    /**
     * Creates a constant for Tortoise brake time.
     */
    private static final int TORTOISE_BRAKE_TIME = 5;

    /**
     * Creates a constant for brake time reduction.
     */
    private static final int BRAKE_TIME_REDUCTION = 10;

    /**
     * Creates a constant for Fox's healing.
     */
    private static final int FOX_HEAL = 30;

    /**
     * Creates a constant for Hare's special damage.
     */
    private static final int HARE_SPECIAL_DAMAGE = 30;

    /**
     * Creates a constant for fall damage multiplyer.
     */
    private static final int FALL_DAMAGE_MULTIPLYER = 5;

    /**
     * Creates a constant for Fox's special ability telportation distance.
     */
    private static final int TELEPORT_DISTANCE = 40;

    /**
     * Creates a constant for Tortoise's special damage.
     */
    private static final int TORTOISE_SPECIAL_DAMAGE = 25;

    /**
     * Creates a constant for Squirell's acceleration power.
     */
    private static final int SQUIRELL_ACCELERATION_POWER = 7;

    /**
     * Creates a constant for Squirell's accelertion time.
     */
    private static final int SQUIRELL_ACCELERATION_TIME = 3;

    /**
     * Creates a constant for Squirell's crash damage.
     */
    private static final int SQUIRELL_CRASH_DAMAGE = 5;

    /**
     * Create a constant for Squirell's special damage.
     */
    private static final int SQUIRELL_SPECIAL_DAMAGE = 15;


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
        tortoise.setSwimTime(SWIM_TIME);
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

        hare.accelerate(HARE_ACCELERATION_POWER, HARE_ACCELERATION_TIME);

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
        tortoise.accelerate(TORTOISE_ACCELERATION_POWER,
                        TORTOISE_ACCELERATION_TIME);
        System.out.println("As the " + tortoise.getName() + " gets closer it"
                        + " slows down for 5 seconds at power of 1 ");
        tortoise.brake(TORTOISE_BRAKE_POWER, TORTOISE_BRAKE_TIME,
                        BRAKE_TIME_REDUCTION);

        System.out.println("The " + squirell.getName() + " once again fires at"
                        + " the " + hare.getName() + " but instead the "
                        + tortoise.getName() + " blocks the shot.");

        tortoise.setDamage(squirell.basicAttack(squirell.getAttackPower(),
                                squirell.getAttackAccuracy(),
                                tortoise.getDefense(), tortoise.getName()));
        tortoise.damageTaken();

        System.out.println("\n");

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
