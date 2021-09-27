/*
A class that implements the given interfaces
 */

public class Ferrari implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    public Ferrari() {
        this.maxSpeed = 50;
    }


    public String sound() {
        return "ZOOM!";
    }


    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }


    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }


    public int getMaxSpeed() {
        return this.maxSpeed;
    }


    public int getPrice() {
        return 25;
    }


    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }}
