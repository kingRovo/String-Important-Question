public class Remove_brackets_from_an_algebraic_expression {
    public static void main(String[] args) {
        String str = "{(3+5)*(21/7)-{5+0}}";
      
        System.out.println(str.replaceAll("[{}()]", ""));
        
    

    }
}
