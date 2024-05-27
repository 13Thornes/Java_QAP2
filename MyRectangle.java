// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25 2024

public class MyRectangle {
    
    // initialize variables

    MyPoint pointA;
    MyPoint pointB;
    MyPoint pointC;
    MyPoint pointD;

    // Create constructors


    // Empty constructor

    public MyRectangle() {
        this.pointA.x = 0;
        this.pointA.y = 0;

        this.pointB.x = 0;
        this.pointB.y = 0;

        this.pointC.x = 0;
        this.pointC.y = 0;
        
        this.pointD.x = 0;
        this.pointD.y = 0;
    }

    // Constructor using xy values

    public MyRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        this.pointA.x = x1;
        this.pointA.y = y1;

        this.pointB.x = x2;
        this.pointB.y = y2;

        this.pointC.x = x3;
        this.pointC.y = y3;

        this.pointD.x = x4;
        this.pointD.y = y4;
    }

    // Constructor using MyPoints

    MyRectangle(MyPoint a, MyPoint b, MyPoint c, MyPoint d) {
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
        this.pointD = d;
    }

    // Get and Set methods

    // Point A get

    public MyPoint getPointA() {
        return this.pointA;
    }

    public int getPointAX() {
        return this.pointA.x;
    }

    public int getPointAY() {
        return this.pointA.y;
    }

    // Don't know how to return XY

    // public int getPointAXY() {
    //     int x = this.pointA.x;
    //     int y = this.pointA.y;
    //     return("(" + this.pointA.x + "," + this.pointA.y + ")");
    // }

    // Point A set
    
    public void setPointA(MyPoint a) {
        this.pointA = a;
    }

    public void setPointAX(int x) {
        this.pointA.x = x;
    }

    public void setPointAY(int y) {
        this.pointA.y = y;
    }

    public void setPointAXY(int x, int y) {
        this.pointA.x = x;
        this.pointA.y = y;
    }



    // Point B get

    public MyPoint getPointB() {
        return this.pointB;
    }

    public int getPointBX() {
        return this.pointB.x;
    }

    public int getPointBY() {
        return this.pointB.y;
    }

    // Don't know how to return XY

    // public int getPointBXY() {
    //     int x = this.pointB.x;
    //     int y = this.pointB.y;
    //     return("(" + this.pointB.x + "," + this.pointB.y + ")");
    // }

    // Point B set

    
    public void setPointB(MyPoint b) {
        this.pointB = b;
    }

    public void setPointBX(int x) {
        this.pointB.x = x;
    }

    public void setPointBY(int y) {
        this.pointB.y = y;
    }

    public void setPointBXY(int x, int y) {
        this.pointB.x = x;
        this.pointB.y = y;
    }




    // Point C get
    
    public MyPoint getPointC() {
        return this.pointC;
    }

    public int getPointCX() {
        return this.pointC.x;
    }

    public int getPointCY() {
        return this.pointC.y;
    }

    // Don't know how to return XY

    // public int getPointCXY() {
    //     int x = this.pointC.x;
    //     int y = this.pointC.y;
    //     return("(" + this.pointC.x + "," + this.pointC.y + ")");
    // }

    // Point C set
    
    public void setPointC(MyPoint c) {
        this.pointC = c;
    }

    public void setPointCX(int x) {
        this.pointC.x = x;
    }

    public void setPointCY(int y) {
        this.pointC.y = y;
    }

    public void setPointCXY(int x, int y) {
        this.pointC.x = x;
        this.pointC.y = y;
    }




    // Point D get
    
    public MyPoint getPointD() {
        return this.pointD;
    }

    public int getPointDX() {
        return this.pointD.x;
    }

    public int getPointDY() {
        return this.pointD.y;
    }

    // Don't know how to return XY

    // public int getPointDXY() {
    //     int x = this.pointD.x;
    //     int y = this.pointD.y;
    //     return("(" + this.pointD.x + "," + this.pointD.y + ")");
    // }

    // Point D set
    
    public void setPointD(MyPoint d) {
        this.pointD = d;
    }

    public void setPointDX(int x) {
        this.pointD.x = x;
    }

    public void setPointDY(int y) {
        this.pointD.y = y;
    }

    public void setPointDXY(int x, int y) {
        this.pointD.x = x;
        this.pointD.y = y;
    }

    // Get side lengths

    public double GetLengthAtoB() {
            double d = this.pointA.distance(this.pointB);
            return d;
        }
    
    public double GetLengthBtoC() {
        double d = this.pointB.distance(this.pointC);
        return d;
        }

    public double GetLengthCtoD() {
        double d = this.pointC.distance(this.pointD);
        return d;
        }

    public double GetLengthDtoA() {
        double d = this.pointD.distance(this.pointA);
        return d;
        }

    // Get area

    public double GetArea() {
        double AB = this.GetLengthAtoB();
        double BC = this.GetLengthBtoC();

        double area = AB * BC;

        return area;
        }

    // Get perimeter

    public double GetPerimeter() {
        double AB = this.GetLengthAtoB();
        double BC = this.GetLengthBtoC();
        double CD = this.GetLengthCtoD();
        double DA = this.GetLengthDtoA();

        double perimeter = AB + BC + CD + DA;

        return perimeter;
        }

    // To string

    public String toString() {
        return("MyRectangle[pointA=(" + this.pointA.x + "," + this.pointA.y + "),pointB=(" + this.pointB.x  + "," + this.pointB.y + "),pointC=(" + this.pointC.x + "," +this.pointC.y + "),pointD=(" + this.pointD.x + "," + this.pointD.y+ ")]");
    }
    }
