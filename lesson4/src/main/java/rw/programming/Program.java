package rw.programming;

// Demonstrate the meaning of scopes.
public class Program {
    static int a = 1;
    public static void main(String[] args) {
        int b = a + 10;
        try {
            int c = b + 5;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(b);
//        System.out.println(c);
    }
}

