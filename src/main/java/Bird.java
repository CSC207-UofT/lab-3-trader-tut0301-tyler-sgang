/*
Class implementing interfaces
 */

import org.junit.Before;

public class Bird implements Tradable, Domesticatable{
    private int wingSpan;

    public Bird(int wingSpan){
        this.wingSpan = wingSpan;
    }

    public Bird(){
        this.wingSpan = 5;
    }

    @Override
    public int getPrice(){
        return 8;
    }

    public int getWingSpan(){
        return this.wingSpan;
    }

    @Override
    public String sound(){
        return "Squack!";
    }

    @Override
    public String toString() {
        return "This Bird's wingspan is " + wingSpan + ".";


    }
}
