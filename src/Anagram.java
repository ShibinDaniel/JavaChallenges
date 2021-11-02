import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "java2BLog";
        String anagram = "aj2vabol";
 
        System.out.println("java2blog and aj2vabgol are anagrams :" + isAnagramUsingArraySort(word, anagram));
 

	}
	public static boolean isAnagramUsingArraySort(String word, String anagram) {
		String CharWord = WordChar(word);
		String CharAnagram = WordChar(anagram);
		return CharWord.equals(CharAnagram);
	}
	public static String WordChar(String word) {
		char[] wordArr = word.toLowerCase().toCharArray();
		Arrays.sort(wordArr);
		return String.valueOf(wordArr);
	}
}
