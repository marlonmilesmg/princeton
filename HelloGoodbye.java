

public class HelloGoodbye {
    public static void main(String[] args) {

        String name, name1;

        name = StdIn.readString();
        name1 = StdIn.readString();

        System.out.println("Hello " + name + " and " + name1);
        System.out.println("Goodbye " + name1 + " and " + name);
    }
}
