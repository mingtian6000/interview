package interview.hsbc.mycode;

import java.util.ArrayList;

public class App {
	
	public ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> result = new ArrayList<String>();
		if (digits == null)
			return result;

		// initialize the keyboard
		String[] keyboard = { "", "", "abc", "def", "ghi", "jkl", "mno",
				"pqrs", "tuv", "wxyz" };
		StringBuilder current = new StringBuilder();

		int index = 0;
		
		// array, index, stringbuilder, keyboard, result<Array>
		buildResult(digits, index, current, keyboard, result);
		return result;
	}

	
	private void buildResult(String digits, int index, StringBuilder current,
			String[] keyboard, ArrayList<String> result) {
		if (index == digits.length()) {
			result.add(current.toString());
			return;
		}

		// get integer number
		int num = digits.charAt(index) - '0';
		
		// for 0 and 1 just skip , if input is 03, its result equals 3.
		if (num == 1 || num == 0) {
			buildResult(digits, index + 1, current, keyboard, result);
		} else {
			for (int i = 0; i < keyboard[num].length(); i++) {
				current.append(keyboard[num].charAt(i));
				// only shift index in this loop call!
				buildResult(digits, index + 1, current, keyboard, result);
				current.deleteCharAt(current.length() - 1);
			}
		}
	}

//	public static void main(String args[]) {
//		App app = new App();
//		ArrayList<String> result = app.letterCombinations("23458");
//		for (String i : result) {
//			System.out.print(i + " ");
//		}
//
//	}
}
