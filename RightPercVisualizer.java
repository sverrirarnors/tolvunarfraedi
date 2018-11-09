public class RightPercVisualizer {
    public static void main(String[] args) {
        int n      = Integer.parseInt(args[0]);
        double p   = Double.parseDouble(args[1]);
        int trials = Integer.parseInt(args[2]);

        // repeatedly created n-by-n matrices and display them using standard draw
        StdDraw.enableDoubleBuffering();
        for (int t = 0; t < trials; t++) {
            boolean[][] open = RightPercolation.random(n, p);
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLACK);
            RightPercolation.show(open, false);
            StdDraw.setPenColor(StdDraw.GRAY);
            boolean[][] full = RightPercolation.flow(open);
            RightPercolation.show(full, true);
            StdDraw.show();
            StdDraw.pause(5000);
        }
    }
}
