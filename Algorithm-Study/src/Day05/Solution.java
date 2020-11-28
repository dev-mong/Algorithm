package Day05;

public class Solution {
	public static int solution(int[] goods) {

		int sum1 = 0;
		int sum2 = 0;
		int result = 0; // 두 가격의 합

		for (int i = 0; i < goods.length; i++) {
			// 구매 가격이 50이상 일 때
			if (goods[i] >= 50) {
				sum1 += goods[i] - 10;
			} else {
				sum2 += goods[i];
			}
		}

		if (sum2 >= 50) { // 50이상일 때 할인
			sum2 -= 10;
		}

		result = sum1 + sum2;

		return result;
	}

	public static void main(String[] args) {
		int[] goods = { 5, 3, 15 };

		solution(goods);

	}

}
