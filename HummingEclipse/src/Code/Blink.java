package Code;

import com.birdbraintechnologies.HummingbirdRobot;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blink {
    public static void main(String[] args) throws InterruptedException, IOException {
        // Create a new PracticeBot object
        PracticecBot kanye = new PracticecBot();
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        System.out.println("Press ENTER to quit.");
        int targetColorIndex = 1;
        while (true) {
            // check whether the user pressed a key
            if (in.ready()) {
                break;
            }
            kanye.setMotorVelocity(1, 1);
        }
    }
}