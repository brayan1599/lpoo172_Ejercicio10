/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10_27;

/**
 *
 * @author user
 */
public class Ejercicio10_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a MyStringBuilder1 object
		MyStringBuilder1 str1 = new MyStringBuilder1("TEST");

		System.out.println("\nAppend the string \" MyStringBuilder1\" to string: " + 
			str1.append(new MyStringBuilder1(" MyStringBuilder1")));

		// Display string with the integer 101 append to it
		System.out.println("\nAppend integer 101 to the string: " + str1.append(101));

		// Display the length of str1
		System.out.println("\nLength of string: " + str1.length());

		// Display character at index 2
		System.out.println("\nCharacter at index 2: " + str1.charAt(2));

		// Display str1 as lowercase
		System.out.println("\nString to lower case: " + str1.toLowerCase());

		// Display the substring of str1 from index 1 to 3
		System.out.println("\nSubstring of string from index 1 to 3: " + 
			str1.substring(1, 3));

		// Return the string
		System.out.println("\nDisplay string: " + str1.toString());
    }
    
}
