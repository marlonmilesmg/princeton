public class CMYKtoRGB {
    public static void main(String[] args) {

        double white;
        int r, g, b;

        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        b = (int) (255 * (1 - y) * (1 - k));
        white = 1 - b;
        r = (int) ((int) (255 * white) * (1 - c));
        g = (int) ((int) (255 * white) * (1 - m));

        System.out.println("Red = " + r);
        System.out.println("Green = " + g);
        System.out.println("Blue = " + b);

    }
}
