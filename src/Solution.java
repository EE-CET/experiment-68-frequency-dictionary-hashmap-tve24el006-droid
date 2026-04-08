import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine().trim();
        String[] words = line.split("\\s+");

        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        StringBuilder output = new StringBuilder();

        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            output.append(entry.getKey())
                  .append(": ")
                  .append(entry.getValue())
                  .append(" ");
        }

        System.out.print(output.toString().trim());

        scanner.close();
    }
}
