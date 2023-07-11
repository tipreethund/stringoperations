package strings;

public class DiffStringMethods2 {

	public static void main(String[] args) {
		String s1="Oracle";
		String s2="Java";
		String s3="Python";
		String s4="Hello,welcome to Java classes";
		char ch=s1.charAt(3);		//charAt returns the char value at the 3rd index
		System.out.println(ch);
		System.out.println(s2.compareTo(s3));
		System.out.println(s4.contains("Hello"));	//searches for the sequence of the characters
		System.out.println(s4.contains("welcome"));	//returns true if it matches or else false
		System.out.println(s3.contains("oracle)"));
		System.out.println(s4.endsWith("hello"));	//checks if the string ends with a given suffix 
		System.out.println(s2.endsWith("Java"));	//if yes it returns true or else false
		System.out.println(s2.equalsIgnoreCase(s4));	//compares 2 strings irrespective of the case
		System.out.println(s1.equalsIgnoreCase(s4));
		String date =String.join("/","12","2","2014"); //returns a string joined with given delimiter
		System.out.println(date);
		System.out.println(s4.startsWith("Hello"));	//checks and returns true if the string starts with 
		System.out.println(s1.startsWith("oops"));	//given prefix or not or else returns false
		int a=40;
		String s5=String.valueOf(a);	//converts diff types of values into string
		System.out.println(s5+20);
		}

}
