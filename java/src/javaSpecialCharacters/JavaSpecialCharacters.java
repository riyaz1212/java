package javaSpecialCharacters;

public class JavaSpecialCharacters {

	public static void main(String[] args) {
		
		//Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
	
		//The solution to avoid this problem, is to use the backslash escape character.


		String txt = "We are the so-called \"Vikings\" from the north.";

		System.out.println(txt);
	}
	

}
