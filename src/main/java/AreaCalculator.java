public class AreaCalculator {

    public static double calculateArea(Object[] objects) {
        double totalArea = 0;
        for (Object obj : objects) {
            if (obj instanceof Circle) {
                Circle circle = (Circle) obj;
                totalArea = totalArea + Math.pow(circle.getRadius(), 2) * Math.PI;
            } else if (obj instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) obj;
                totalArea += rectangle.getWidth() * rectangle.getHeight();
            }
            //ignore if not one of these shapes

        }
        return totalArea;
    }

}
