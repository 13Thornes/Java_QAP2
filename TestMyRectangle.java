// Project: Java QAP2
// Author: Samantha Thorne
// Date: May 25 2024

public class TestMyRectangle {
    public static void main(String[] args) {

        // Create MyPoints
        MyPoint pointA = new MyPoint(1, 4);
        MyPoint pointB = new MyPoint(5, 4);
        MyPoint pointC = new MyPoint(5, 2);
        MyPoint pointD = new MyPoint(1, 2);

        // Create Rectangle using MyPoints
        MyRectangle r1 = new MyRectangle(pointA, pointB, pointC, pointD);

        // Get PointA

        System.out.printf("PointA: %s \n",r1.getPointA());

        // Get PointA's x and y

        System.out.printf("PointA x: %s \n",r1.getPointAX());

        System.out.printf("PointA y: %s \n",r1.getPointAY());

        // System.out.println(r1.getPointAXY());

        // Get PointB

        System.out.printf("PointB: %s \n",r1.getPointB());

        // Get PointC

        System.out.printf("PointC: %s \n",r1.getPointC());

        // Get PointD

        System.out.printf("PointD: %s \n",r1.getPointD());

        // Change PointA's x and y

        r1.setPointAXY(5,6);

        // Get new PointA

        System.out.printf("New PointA: %s \n",r1.getPointA());

        // Change it back to original

        r1.setPointAXY(1,4);

        System.out.println("Point A changed back to original");

        // Get length of all 4 sides

        System.out.printf("Length AtoB: %s \n", r1.GetLengthAtoB());

        System.out.printf("Length BtoC: %s \n",r1.GetLengthBtoC());

        System.out.printf("Length CtoD: %s \n",r1.GetLengthCtoD());

        System.out.printf("Length DtoA: %s \n",r1.GetLengthDtoA());

        // Get area and perimeter

        System.out.printf("Area: %s \n", r1.GetArea());

        System.out.printf("Perimeter: %s \n", r1.GetPerimeter());

        // Test toString()

        System.out.println(r1.toString());








    }
}
