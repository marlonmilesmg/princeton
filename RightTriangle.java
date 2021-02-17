public class RightTriangle {
    public static void main(String[] args) {

        int a2, b2;
        boolean isRightTriangle;

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        a2 = (a * a) + (b * b);
        b2 = (c * c);

        isRightTriangle = (a2 == b2);
        System.out.println(isRightTriangle);

    }
}
