import java.util.Scanner;

public class Lab2main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input Point");
        Point3d A = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Input Point");
        Point3d B = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        System.out.println("Input Point");
        Point3d C = new Point3d(in.nextDouble(), in.nextDouble(), in.nextDouble());
        if (A.equals(B)||B.equals(C)||C.equals(A))
            System.out.println("Есть равные точки!");
        else
            System.out.print("Площадь треугольника = ");
        System.out.printf("%.2f", computeArea(A, B, C));

    }
    public static double computeArea(Point3d first, Point3d second, Point3d third){
        double a = first.distanceTo(second);
        double b = second.distanceTo(third);
        double c = third.distanceTo(first);

        double p = (a + c + b) / 2;

        return Math.sqrt(p * (p - a) * (p - c) * (p - b));

    }
}

