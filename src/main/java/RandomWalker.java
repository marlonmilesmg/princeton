public class RandomWalker {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int step = 0;
        double R;

        while (Math.abs(x) + Math.abs(y) < r) {
            step++;
            R = Math.random();
            if (R <= 0.25) x++;
            else if (R <= 0.50) x--;
            else if (R <= 0.75) y++;
            else if (R <= 1.00) y--;

            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + step);
    }
}