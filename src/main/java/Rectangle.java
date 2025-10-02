public class Rectangle implements Shape {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
