public class Main {
    public static void main(String[] args) {

        var rectangle = new Geometry.Rectangle(10, 20);
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());
        System.out.println("Площадь прямоугольника: " + rectangle.area() + "\n");

        var circle = new Geometry.Circle(10);
        System.out.println("Периметр круга: " + circle.perimeter());
        System.out.println("Площадь круга: " + circle.area() + "\n");

        var triangle = new Geometry.Triangle(3, 4, 3);
        System.out.println("Периметр треугольника: " + triangle.perimeter());
        System.out.println("Площадь треугольника: " + triangle.area());

        var r1 = new Geometry.Rectangle(10, 20);
        var r2 = new Geometry.Rectangle(10, 20);
        System.out.println(Utils.comparePerimeter(r1, r2));
        System.out.println(Utils.compareArea(r1, r2));

        var cube1 = new ThreeDimensional.Cube(10);
        System.out.println("Объем куба: " + cube1.volume());
        System.out.println("Площадь куба: " + cube1.surfaceArea());
    }
}
