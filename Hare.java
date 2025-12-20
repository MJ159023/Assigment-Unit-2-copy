/*
 * The program runs Hare class
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

public class Hare extends Animal {
    /**
     * The hare is not able to brake without slipping on the ground a bit.
     */
    private int slipSpeed;

    /**
     * The hare can jump super high this there jump bonus.
     */
    private int hopHeight;

    /**
     * The hare climb distance.
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
     * @param setSlipSpeed
     * @param setHopHeight
     * @param setClimbDistance
     */
    public Hare(final String setColor, final String setName,
                    final int setSpeed, final int setHealth,
                    final int setDefense, final int setAttackPower,
                    final int setAttackAccuracy, final int setAnimalElvation,
                    final int setFallDistance, final int setSlipSpeed,
                    final int setHopHeight, final int setClimbDistance) {
        super(setColor, setName, setSpeed, setHealth, setDefense,
                        setAttackPower, setAttackAccuracy, setAnimalElvation,
                        setFallDistance);
        this.slipSpeed = setSlipSpeed;
        this.hopHeight = setHopHeight;
        this.climbDistance = setClimbDistance;
    }

     /**
     * Hare slow down.
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
                // only applies slip speed once
                // because it only happens at the last 10 seconds
                setSpeed(getSpeed() - ((brakeTimeReduction + brakeTimeZero)
                                    * brakePower) - this.slipSpeed);
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
     * Hare speeds up.
     *
     * @param accelerationPower
     * @param accelerationTime
     * @return speed
     */
    public int accelerate(final int accelerationPower,
                    final int accelerationTime) {
        setSpeed(getSpeed() + (accelerationPower * accelerationTime)
                        + this.slipSpeed);
        setDistanceTravelled(getSpeed() * accelerationTime);
        System.out.println("The " + getName() + " begins to hop and travels "
                        + getDistanceTravelled() + "ft. Reaching a speed of "
                        + getSpeed() + ".");
        setDistanceTravelled(0);
        return getSpeed();
    }

    /**
     * the hare's special movemnet ability is it can hop super high and far.
     *
     * @return height
     */
    public int specialMovement() {
        setHeight(getHeight() +  this.hopHeight);
        System.out.println("The Hare lowers itself"
                        + " to the ground readying itself.\nThen in an instant"
                        + " the Hare hops " + this.hopHeight
                        + "ft into the air.\nReaching a height of "
                        + getHeight() + "ft.");
        return getHeight();
    }

    /**
     * the hare's special ability is it can bounce kick off enemies.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        setHeight(getHeight() - getFallDistance());
        setFallCounter(0);
        System.out.println("Hare falls " + getFallDistance()
                        + "ft as it bounces off the " + enemyAttacked);
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
        System.out.println("The Hare begins scraching the tree "
                        + "trunk latching on with it's paws.\nIt quickly "
                        + "climbs " + this.climbDistance + "ft up the"
                        + " tree.\nReaching "
                        + "a height of " + getHeight() + "ft.");
        return getHeight();
    }
}
