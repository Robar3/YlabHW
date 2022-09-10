package hw2;

public class Exercise3 {

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(fuzzySearch("lw", "cartwheel")); // false
    }

    public static boolean fuzzySearch(String expecting, String fullString) {

        char[] expectingChar = expecting.toCharArray();
        char[] fullStringChar = fullString.toCharArray();

        int i = 0;
        for (char c : fullStringChar) {
            if (expectingChar[i] == c) {
                i++;
                if (i == expectingChar.length) {
                    return true;
                }
            }
        }
        return false;
    }


}

