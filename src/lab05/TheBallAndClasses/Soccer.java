package lab05.TheBallAndClasses;

public class Soccer {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 5, 2, 45);

        Player player1 = new Player("Player1", 10, 20);
        Player player2 = new Player("Player2", 30, 40);
        Player player3 = new Player("Player3", 60, 80);

        // Display initial positions
        System.out.println("Initial positions:");
        System.out.println(ball);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

        // Player1 kicks the ball
        player1.kick(ball, 3, 60);

        // Display ball after kick
        System.out.println("\nAfter kick by Player1:");
        System.out.println(ball);

        // Move the ball
        ball.move();

        // Display ball position after move
        System.out.println("\nAfter ball move:");
        System.out.println(ball);

        // Player2 kicks the ball
        player2.kick(ball, 4, 120);

        // Display ball after kick
        System.out.println("\nAfter kick by Player2:");
        System.out.println(ball);

        // Move the ball
        ball.move();

        // Display ball position after move
        System.out.println("\nAfter ball move:");
        System.out.println(ball);

        // Player3 kicks the ball
        player3.kick(ball, 5, 300);

        // Display ball after kick
        System.out.println("\nAfter kick by Player3:");
        System.out.println(ball);

        // Move the ball
        ball.move();

        // Display ball position after move
        System.out.println("\nAfter ball move:");
        System.out.println(ball);
    }
}

