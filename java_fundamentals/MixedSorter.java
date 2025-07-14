import java.util.*;

public class MixedSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mixed input (int, float, char, string) separated by spaces:");
        String line = scanner.nextLine();
        String[] tokens = line.split("\\s+");

        List<Integer> intList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();
        List<Character> charList = new ArrayList<>();
        List<String> strList = new ArrayList<>();

        for (String token : tokens) {
            if (token.matches("^-?\\d+$")) {
                intList.add(Integer.parseInt(token));
            } else if (token.matches("^-?\\d*\\.\\d+$")) {
                floatList.add(Float.parseFloat(token));
            } else if (token.length() == 1 && Character.isLetter(token.charAt(0))) {
                charList.add(token.charAt(0));
            } else {
                strList.add(token);
            }
        }

        Collections.sort(intList);
        Collections.sort(floatList);
        Collections.sort(charList);
        Collections.sort(strList);

        System.out.println("Sorted Integers: " + intList);
        System.out.println("Sorted Floats: " + floatList);
        System.out.println("Sorted Characters: " + charList);
        System.out.println("Sorted Strings: " + strList);
    }
}
