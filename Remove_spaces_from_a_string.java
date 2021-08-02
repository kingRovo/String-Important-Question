public class Remove_spaces_from_a_string {
    public static void main(String[] args) {
        String str = "Updesh Yadav - King Rovo";
        System.out.println(str + "  =  " + str.replaceAll(" ", ""));

        // ############################## without Replace Method  #####################################

        char[] chrArr = str.toCharArray();
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < chrArr.length; i++) {
            if( (chrArr[i] != ' ') && (chrArr[i]!= '\t' )) {
                bf.append(chrArr[i]);
            }    	
             }
        System.out.println(str + "  =  " + bf);
    }
}
