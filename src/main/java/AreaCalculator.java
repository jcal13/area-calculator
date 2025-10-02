public class AreaCalculator {

    public static double calculateArea(Rectangle[] rectangles) {
        double totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.getWidth() * rectangle.getHeight();
        }
        return totalArea;
    }

}
