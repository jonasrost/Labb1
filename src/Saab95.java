import java.awt.*;

public class Saab95 extends Car {

    public boolean turboOn;

    /***
     * Constructor of the class that calls upon the constructor in 'Car'.
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        turboOn = false;
    }

    /***
     * Sets turboOn to true.
     */
    public void setTurboOn(){
        turboOn = true;
    }

    /***
     * Sets turboOn to false.
     */
    public void setTurboOff(){
        turboOn = false;
    }

    /***
     * Returns the speed factor of the Saab
     * @return
     */
    private double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    /***
     * Changes currentSpeed to (currentSpeed + (the speed factor) * amount).
     * @param amount the value that the speed factor is multiplied by.
     */
    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    /***
     * Changes currentSpeed to (currentSpeed - (the speed factor) * amount).
     * @param amount the value that the speed factor is multiplied by.
     */
    public void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}
