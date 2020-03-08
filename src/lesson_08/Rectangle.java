package lesson_08;



public class Rectangle extends Shape implements Id {
    private static final String NAME = "Rectangle";
    private double width;
    private double height;

    Rectangle

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter(){
        return 2*(width + height);
    }
    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle ("width ="+width+", height = Double.parseDouble("+height+"), +super.toString() + ");

    }

    @Override
    public String getid() {
        return null;
    }
}

