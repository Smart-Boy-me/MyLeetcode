package Easy;

import java.util.Scanner;
import java.util.Stack;

public class solution {
	public boolean isLeftBracket(char ch) {
		if(ch == '(' || ch == '[' || ch == '{') return true;
		else return false;
	}
	
	public boolean isMatchBracket(char ch1, char ch2) {
		if( ch1=='(' && ch2==')') return true;
		if( ch1=='[' && ch2==']') return true;
		if( ch1=='{' && ch2=='}') return true;
		return false;
	}
	
	public boolean isValid(String s) {
		if(s.length() % 2 == 1)		return false;
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(isLeftBracket(ch))  stack.add(ch);
			else {
				if(stack.empty()) return false;
				else if ( !isMatchBracket(stack.pop(), ch) ) return false;
			}
		}
		if(!stack.empty())   return false;
		return true;
	}
}
