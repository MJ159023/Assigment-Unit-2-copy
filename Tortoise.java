/*
 * The program runs Tortoise class
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

public class Tortoise extends Animal {
    /**
     * The tortoise moves slower making it harder to go fast.
     */
    private int stiffLimbDebuff;

    /**
     * The tortoise swim speed.
     */
    private int swimSpeed;

    /**
     * holds swim time.
     */
    private int swimTime;

    /**
     * tortoise gets defense bonus while inside shell.
     */
    private int defenseBonus;

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
     * @param setStiffLimbDebuff
     * @param setSwimSpeed
     * @param setDefenseBonus
     */
    public Tortoise(final String setColor, final String setName,
                    final int setSpeed, final int setHealth,
                    final int setDefense, final int setAttackPower,
                    final int setAttackAccuracy, final int setAnimalElvation,
                    final int setFallDistance, final int setStiffLimbDebuff,
                    final int setSwimSpeed, final int setDefenseBonus) {
        super(setColor, setName, setSpeed, setHealth, setDefense,
                        setAttackPower, setAttackAccuracy, setAnimalElvation,
                        setFallDistance);
        this.stiffLimbDebuff = setStiffLimbDebuff;
        this.swimSpeed = setSwimSpeed;
        this.defenseBonus = setDefenseBonus;
    }

    /**
     * sets swim time.
     *
     * @param setSwimTime
     */
    public void setSwimTime(final int setSwimTime) {
        this.swimTime = setSwimTime;
    }

    /**
     * Tortoise slow down.
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
                // only applies debuff speed once
                // because it only happens at the last 10 seconds
                setSpeed(getSpeed() - ((brakeTimeReduction + brakeTimeZero)
                                    * brakePower) - stiffLimbDebuff);
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
     * Tortoise speeds up.
     *
     * @param accelerationPower
     * @param accelerationTime
     * @return speed
     */
    public int accelerate(final int accelerationPower,
                    final int accelerationTime) {
        setSpeed(getSpeed() + (accelerationPower * accelerationTime)
                        - stiffLimbDebuff);
        setDistanceTravelled(getSpeed() * accelerationTime);

        System.out.println("The " + getName() + " travels "
                        + getDistanceTravelled() + "ft. Reaching a speed of "
                        + getSpeed());
        setDistanceTravelled(0);
        return getSpeed();
    }

    /**
     * The Tortoise special movement ability is being able to swim.
     *
     * @return forcedMovement
     */
    public int specialMovement() {
        setDistanceTravelled(this.swimSpeed * this.swimTime);
        System.out.println(getName() + " swims " + getDistanceTravelled()
                        + "ft through the kiddy pool with the"
                        + " Hare on it's back.");
        setForcedMovement(getDistanceTravelled());
        return getForcedMovement();
    }

    /**
     * the tortoise special ability is to tuck into shell and spin attacks.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        // adds defense when in shell
        setDefense(getDefense() + this.defenseBonus);
        System.out.println("Tortoise tucks inside shell"
                        + " and spins bouncing off of " + enemyAttacked);
        setDamage(specialDamage);
        return getDamage();
    }

    /**
     * Hare's climbing speed.
     *
     * @return height
     */
    public int climb() {
        System.out.println("The tortoise struggles to climb the tree and"
                        + " after lots of effort the tortoise is still at"
                        + " ground level.");
        return getHeight();
    }
}

