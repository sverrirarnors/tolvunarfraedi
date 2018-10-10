import java.awt.event.KeyEvent;

public class PongEndurbaett {
    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values of ball
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // initial values of paddle
        double[] px = {-0.2, 0.2, 0.2, -0.2};
        double[] py = {-0.85, -0.85, -.90, -0.90};
        double dpx = 0.018;                 // inc. paddle movement

        // KASSI
        double[] kassi = {Math.random()*1.4 -0.7, Math.random()*0.4 + 0.5, 0.1};

        //HALDA UTAN UM STIG
        int stig = 0;
        // main animation loop
        while (true)  {

            // bounce ball off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

            // update ball position
            rx = rx + vx;
            ry = ry + vy;

            // check if paddle moved
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && px[0]-dpx >= -1.0 )
                for (int i=0; i<4; i++)  px[i] -= dpx;
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) && px[1]+dpx <= 1.0 )
                for (int i=0; i<4; i++)  px[i] += dpx;


            // a) BOLTI SNÝR VIÐ ÞEGAR HANN LENDIR Á SLÁ
            if ((px[0]< (rx + vx)) && ((rx + vx) < px[1]) && (ry + vy <= (py[2]+radius))){
              vy = -vy;
            }
            // b) KASSI Í EFRI HLUTA
            if (((rx + vx > kassi[0] - radius - 0.1) && (rx + vx < kassi[0] + radius + 0.1)) && (ry + vy > kassi[1] - radius - 0.1) && (ry + vy < kassi[1] + radius + 0.1)){
              kassi[0] = Math.random()*1.4 -0.7;
              kassi[1] = Math.random()*0.4 + 0.5;

              //d) HALDA UTAN UM STIG
              stig++;
            }

            // c) BILSTÖNG BREYTIR HRAÐA OG STEFNU
            if (StdDraw.isKeyPressed(KeyEvent.VK_SPACE)){
              vx = (Math.random()*0.04 - 0.02);
              vy = (Math.random()*0.04 - 0.02);
            }
            // D) LEIKUR BÚINN ÞEGAR BOTNI ER NÁÐ
            if (ry + vy < -1.0 + radius){
              StdDraw.setPenColor(StdDraw.RED);
              StdDraw.text(0,0,"Leikur búinn");
              break;
            }

            StdDraw.clear();

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(rx, ry, radius);

            //BIRTA STIG
            StdDraw.text(0.8,0.8, ""+ stig);

            // draw paddle on the screen
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledPolygon(px, py);

            //TEIKNA KASSA
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledSquare(kassi[0],kassi[1],kassi[2]);

            // display and pause for 20 ms
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
