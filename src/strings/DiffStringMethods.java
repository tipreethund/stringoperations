package strings;
/*program of string to find length of a string & java string equals method & is empty method*/
/*Also consists of concat method & replace strings method,substring,lowercase,uppercase methods,trim method*/
public class DiffStringMethods {

	public static void main(String[] args) {
		String s1="NEWYORK";
		String s2="Texas";
		String s3="Newyork";
		String s4="";
		String s5="Texas has many beaches";
		String st=s5.replace("has", "consists of");
		s1=s1.concat(" is a business city");		//concat method
		System.out.println("Length of the  first string is:"+s1.length());	//length of a string
		System.out.println("Length of the second string is:"+s2.length());
		System.out.println(s1.equals(s2));		//equals method
		System.out.println(s1.equals(s3));
		System.out.println(s1.isEmpty());		//isEmpty method
		System.out.println(s4.isEmpty());
		System.out.println(s1);
		System.out.println(st);
		System.out.println(s1.substring(3,5));		//substring method
		System.out.println(s2.substring(1));
		System.out.println(s1.toLowerCase());		//toLowercase method
		System.out.println(s2.toUpperCase());		//toUppercase method
		System.out.println(s5.trim()+"and visiting places");		//trim method
	}

}
