public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball(50, 50, 30, 10, 45);

        System.out.println("The X coordinate of ball is: " + b.getX());
        System.out.println("The Y coordinate of ball is: " + b.getY());
        System.out.println("The Radius of ball is: " + b.getRadius());
        System.out.println(b);

        b.setX(100);
        b.setY(100);
        b.setRadius(20);
        System.out.println(b);

        b.move();
        System.out.println(b);

        b.reflectHorizontal();
        b.move();
        System.out.println(b);

        b.reflectVertical();
        b.move();
        System.out.println(b);

        // Test for Player and Ball interaction
        Player player = new Player(1, 55, 55);
        System.out.println("Player is near the ball: " + player.near(b)); 

        player.move(10, 10);
        System.out.println("Player is near the ball: " + player.near(b));

        player.jump(5);
        System.out.println("Player is near the ball: " + player.near(b)); 

        player.kick(b);
    }
}
