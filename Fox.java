/*
 * The program runs Fox class
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

public class Fox extends Animal {
    /**
     * The fox name of telported ally.
     */
    private String allyName;

    /**
     * The fox climb distance.
     */
    private int climbDistance;

    /**
     * sets default values for animals.
     *
     * @param setColor
     * @param setName
     * @param setHealth
     * @param setDefense
     * @param setClimbDistance
     */
    public Fox(final String setColor, final String setName,
                    final int setHealth, final int setDefense,
                    final int setClimbDistance) {
        super(setColor, setName, setHealth, setDefense);
        this.climbDistance = setClimbDistance;
    }

    /**
     * sets name of ally being telported.
     *
     * @param setAllyName
     */
    public void setAllyName(final String setAllyName) {
        this.allyName = setAllyName;
    }

     /**
     * Fox slow down.
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
     * Fox speeds up.
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
                        + getDistanceTravelled() + " feet,\n reaching a speed "
                        + "of " + getSpeed() + " feet per second.");
        setDistanceTravelled(0);
        return getSpeed();
    }

    /**
     * the Fox's special movement is that it can telport it's friends.
     *
     * @return forcedMovement
     */
    public int specialMovement() {
        System.out.println("The " + getName()
                        + "'s eyes light up in fiery glow as it"
                        + " teleports the " + this.allyName + " "
                        + getForcedMovement() + " feet.");
        return getForcedMovement();
    }

    /**
     * the Fox's special ability is that it can heal damage.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        // special damage is negtive therby healing allies
        System.out.println("The Fox begins to light up as is sends "
                        + "magical energy to the " + enemyAttacked + " healing"
                        + " " + specialDamage + " hp.");
        setDamage(specialDamage);
        return getDamage();
    }

    /**
     * Fox's climbing speed.
     *
     * @return height
     */
    public int climb() {
        setHeight(getHeight() + this.climbDistance);
        System.out.println("The Fox begins scratching the tree "
                        + "trunk and latches on with its paws. "
                        + "\nIt slowly climbs " + this.climbDistance
                        + " feet up the"
                        + " tree.\nReaching "
                        + "a height of " + getHeight() + " feet.");
        return getHeight();
    }
}
