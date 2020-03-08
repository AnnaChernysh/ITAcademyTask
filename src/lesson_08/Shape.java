package lesson_08;

public abstract class Shape {

    public Shape (String id) {
        this.id = id;}

        public String getId() {
        return id;}

    public abstract String getName();
    public abstract double getArea();
    public abstract double getPerimeter();


    public String toString( ) {
        return "Shape(id="+id+", name="+getName()+", area="+getArea()+")";}

    private String id;
}





