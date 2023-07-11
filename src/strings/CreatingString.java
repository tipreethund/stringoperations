package strings;
/*program of creating a string*/
public class CreatingString {

	public static void main(String[] args) {
		String s1="Java";		//creating string by java string literal
		char ch[]= {'l','a','n','g','u','a','g','e'};
		String s2=new String(ch);		//converting char array into string
		String s3=new String ("has concepts like arrays");	//creating java string by new keyword
		String s4="& strings etc";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
