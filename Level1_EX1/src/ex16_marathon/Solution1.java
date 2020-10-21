package ex16_marathon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

//동일한 참가자(동일 문자열)이 있으므로 같은 값을 비교하기 위해 HashMap에 저장한다
//iterator 인터페이스를 이용헤서 해당 값이 있으면 해당 문자열의 제외하고 비교한다

public class Solution1 {

	public static String solution(String[] participant, String[] completion) {
		String answer = ""; // 완주 하지 못한 선수 저장

		
		Arrays.sort(participant);
		
		System.out.println(Arrays.toString(participant));
		
		
		HashMap<String, Integer> part_list = new HashMap<String, Integer>();
		// HashMap<String, Integer> com_list = new HashMap<String, Integer>();

		for (int i = 0; i < participant.length; i++) {

			if (part_list.containsKey(participant[i])) { // 동일 이름의 참가자가 있을 때
				int cnt = part_list.get(participant[i]); // key값에 대한 value를 반환
				part_list.put(participant[i], cnt + 1); // 동일 key 값이 있으면 value 값을 증가 시켜서 저장

			} else {
				part_list.put(participant[i], 1);
			}
		}
		System.out.println(part_list.entrySet());

		// 완주한 선수를 저장한다
		for (int i = 0; i < completion.length; i++) {
			if (part_list.containsKey(completion[i])) { // 완주 한 선수를 확인
				part_list.put(completion[i], part_list.get(completion[i]) - 1);
			}
		}

		System.out.println(part_list.entrySet());
		Iterator<String> it = part_list.keySet().iterator();

		while (it.hasNext()) {
			String key = it.next();

			System.out.println(part_list.get(key));

			if (part_list.get(key) > 0) {
				answer = key;
				// System.out.println(key);
			}
		}

		return answer;
	}

	public static void main(String[] args) {

		String[] participant = { "leo", "kiki", "eden", "leo" };

		String[] completion = { "eden", "kiki" };

		System.out.println(solution(participant, completion));

	}

}
