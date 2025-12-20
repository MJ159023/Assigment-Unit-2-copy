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
     * @param setSpeed
     * @param setHealth
     * @param setDefense
     * @param setAttackPower
     * @param setAttackAccuracy
     * @param setAnimalElvation
     * @param setFallDistance
     * @param setClimbDistance
     */
    public Fox(final String setColor, final String setName,
                    final int setSpeed, final int setHealth,
                    final int setDefense, final int setAttackPower,
                    final int setAttackAccuracy, final int setAnimalElvation,
                    final int setFallDistance,
                    final int setClimbDistance) {
        super(setColor, setName, setSpeed, setHealth, setDefense,
                        setAttackPower, setAttackAccuracy, setAnimalElvation,
                        setFallDistance);
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
                        + " begins to try to hault "
                        + "traveling"
                        + " " + getDistanceTravelled() + "ft. Reducing it's "
                        + "speed to " + getSpeed() + ".");

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
                        + getDistanceTravelled() + "ft.\n Reaching a speed "
                        + "of " + getSpeed() + ".");
        setDistanceTravelled(0);
        return getSpeed();
    }

    /**
     * the fox special movement is that it can telport it's friends 40ft.
     *
     * @return forcedMovement
     */
    public int specialMovement() {
        System.out.println(getName() + " eyes light up in firery glow as it"
                        + " telports the " + this.allyName + " "
                        + getForcedMovement() + "ft.");
        return getForcedMovement();
    }

    /**
     * the hare's special ability is that it can heal damage.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        // special damage is negtive therby healing allies
        System.out.println("The fox begins to light up as is sends "
                        + "magical energy to the " + enemyAttacked + " healing"
                        + " " + specialDamage + " hp.");
        setDamage(specialDamage);
        return getDamage();
    }

    /**
     * Hare's climbing speed.
     *
     * @return height
     */
    public int climb() {
        setHeight(getHeight() + this.climbDistance);
        System.out.println("The Fox begins scartching the tree "
                        + "trunk latching on with it's paws.\nIt slowly climbs"
                        + " " + this.climbDistance + "ft up the"
                        + " tree.\nReaching "
                        + "a height of " + getHeight() + "ft.");
        return getHeight();
    }
}
