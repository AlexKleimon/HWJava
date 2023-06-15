package OOP.HomeWork03.task_1;

public class Rectangle {
    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle() {
        this.width = 2;
        this.height = 4;
    }

    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(float wh) {
        this.width = wh;
        this.height = wh;
    }

    public float calculateArea() {
        return height * width;
    }

    public float calculatePerimeter() {
        return 2 * (width + height);
    }
}
