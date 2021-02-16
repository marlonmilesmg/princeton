public class RightTriangle {
    public static void main(String[] args) {

        int a2, b2, c2, m1, m2, m3;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        a2 = (int) Math.pow(a, 2);
        b2 = (int) Math.pow(b, 2);
        c2 = (int) Math.pow(c, 2);

        m1 = a2 + b2;
        m2 = a2 + c2;
        m3 = b2 + c2;

        if (a > 0 && b > 0 && c > 0) {
            if (m1 == c2 || m3 == a2 || m2 == b2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
