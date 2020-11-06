import java.awt.*;

abstract class Car implements Movable{

    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    //private XXXX dir;
    private double xCord;
    private double yCord;

    public Car(int nrDoors, double enginePower, Color colour, String modelName){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = colour;
        this.modelName = modelName;
        this.xCord = 0;
        this.yCord = 0;
        stopEngine();
    }


    public int getNrDoors(){
        return nrDoors;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        Color clr = this.color;
        return clr;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    private void stopEngine(){
        currentSpeed = 0;
    }



    public void move() {

    }


    public void turnLeft() {

    }


    public void turnRight() {

    }
}
