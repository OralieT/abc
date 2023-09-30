package bai;

public class Chuoi {
	public static String encode(String text, byte password) {
		String result = "";
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			result += Character.valueOf((char) (ch ^ password));
		}

		return result;
	}
	
	public static void main(String[] args) {
		String text = "This is my text: ";
		byte password = 10;
		
		String encoded = encode(text, password);
		
		System.out.println(encoded);
		System.out.println(encode(encoded, password));
	}

}
