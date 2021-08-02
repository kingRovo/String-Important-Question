public class Couthe_sum_of_numbers_in_a_string {
    public static void main(String[] args) {
        String str = "KingRovo986";
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){

                sum=sum+Character.getNumericValue(str.charAt(i));

            }
        }
        System.out.println("Sum of Numeric Digits = "+sum);
            
        
    }
}
