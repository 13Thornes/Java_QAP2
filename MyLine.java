// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25-28 2024

import java.util.Arrays;

public class MyLine {

    // Initialize variables

    MyPoint begin;
    MyPoint end;

    // Add constructors

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin.x = x1;
        this.begin.y = y1;
        this.end.x = x2;
        this.end.y = y2;
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Get methods

    public MyPoint GetBegin() {
        return this.begin;
    }

    public int GetBeginX() {
        return this.begin.getX();
    }

    public int GetBeginY() {
        return this.begin.getY();
    }

    public int[] GetBeginXY() {
        int [] intArray = new int[] {this.begin.getX(), this.begin.getY()};
        System.out.println(Arrays.toString(intArray));
        return intArray;
        
    }

    public MyPoint GetEnd() {
        return this.end;
    }

    public int GetEndX() {
        return this.end.getX();
    }

    public int GetEndY() {
        return this.end.getY();
    }

    public int[] GetEndXY() {
        int [] intArray = new int[] {this.end.getX(), this.end.getY()};
        System.out.println(Arrays.toString(intArray));
        return intArray;
        
    }

    public double GetLength() {
        double d = this.begin.distance(end);
        return d;
    }

    public double GetGradient() {
        int xDiff = this.end.x - this.begin.x;
        int yDiff = this.end.y - this.begin.y;
        double gradiant = Math.atan2(xDiff, yDiff);
        return gradiant;
    }

    // Set Methods

    public void SetBegin(MyPoint begin) {
        this.begin = begin;
    }

    public void SetBeginX(int x) {
        this.begin.x = x;
    }

    public void SetBeginY(int y) {
        this.begin.y = y;
    }

    public void SetBeginXY(int x, int y) {
        this.begin.x = x;
        this.begin.y = y;
    }

    public void SetEnd(MyPoint end) {
        this.end = end;
    }

    public void SetEndX(int x) {
        this.end.x = x;
    }

    public void SetEndY(int y) {
        this.end.y = y;
    }

    public void SetEndXY(int x, int y) {
        this.end.x = x;
        this.end.y = y;
    }

    public String toString() {
        return("MyLine[begin=("+ this.begin.x + "," + this.begin.y + "),end=(" + this.end.x +"," + this.end.y + ")]");
    }

}
