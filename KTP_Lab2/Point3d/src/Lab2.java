import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты 1 точки");
        Point3d A = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println("Введите координаты 2 точки");
        Point3d B = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        System.out.println("Введите координаты 3 точки");
        Point3d C = new Point3d(in.nextDouble(),in.nextDouble(),in.nextDouble());
        if (A.equals(B)||B.equals(C)||C.equals(A))
            System.out.println("Ошибка: Есть равные точки");
        else
            System.out.println("Площадь треугльника = " + computeArea(A,B,C));
    }
    public static double computeArea(Point3d A, Point3d B, Point3d C){
        double x = A.distanceTo(B);
        double y = B.distanceTo(C);
        double z = C.distanceTo(A);
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - z) * (p - y));
    }
}

