import java.util.*;

public class Lab1 {

    public static Double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double side1, side2, side3;
        side1 = point1.distanceTo(point2);
        side2 = point2.distanceTo(point3);
        side3 = point1.distanceTo(point3);
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.ENGLISH);
        Point3d point1 = new Point3d();
        Point3d point2 = new Point3d();
        Point3d point3 = new Point3d();
        System.out.print("Введите координаты первой точки: ");
        String s1 = in.nextLine();
        System.out.print("Введите координаты второй точки: ");
        String s2 = in.nextLine();
        System.out.print("Введите координаты третьей точки: ");
        String s3 = in.nextLine();
        String[] s1_array = s1.split(" ");
        String[] s2_array = s2.split(" ");
        String[] s3_array = s3.split(" ");
        point1.setX(Double.parseDouble(s1_array[0]));
        point1.setY(Double.parseDouble(s1_array[1]));
        point1.setZ(Double.parseDouble(s1_array[2]));
        point2.setX(Double.parseDouble(s2_array[0]));
        point2.setY(Double.parseDouble(s2_array[1]));
        point2.setZ(Double.parseDouble(s2_array[2]));
        point3.setX(Double.parseDouble(s3_array[0]));
        point3.setY(Double.parseDouble(s3_array[1]));
        point3.setZ(Double.parseDouble(s3_array[2]));
        if (point1.comparison(point2) || point2.comparison(point3) || point1.comparison(point3)) {
            System.out.print("Вы ввели несколько идентичных точек");
        }
        else {
            double res = computeArea(point1, point2, point3);
            if (Double.isNaN(res)) {
                System.out.println("Такого треугольника не существует");
            }
            else {
                System.out.println("Площадь треугольника равна " + res);
            }
        }
    }
}
