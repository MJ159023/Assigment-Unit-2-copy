/*
 * The program runs Tortoise class
 *
 * @author  Michael Bruneau
 * @version 1.0
 * @since   2020-10-12
 */

public class Tortoise extends Animal {
    /**
     * The Tortoise moves slower making it harder to go fast.
     */
    private int stiffLimbDebuff;

    /**
     * The Tortoise swim speed.
     */
    private int swimSpeed;

    /**
     * holds swim time.
     */
    private int swimTime;

    /**
     * Tortoise gets defense bonus while inside shell.
     */
    private int defenseBonus;

    /**
     * sets default values for animals.
     *
     * @param setColor
     * @param setName
     * @param setHealth
     * @param setDefense
     * @param setStiffLimbDebuff
     * @param setSwimSpeed
     * @param setDefenseBonus
     */
    public Tortoise(final String setColor, final String setName,
                    final int setHealth, final int setDefense,
                    final int setStiffLimbDebuff, final int setSwimSpeed,
                    final int setDefenseBonus) {
        super(setColor, setName, setHealth, setDefense);
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
                        + " begins to try to halt "
                        + "traveling"
                        + " " + getDistanceTravelled() + " feet, reducing its"
                        + " speed to " + getSpeed() + " feet per second.");

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
                        + getDistanceTravelled() + " feet, reaching a speed of"
                        + " " + getSpeed() + " feet per second.");
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
        System.out.println("The " + getName() + " swims "
                        + getDistanceTravelled()
                        + " feet through the kiddy pool with the"
                        + " Hare on its back.");
        setForcedMovement(getDistanceTravelled());
        return getForcedMovement();
    }

    /**
     * the Tortoise special ability is to tuck into shell and spin attacks.
     *
     * @param enemyAttacked
     * @param specialDamage
     * @return damage
     */
    public int specialAbility(final String enemyAttacked,
                    final int specialDamage) {
        // adds defense when in shell
        setDefense(getDefense() + this.defenseBonus);
        System.out.println("The Tortoise tucks inside its shell"
                        + " and spins, bouncing off the " + enemyAttacked);
        setDamage(specialDamage);
        return getDamage();
    }

    /**
     * Tortoise's climbing speed.
     *
     * @return height
     */
    public int climb() {
        System.out.println("The tortoise struggles to climb the tree and,"
                        + " after lots of effort, the Tortoise is still at"
                        + " ground level.");
        return getHeight();
    }
}

