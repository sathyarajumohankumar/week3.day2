package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueChar {

	public static String name = "SATHYA";
	public static Set<Character> uniqueSet = new LinkedHashSet<Character>();

	public char[] stringToCharArr(String input) {
		char[] charArray = input.toCharArray();
		return charArray;}

	public Set<Character> Unique(char[] charArray) {

		for (int i = 0; i < charArray.length; i++) {
			if (!(uniqueSet.contains(charArray[i]))) {
				uniqueSet.add(charArray[i]);
			} else
				uniqueSet.remove(charArray[i]);
		}
		return uniqueSet;
	}

	public static void main(String[] args) {

		UniqueChar uc = new UniqueChar();

		uniqueSet = uc.Unique(uc.stringToCharArr(name));
		System.out.println(uniqueSet);


	}  

}