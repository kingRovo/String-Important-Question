public class toggle_each_character_in_a_string  {

	public static void main(String[] args) {
	 
	 String str ="KingRovo";
	 String s1 = "";
	 for (int i = 0; i < str.length(); i++) {
		if(Character.isUpperCase(str.charAt(i))) 
			 s1=s1+Character.toLowerCase(str.charAt(i));
		else 
			 s1=s1+Character.toUpperCase(str.charAt(i));
	}
	System.out.println(str+"  =  "+s1);
	 
  }
	
}