package section1;

public class Square extends Shape {
    int side;

    double calculateArea() {
        return (side * side);
    }

    public Square(int side) {
        super();
        this.side = side;
    }

    public Square(int side, String shapeName) {
        super(shapeName);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
