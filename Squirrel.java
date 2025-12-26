/*
 * The program runs Squirell class
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

public class Squirrel extends Animal {
    /**
     * The squirrel climb distance.
     */
    private int climbDistance;

    /**
     * squirrel glide distance.
     */
    private int glideDistance;

    /**
     * sets default values for animals.
     *
     * @param setColor
     * @param setName
     * @param setHealth
     * @param setDefense
     * @param setClimbDistance
     * @param setGlideDistance
     */
    public Squirrel(final String setColor, final String setName,
                    final int setHealth, final int setDefense,
                    final int setClimbDistance, final int setGlideDistance) {
        super(setColor, setName, setHealth, setDefense);
        this.climbDistance = setClimbDistance;
        this.glideDistance = setGlideDistance;
    }

     /**
     * Squirrel slow down.
     *
     * @param brakePower
     * @param brakeTime
     * @param brakeTimeReduction
     * @return speed
     */
    public int brake(final int brakePower, final int brakeTime,
                    final int brakeTimeReduction) {
        int brakeTimeZero = brakeTime;
        do {
            // decreases speed ever 10 seconds or once brake time is done
            brakeTimeZero = brakeTimeZero - brakeTimeReduction;

            // makes sure speed is never negative
            if (getSpeed() < 0) {
                setSpeed(0);
            }

            // checks if brakeTime is already below or equal zero
            if (brakeTimeZero <= 0) {
                setDistanceTravelled(getDistanceTravelled()
                            + getSpeed() * (brakeTimeReduction
                                    + brakeTimeZero));

                setSpeed(getSpeed() - ((brakeTimeReduction + brakeTimeZero)
                                    * brakePower));
            } else {
                setDistanceTravelled(getDistanceTravelled()
                            + getSpeed() * brakeTimeReduction);
                setSpeed(getSpeed() - (brakeTimeReduction * brakePower));
            }
        } while (brakeTimeZero > 0);

        // make sure to set speed to zero if negative.
        if (getSpeed() < 0) {
            setSpeed(0);
        }

        System.out.println("The " + getName()
                        + " begins to try to halt "
                        + "traveling"
                        + " " + getDistanceTravelled() + " feet, reducing it's"
                        + " speed to " + getSpeed() + " feet per second.");

        setDistanceTravelled(0);
        return getSpeed();
    }


    /**
     * Squirrel speeds up.
     *
     * @param accelerationPower
     * @param accelerationTime
     * @return speed
     */
    public int accelerate(final int accelerationPower,
                    final int accelerationTime) {
        setSpeed(getSpeed() + (accelerationPower * accelerationTime));
        setDistanceTravelled(getSpeed() * accelerationTime);
        System.out.println("The " + getName() + " travels "
                        + getDistanceTravelled()
                        + " feet,\nreaching a speed of"
                        + " " + getSpeed() + " feet per second.");
        setDistanceTravelled(0);
        return getSpeed();
    }

    /**
     * the squirrel special movement ability is that it can glide.
     *
     * @return height
     */
    public int specialMovement() {
        setHeight(getHeight() - getFallDistance());
        System.out.println("The Squirrel begins to glide " + this.glideDistance
                        + " feet and decends " + getFallDistance() + " feet.\n"
                        + "The Squirell is now at a height of " + getHeight()
                        + " feet.");
        return getHeight();
    }

    /**
     * the Squirrel's special ability is squirell acorn gatling gun.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        setDamage(specialDamage);
        System.out.println("The squirrel begins to fire at everyone"
                        + " in the 20 feet area");
        return getDamage();
    }

    /**
     * Squirrel's climbing speed.
     *
     * @return height
     */
    public int climb() {
        setHeight(getHeight() + this.climbDistance);
        System.out.println("The Squirrel begins scartching the tree "
                        + "trunk and latches on with its paws. "
                        + "\nIt slowly climbs " + this.climbDistance
                        + " feet up the"
                        + " tree.\nReaching "
                        + "a height of " + getHeight() + " feet.");
        return getHeight();
    }
}
