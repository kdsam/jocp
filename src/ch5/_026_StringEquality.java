package ch5;


public class _026_StringEquality {

    public static void main(String[] args) throws InterruptedException {

        String s1 = "bunny";
        String s2 = "bunny";
        String s3 = new String("bunny");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true

    }
}
