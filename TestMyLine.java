public class TestMyLine {
    public static void main(String[] args) {

        // Test variables

        MyPoint p1 = new MyPoint(4, 7);
        MyPoint p2 = new MyPoint(5, 9);
        MyLine l1 = new MyLine(p1, p2);


        // Test gets

        System.out.println(l1.GetBegin());

        System.out.println(l1.GetBeginX());

        System.out.println(l1.GetBeginY());

        // System.out.println(l1.GetBeginXY());

        System.out.println(l1.GetEnd());

        System.out.println(l1.GetEndX());

        System.out.println(l1.GetEndY());

        // System.out.println(l1.GetEndXY());


        // Test sets

        l1.SetBeginXY(3,4);

        l1.SetEndXY(5,6);


        // Test Length

        System.out.println(l1.GetLength());
        

        // Test Gradient

        System.out.println(l1.GetGradient());


        // Test toString
        System.out.println(l1.toString());
    }
}
