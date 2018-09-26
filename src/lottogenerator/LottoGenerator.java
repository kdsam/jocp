package lottogenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoGenerator {

    public static void main(String[] args) {

        int generatedN = 100;
        int maxNumber = 58;
        int nElements = 6;

        for(int i = 0; i < generatedN; i++) {


            Set<Integer> winningCombination = new HashSet<>(nElements);
            while (winningCombination.size() < nElements) {
                winningCombination.add(generateRandomNumber(maxNumber));
            }

            String s = winningCombination.stream()
                    .map(num -> String.valueOf(num))
                    .collect(Collectors.joining(",\t"));


            String formatted = String.format("%03d", i + 1);
            System.out.println("#" + formatted + ":\t"  + s);
        }

    }

    static int generateRandomNumber(int ceiling) {
        return (int) (Math.random() * ceiling + 1) ;
    }
}
