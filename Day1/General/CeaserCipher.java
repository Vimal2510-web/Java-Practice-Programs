package General;

import java.util.Scanner;

public class CeaserCipher {
	
	private static String encrypt(String text, int shift) {
		
		StringBuilder result = new StringBuilder();
		
		for(char ch : text.toCharArray()) {
			if(Character.isLetter(ch)) {
				char base = Character.isUpperCase(ch) ? 'A' : 'a';
				result.append((char) ((ch - base + shift) % 26 + base));
				
			}else {
				result.append(ch);
			}
			
		}
		return result.toString();
		
	}
	
	private static String decrypt(String text , int shift) {
		return encrypt(text, 26-shift);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the text : " );
		String text = scanner.nextLine();
		
		System.out.println("Enter the Shift : ");
		int shift = scanner.nextInt();
		
		String encrypted = encrypt(text, shift);
		String decrypted = decrypt(encrypted, shift);
		
		System.out.println("Encrypted text : " + encrypted);
		System.out.println("Decrypted text : " + decrypted);
		scanner.close();
	}

}
