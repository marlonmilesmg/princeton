public class GreatCircle {
    public static void main(String[] args) {
        double x1, y1, x2, y2, latRad, longRad, latRad1, longRad1;
        double a1, b1, a2, b2, c, d, distance;
        final double r = 6371.0;

        x1 = StdIn.readDouble();
        y1 = StdIn.readDouble();
        x2 = StdIn.readDouble();
        y2 = StdIn.readDouble();

        latRad = Math.toRadians(x1);
        longRad = Math.toRadians(y1);
        latRad1 = Math.toRadians(x2);
        longRad1 = Math.toRadians(y2);

        a1 = Math.sin(latRad);
        b1 = Math.cos(latRad);
        a2 = Math.sin(latRad1);
        b2 = Math.cos(latRad1);

        c = Math.cos(longRad1 - longRad);

        d = (a1 * a2) + (b1 * b2 * c);

        distance = (r * Math.acos(d)) + 0.5;

        System.out.println(distance + " kilometers");
    }
}
