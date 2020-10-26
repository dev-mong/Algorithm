package ex18_strToInt;

//문자열 정수로 바꾸기

public class Solution1 {

	public static int solution(String s) {
		int answer = 0;
		char c = ' ';
		int num = 1;

		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);

			if (c == '-') {
				num = -1;
			} else if (c != '+') {
				answer = answer * 10 + ((int) (c) - 48);
			}
		}
		answer = answer * num;
		return answer;
	}

	public static void main(String[] args) {

		String s = "+1234";
		solution(s);
	}

}
