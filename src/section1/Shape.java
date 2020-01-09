package section1;

public class Shape {
    protected String shapeName;

    double calculateArea() {
        return 0.0;
    }

    public Shape() {
        super();
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

}
