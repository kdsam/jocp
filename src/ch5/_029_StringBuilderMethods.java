package ch5;


public class _029_StringBuilderMethods {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder b = new StringBuilder();
        b.append(12345).append('-');
        System.out.println(b.length()); // 6
        System.out.println(b.indexOf("-")); // 5
        System.out.println(b.charAt(2)); // 3

        StringBuilder b2 = b.reverse();
        System.out.println(b.toString()); // -54321
        System.out.println(b == b2); // true
    }
}
