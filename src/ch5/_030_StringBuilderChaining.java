package ch5;


public class _030_StringBuilderChaining {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder s = new StringBuilder("abcde");
        s.insert(1, '-').delete(3, 4);
        System.out.println(s); //a-bde
        System.out.println(s.substring(2, 4)); // bd
    }
}
