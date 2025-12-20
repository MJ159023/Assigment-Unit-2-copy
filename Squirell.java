/*
 * The program runs Squirell class
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

public class Squirell extends Animal {
    /**
     * The squirell climb distance.
     */
    private int climbDistance;

    /**
     * squirell glide distance.
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
    public Squirell(final String setColor, final String setName,
                    final int setHealth, final int setDefense,
                    final int setClimbDistance, final int setGlideDistance) {
        super(setColor, setName, setHealth, setDefense);
        this.climbDistance = setClimbDistance;
        this.glideDistance = setGlideDistance;
    }

     /**
     * Squirell slow down.
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
                        + " begins to try to hault "
                        + "traveling"
                        + " " + getDistanceTravelled() + "ft. Reducing it's "
                        + "speed to " + getSpeed() + ".");

        setDistanceTravelled(0);
        return getSpeed();
    }


    /**
     * Squirell speeds up.
     *
     * @param accelerationPower
     * @param accelerationTime
     * @return speed
     */
    public int accelerate(final int accelerationPower,
                    final int accelerationTime) {
        setSpeed(getSpeed() + (accelerationPower * accelerationTime));
        setDistanceTravelled(getSpeed() * accelerationTime);
        System.out.println(getName() + " travels "
                        + getDistanceTravelled() + "ft.\nReaches a speed of "
                        + getSpeed() + ".");
        setDistanceTravelled(0);
        return getSpeed();
    }

    /**
     * the squirell special movement ability is that it can glide.
     *
     * @return height
     */
    public int specialMovement() {
        setHeight(getHeight() - getFallDistance());
        System.out.println("The Squirell begins to glide " + this.glideDistance
                        + "ft and decends " + getFallDistance() + ".\n"
                        + "The Squirell is now at a height of " + getHeight()
                        + "ft.");
        return getHeight();
    }

    /**
     * the hare's special ability is squirell acorn gatling gun.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        setDamage(specialDamage);
        System.out.println("The squirell begins to fire at everyone"
                        + " in the 20ft area");
        return getDamage();
    }

    /**
     * Hare's climbing speed.
     *
     * @return height
     */
    public int climb() {
        setHeight(getHeight() + this.climbDistance);
        System.out.println("The Squirell begins scartching the tree "
                        + "trunk latching on with it's paws.\nIt slowly climbs"
                        + " " + this.climbDistance + "ft up the"
                        + " tree.\nReaching "
                        + "a height of " + getHeight() + "ft.");
        return getHeight();
    }
}
