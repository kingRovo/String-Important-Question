
public class Length_of_the_string_without_using_pre_define_function {

    public static void main(String[] args) {
        String str = "KingRovo";
        int len=0;;
        for (char i : str.toCharArray()) len++;

        System.out.println("String Length : "+len);      
    }
    
}
