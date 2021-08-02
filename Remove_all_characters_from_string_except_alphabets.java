public class Remove_all_characters_from_string_except_alphabets {
    public static void main(String[] args) {
        String str = "KingRovo@986";
        System.out.println(str+"  =   "+str.replaceAll("[^a-zA-Z]", ""));

    }
}
