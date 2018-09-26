package lottogenerator;

public class LottoGenerator {

    public static void main(String[] args) {

        int generatedN = 100;
        int maxNumber = 55;

        for(int i = 0; i < generatedN; i++) {
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < 6; j ++){
                sb.append(generateRandomNumber(maxNumber));
                        if (j != 5) {
                            sb.append(", ");
                        }

            }
            System.out.println(sb.toString());
        }

    }

    static int generateRandomNumber(int ceiling) {
        return (int) (Math.random() * ceiling + 1) ;
    }
}
