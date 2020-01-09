package section2;

public class Square extends Shape {
    int side;

    double calculateArea() {
        return (side * side);
    }

    public Square(int side) {

        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

}
