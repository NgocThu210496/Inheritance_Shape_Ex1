package ra.inheritance;

public class Shape {
    private String color;
    private boolean filled; //điền vào

    public Shape(String color, boolean filled) { //giá trị của đối số truyền vào
        this.color = color;
        this.filled = filled;
    }

    public Shape() { //không cần đối số đầu vào (default values)
        this.color = "Green";
        this.filled = true;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled ");
    }
}
