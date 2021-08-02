public class Capitalize_the_first_and_last_character_of_each_word_of_a_string {

    static char rtrnCap(char ch) {

        return (char) (ch >= 'a' && ch <= 'z' ? ((int) ch - 32) : (int) ch);
    }

    public static void main(String[] args) {

        String str = "practice makes perfect";

        char[] chr = str.toCharArray();
        int n = chr.length - 1;
        chr[0] = rtrnCap(chr[0]);
        chr[n] = rtrnCap(chr[n]);;
        for (int i = 1; i < n; i++) {

            if (chr[i + 1] == ' ' || chr[i - 1] == ' ') {

                chr[i] = rtrnCap(chr[i]);

            }
        }
        for (int i = 0; i < chr.length; i++) {

            System.out.print(chr[i]);

        }
    }

}
