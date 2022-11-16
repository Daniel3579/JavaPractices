package Practice_3;

public class TestMovable {
    public static void main(String[] args) {
        MovableRectangle r = new MovableRectangle();

        r.moveUp();
        r.moveRight();

        if (r.speedCheck()) {
            System.out.println(r);

        } else {
            System.out.println("Point speeds are different");
        }
    }
}
