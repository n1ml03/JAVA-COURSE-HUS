package ex_18;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public String toString() {
        return center.toString() + ", radius=" + this.radius;
    }

    @Override
    public void moveUp() {
        center.setY(center.getY() - center.getySpeed());
    }

    @Override
    public void moveDown() {
        center.setY(center.getY() + center.getySpeed());
    }

    @Override
    public void moveLeft() {
        center.setX(center.getX() - center.getxSpeed());
    }

    @Override
    public void moveRight() {
        center.setX(center.getX() + center.getxSpeed());
    }
}

