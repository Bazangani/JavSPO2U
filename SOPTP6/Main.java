import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(new Vector(0, 1), new Vector(0, 0), 1);
        double t = 0;
        double dt = 0.01;
        //The loop continues until t reaches 10 seconds, and at each iteration,
        // it writes the current time and ball position to a file named "ball_coordinates.txt". 
        try (FileWriter writer = new FileWriter("ball_coordinates.txt")) {
            while (t < 10) {
                //The ball position is obtained by calling ball.getPosition().getX() and ball.getPosition().getY(). 
                //The update(dt) method is called on the Ball object to update its position and velocity at each iteration. 
                //Finally, the loop increments the time t by `dt
                ball.update(dt);
                writer.write(t + " " + ball.getPosition().getX() + " " + ball.getPosition().getY() + "\n");
                t += dt;
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
