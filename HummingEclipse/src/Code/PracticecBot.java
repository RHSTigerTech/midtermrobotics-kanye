package Code;

import com.birdbraintechnologies.HummingbirdRobot;
import edu.cmu.ri.createlab.audio.AudioHelper;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class PracticecBot extends HummingbirdRobot {
    public static void main(String[] args) throws IOException, InterruptedException {
        PracticecBot kanye = new PracticecBot();
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("");
        boolean stop = true;
        String[] sussy = new String[10];
        Scanner input = new Scanner(System.in);
        byte[] song = PlaySound
                .fileToByte("C:\\Users\\david.pena\\Downloads\\HummingEclipse\\HummingEclipse\\src\\Code\\tomp.wav");
        System.out.println(song.length);
        // for (byte b : song) {
        // System.out.println(b);
        // }
        int count = 0;
        boolean already_active = true;
        int SensorValue;
        int SensorValue2;
        while (true) {
            System.out.println("Add words: ");
            String phrase = input.nextLine();
            sussy[count++] = phrase;
            if (count == 5) {
                System.out.println(sussy);
                break;
            }
        }
        String word = "";
        System.out.println("Press ENTER to quit.");
        while (stop) {
            // check whether the user pressed a key
            if (in.ready()) {
                stop = false;
            }
            if (kanye.getSensorValue(1) > 50) {
                // kanye.playClip(song);
                Thread.sleep(500);
                kanye.setServoPosition(1, 5);
                kanye.setFullColorLED(1, 255, 0, 0);
                kanye.setFullColorLED(2, 255, 0, 0);
                kanye.setServoPosition(2, 175);
                kanye.speak(word = sussy[(int) (Math.random() * 5)]);
                System.out.println(word.toUpperCase());
                Thread.sleep(2000);
                kanye.setServoPosition(1, 175);
                kanye.setServoPosition(2, 5);
                kanye.setFullColorLED(1, 0, 0, 0);
                kanye.setFullColorLED(2, 0, 0, 0);
                Thread.sleep(500);
                already_active = false;
            }
            System.out.println(kanye.getSensorValue(1));
            SensorValue = kanye.getSensorValue(1);
            Thread.sleep(100);
            SensorValue2 = kanye.getSensorValue(1);

            if (SensorValue < 50 && SensorValue2 > 50) {
                already_active = true;
            }
            Thread.sleep(500);

        }
        kanye.disconnect();
    }
}
