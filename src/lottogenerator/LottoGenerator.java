package lottogenerator;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LottoGenerator {

    public static void main(String[] args) throws IOException {

        int generatedN = 1000;
        int maxNumber = 58;
        int nElements = 6;
        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yy_MM_dd");
        String formattedString = dateNow.format(dateFormatter);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("winningnumbers_" + formattedString  + ".txt"))) {

            for (int i = 0; i < generatedN; i++) {
                Set<Integer> winningCombination = new HashSet<>(nElements);
                while (winningCombination.size() < nElements) {
                    winningCombination.add(generateRandomNumber(maxNumber));
                }

                String s = winningCombination.stream()
                        .map(num -> String.valueOf(num))
                        .collect(Collectors.joining(",\t"));


                String formatted = String.format("%s%03d%s%s%s", "#", i + 1, ":\t", s, System.lineSeparator());
                writer.write(formatted);
                System.out.println(formatted);
            }
        }
    }

    static int generateRandomNumber(int ceiling) {
        return (int) (Math.random() * ceiling + 1);
    }
}
