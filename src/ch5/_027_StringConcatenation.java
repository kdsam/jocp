package ch5;


public class _027_StringConcatenation {

    public static void main(String[] args) throws InterruptedException {

        String s4 = "1" + 2 + 3;
        String s5 = 1 + 2 + "3";
        System.out.println(s4); // 123
        System.out.println(s5); // 33

    }
}
