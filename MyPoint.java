// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25 2024

public class MyPoint {
    // initialize variables

    int x;
    int y;

    // add constructors

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // get methods

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // set methods

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Variables to string

    public String toString() {
        return("(" + this.x +", " + this.y + ")");
    }

    // distances

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);

    }

    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    public double distance() {
        int xDiff = this.x - 0;
        int yDiff = this.y - 0;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

}
