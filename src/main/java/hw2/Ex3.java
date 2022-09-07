package hw2;

public class Ex3 {

    public static void main(String[] args) {


        Ex3 ex3 = new Ex3();

        System.out.println(ex3.fuzzySearch("car", "ca6$$#_rtwheel")); // true
        System.out.println(ex3.fuzzySearch("cwhl", "cartwheel")); // true
        System.out.println(ex3.fuzzySearch("cwhee", "cartwheel")); // true
        System.out.println(ex3.fuzzySearch("cartwheel", "cartwheel")); // true
        System.out.println(ex3.fuzzySearch("cwheeel", "cartwheel")); // false
        System.out.println(ex3.fuzzySearch("lw", "cartwheel")); // false
    }

    public boolean fuzzySearch(String expecting, String fullString) {

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

