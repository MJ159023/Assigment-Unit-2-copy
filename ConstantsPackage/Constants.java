/*

* This is code haolds all the constants used in the program.

*

* @author  Michael Bruneau

* @version 1.0

* @since   20240-10-12

*/

// File: constants.java
package ConstantsPackage;

public class Constants {
    /**
     * Creates a constant for Hare color.
     */
    public static final String HARE_COLOR = "White";

    /**
     * Creates a constant for Tortoise color.
     */
    public static final String TORTOISE_COLOR = "Green";

    /**
     * Creates a constant for Fox color.
     */
    public static final String FOX_COLOR = "BLUE";

    /**
     * Creates a constant for Squirrel color.
     */
    public static final String SQUIRREL_COLOR = "Brown";

    /**
     * Creates a constant for Hare name.
     */
    public static final String HARE_NAME = "Hare";

    /**
     * Creates a constant for Tortoise name.
     */
    public static final String TORTOISE_NAME = "Tortoise";

    /**
     * Creates a constant for Fox name.
     */
    public static final String FOX_NAME = "Fox";

    /**
     * Creates a constant for Squirrel name.
     */
    public static final String SQUIRREL_NAME = "Squirrel";

    /**
     * Creates a constant for anaimals intial speeds.
     */
    public static final int INTIAL_SPEED = 0;

    /**
     * Creates a constant for Hare's intial health.
     */
    public static final int HARE_INTIAL_HEALTH = 80;

    /**
     * Creates a constant for Tortoise's intial health.
     */
    public static final int TORTOISE_INTIAL_HEALTH = 120;

    /**
     * Creates a constant for Fox's intial health.
     *
     * Fox is spirit and can't die which why it's health is so large
     */
    public static final int FOX_INTIAL_HEALTH = 1000000;

    /**
     * Creates a constant for Squirrel's intial health.
     */
    public static final int SQUIRREL_INTIAL_HEALTH = 100;

    /**
     * Creates a constant for Hare's defense.
     */
    public static final int HARE_DEFENSE = 10;

    /**
     * Creates a constant for Tortoise's defense.
     */
    public static final int TORTOISE_DEFENSE = 14;

    /**
     * Creates a constant for Fox's defense.
     *
     * Fox is spirit and so can't be hit
     */
    public static final int FOX_DEFENSE = 100;

    /**
     * Creates a constant for Squirrel's defense.
     */
    public static final int SQUIRREL_DEFENSE = 11;

    /**
     * Creates a constant for Hare's attack power.
     */
    public static final int HARE_ATTACK_POWER = 13;

    /**
     * Creates a constant for Tortoise's attack power.
     */
    public static final int TORTOISE_ATTACK_POWER = 18;

    /**
     * Creates a constant for Fox's attack power.
     *
     * Fox is a spirit and so can't hurt others
     */
    public static final int FOX_ATTACK_POWER = 0;

    /**
     * Creates a constant for Squirrel's attack power.
     */
    public static final int SQUIRREL_ATTACK_POWER = 15;

    /**
     * Creates a constant for Hare's attack accuracy.
     */
    public static final int HARE_ATTACK_ACCURACY = 11;

    /**
     * Creates a constant for Tortoise's attack accuracy.
     */
    public static final int TORTOISE_ATTACK_ACCURACY = 10;

    /**
     * Creates a constant for Fox's attack accuracy.
     *
     * Fox is a spirit and so can't hit other animals
     */
    public static final int FOX_ATTACK_ACCURACY = 0;

    /**
     * Creates a constant for Squirrel's attack accuracy.
     */
    public static final int SQUIRREL_ATTACK_ACCURACY = 12;

    /**
     * Creates a constant for animals intial height.
     */
    public static final int INTIAL_HEIGHT = 0;

    /**
     * Creates a constant for intial height of the Squirrel.
     */
    public static final int SQUIRREL_INTIAL_HEIGHT = 40;

    /**
     * Creates a constant for animals fall distance.
     */
    public static final int FALL_DISTANCE = 10;

    /**
     * Creates a constant for Hare's slip speed.
     */
    public static final int SLIP_SPEED = 10;

    /**
     * Creates a consatnt for how high the Hare can jump.
     */
    public static final int HOP_HEIGHT = 30;

    /**
     * Creates a constant for Hare's climb distance.
     */
    public static final int HARE_CLIMB_DISTANCE = 10;

    /**
     * Creates a constant for Fox's climb distance.
     */
    public static final int FOX_CLIMB_DISTANCE = 10;

    /**
     * Creates a constant for Squirrel's climb distance.
     */
    public static final int SQUIRREL_CLIMB_DISTANCE = 40;

    /**
     * Creates a constant for Tortoise's stiffness.
     */
    public static final int STIFF_LIMB_DEBUFF = 5;

    /**
     * Creates a constant for Tortoise's swim speed.
     */
    public static final int SWIM_SPEED = 15;

    /**
     * Creates a constant for Tortoise's defense bonus.
     */
    public static final int DEFENSE_BONUS = 2;

    /**
     * Creates a constant for Squirrel's glide distance.
     */
    public static final int GLIDE_DISTANCE = 60;

    /**
     * Creates a constant for swim time.
     */
    public static final int SWIM_TIME = 4;

    /**
     * creates a constant for Hare acceleration power.
     */
    public static final int HARE_ACCELERATION_POWER = 15;

    /**
     * Creates a constant for Hare acceleration time.
     */
    public static final int HARE_ACCELERATION_TIME = 2;

    /**
     * Creates a constant for Tortiose acceleration power.
     */
    public static final int TORTOISE_ACCELERATION_POWER = 5;

    /**
     * Creates a constant for Tortoise acceleration time.
     */
    public static final int TORTOISE_ACCELERATION_TIME = 3;

    /**
     * Creates a constant for Tortoise brake power.
     */
    public static final int TORTOISE_BRAKE_POWER = 1;

    /**
     * Creates a constant for Tortoise brake time.
     */
    public static final int TORTOISE_BRAKE_TIME = 5;

    /**
     * Creates a constant for brake time reduction.
     */
    public static final int BRAKE_TIME_REDUCTION = 10;

    /**
     * Creates a constant for Fox's healing.
     */
    public static final int FOX_HEAL = 30;

    /**
     * Creates a constant for Hare's special damage.
     */
    public static final int HARE_SPECIAL_DAMAGE = 30;

    /**
     * Creates a constant for fall damage multiplyer.
     */
    public static final int FALL_DAMAGE_MULTIPLYER = 5;

    /**
     * Creates a constant for Fox's special ability telportation distance.
     */
    public static final int TELEPORT_DISTANCE = 40;

    /**
     * Creates a constant for Tortoise's special damage.
     */
    public static final int TORTOISE_SPECIAL_DAMAGE = 25;

    /**
     * Creates a constant for Squirrel's acceleration power.
     */
    public static final int SQUIRREL_ACCELERATION_POWER = 7;

    /**
     * Creates a constant for Squirrel's accelertion time.
     */
    public static final int SQUIRREL_ACCELERATION_TIME = 3;

    /**
     * Creates a constant for Squirrel's crash damage.
     */
    public static final int SQUIRREL_CRASH_DAMAGE = 5;

    /**
     * Create a constant for Squirrel's special damage.
     */
    public static final int SQUIRREL_SPECIAL_DAMAGE = 15;

    /**
     * Private constructor to prevent instantiation.
     * Throw an excpetion IllegalState Exception
     * if this is ever called
     *
     * @throws IllegalStateException if this is ever called
     *
    */
    private Constants() {
        throw new IllegalStateException("Cannot be instantiated.");
    }
}

