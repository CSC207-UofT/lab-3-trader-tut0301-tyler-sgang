public class Donkey implements  Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Donkey() {
        this.maxSpeed = 100;
    }

    @Override
    public String sound() {
        return "uhhh donkey?";
    }

    @Override
    public void upgradeSpeed() {
        int maxSpeed = this.maxSpeed;
        maxSpeed += maxSpeed + 1;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 1;
    }

    @Override
    public String toString(){
        return "are we there yet? " + this.getMaxSpeed();
    }
}
