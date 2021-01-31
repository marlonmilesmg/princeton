public class CMYKtoRGB {
    public static void main(String[] args) {

        double c, m, y, k, white;
        int r, g, b;

        c = StdIn.readDouble();
        m = StdIn.readDouble();
        y = StdIn.readDouble();
        k = StdIn.readDouble();

        b = (int) (255 * (1 - y) * (1 - k));
        white = 1 - b;
        r = (int) ((int) (255 * white) * (1 - c));
        g = (int) ((int) (255 * white) * (1 - m));

        System.out.println("Red = " + r);
        System.out.println("Green = " + g);
        System.out.println("Blue = " + b);

    }
}
