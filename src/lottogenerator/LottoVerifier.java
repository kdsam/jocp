package lottogenerator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LottoVerifier {

    public static void main(String[] args) throws IOException {

        /************ USER INPUT HERE **********/
        List<Integer> winningNumbers = Arrays.asList(46, 25, 55, 26, 50, 57);
        String fileName = "winningnumbers_18_09_29.txt";



        /************ READER **********/
        Path path = Paths.get(fileName);
        List<String> combinations = null;
        try (Stream<String> lines = Files.lines(path)) {
            combinations = lines.collect(Collectors.toList());
            System.out.println("Combinations size: " + combinations.size());
        }

        LocalDate dateNow = LocalDate.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yy_MM_dd");
        String formattedString = dateNow.format(dateFormatter);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("lottoReport_" + formattedString + ".txt"))) {

            for(String combi: combinations) {
                String[] splitted = combi.replaceAll(",", "").split("\\s+");

                List<String> hits = new ArrayList<>();
                StringBuilder lineReportBuilder = new StringBuilder(combi);
                lineReportBuilder.append("\t").append("HITS: ");

                int countHits = 0;
                for(int i = 1; i < splitted.length; i++) {
                    String current = splitted[i];
                    if (winningNumbers.contains(Integer.parseInt(splitted[i]))) {
                        countHits++;
                        hits.add(current);
                    }
                }
                lineReportBuilder.append(countHits).append("\t").append(hits);

                if(countHits == 6) {
                    lineReportBuilder.append("\t!!!!!!!!!!! JACKPOT !!!!!!!!!!!");
                } else if (countHits == 5) {
                    lineReportBuilder.append("\t!!! MAJOR WIN !!!");
                } else if (countHits == 4) {
                    lineReportBuilder.append("\t!! MINOR WIN !!!");
                } else if (countHits == 3) {
                    lineReportBuilder.append("\t! CONSOLATION PRIZE !");
                }
                lineReportBuilder.append(System.lineSeparator());
                String lineReport = lineReportBuilder.toString();
                writer.write(lineReport);
                System.out.println(lineReport);
            }
        }

    }
}
