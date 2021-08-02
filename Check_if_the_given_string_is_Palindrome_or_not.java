public class Check_if_the_given_string_is_Palindrome_or_not {
    static String isPaliString(String str){
        String dupl ="";
        for (int i = str.length()-1; i>=0 ; i--) {
            dupl = dupl+str.charAt(i);
        }
        return dupl;
    }
    public static void main(String[] args) {
        String str = "Naman";
        System.out.println(str.equalsIgnoreCase(isPaliString(str))?"String is Palindrom":"not Palindrom"); 
    }
}
