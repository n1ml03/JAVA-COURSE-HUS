public class Player {
    private int number;
    private float x;
    private float y;

    // Constructor
    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    // Move method
    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    // Jump method
    public void jump(float zDisp) {
        // this.z += zDisp;
    }

    // Near method (checks if a ball is near the player, distance < 8)
    public boolean near(Ball ball) {
        float dx = this.x - ball.getX();
        float dy = this.y - ball.getY();
        // float dz = this.z - ball.getZ();
        double distance = Math.sqrt(dx * dx + dy * dy);
        return distance < 8;
    }

    // Kick method (just a placeholder, behavior needs assumption)
    public void kick(Ball ball) {
        // Placeholder for the logic when the player kicks the ball
        // Can modify ball's position or add more logic
        System.out.println("Player " + number + " kicked the ball!");
    }
}
