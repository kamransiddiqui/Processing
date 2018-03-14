import com.sun.tools.hat.internal.model.JavaThing;
import processing.core.PApplet;

public class MainApp extends PApplet{

    public static void main(String[] args){
        PApplet.main("MainApp", args);
    }

    float[] sineWave;

    public void settings() {
        size(800,600);
    }

    public void setup() {
        strokeWeight(8);

//        sineWave = new float[width];
//        for (int i = 0; i < sineWave.length; i++) {
//            // Fill array with values from sin()
//            float r = map(i, 0, width, 0, TWO_PI);
//            sineWave[i] = abs(sin(r));
//        }
    }

    public void draw() {
        fill(255,0,0);
        beginShape();
        vertex(1,2);
        vertex(2,3);
        vertex(3,4);
        vertex(4,5);
// etc;
        endShape();
        if (mousePressed == true) {
            fill(255,0,0); // Red
        } else {
            fill(0); // Black
        }
        rect(25, 25, 50, 50);

    }

    public void mouseDragged() { // Move black circle
        ellipse(mouseX, mouseY, 50, 50);
    }
}
