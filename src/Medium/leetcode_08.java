package Medium;


import java.util.regex.Pattern;

public class leetcode_08 {
	
	public int myAtoi(String str) {
		if(str.length() == 0) return 0;
		int i=0;
		while(i<str.length()) {
			if(str.charAt(i) != ' ') break;
			i++;
		}
		if(i == str.length()) return 0;
		
		boolean isNegative = false;
		char ch = str.charAt(i);
		if(ch >= '0' && ch <= '9') ;
		else if(ch == '-' || ch == '+') {
			i++;
			if(ch == '-') isNegative = true;
		}
		else return 0;
		if(i == str.length() || str.charAt(i) < '0' || str.charAt(i) >'9') return 0;
		Pattern pattern = Pattern.compile("\\D+");
		String[] strings = pattern.split(str.substring(i));
		try {
			int num = Integer.parseInt(strings[0]);
			if(isNegative) num = -num;
			return num;
		} catch (Exception e) {
			return isNegative ? -2147483648 : 2147483647 ;
		}
	}

	
	public static void main(String[] args){
		leetcode_08 l_08 = new leetcode_08();
		int num = l_08.myAtoi("+-2");
		System.out.println(num);
	}
}
