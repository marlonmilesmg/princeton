public class GeneralizedHarmonic {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);

        double sum = 0.0;
        for (r = 1; r <= n; r++) {
            sum += 1.0 / r;
        }

        System.out.println(sum);
    }
}
