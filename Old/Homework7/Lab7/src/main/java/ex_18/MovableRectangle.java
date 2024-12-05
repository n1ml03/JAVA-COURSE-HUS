package ex_18;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.setY(topLeft.getY() - topLeft.getySpeed());
        bottomRight.setY(bottomRight.getY() - bottomRight.getySpeed());
    }

    @Override
    public void moveDown() {
        topLeft.setY(topLeft.getY() + topLeft.getySpeed());
        bottomRight.setY(bottomRight.getY() + bottomRight.getySpeed());
    }

    @Override
    public void moveLeft() {
        topLeft.setX(topLeft.getX() - topLeft.getxSpeed());
        bottomRight.setX(bottomRight.getX() - bottomRight.getxSpeed());
    }

    @Override
    public void moveRight() {
        topLeft.setX(topLeft.getX() + topLeft.getxSpeed());
        bottomRight.setX(bottomRight.getX() + bottomRight.getxSpeed());
    }
}
