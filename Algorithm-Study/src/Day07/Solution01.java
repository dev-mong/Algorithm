package Day07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) throws IOException {
		String str = null;
		HashMap<String, String> phoneList = new HashMap<String, String>();
		String name = null;
		String number = null;

		try {
			// 파일 객체 생성
			File file = new File("C:/temp/phone.txt");

			// 입력 스트림 생성
			FileReader file_reader = new FileReader(file);
			BufferedReader br = new BufferedReader(file_reader);

			while (true) {
				str = br.readLine();
				if (str == null) {
					break;

				}
				name = str.substring(0, 3);
				// System.out.println(name);
				number = str.substring(4, 17);
				// System.out.println(number);
				phoneList.put(name, number);
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.getStackTrace();
		} catch (IOException e) {
			e.getStackTrace();
		}

		System.out.println("총 7개의 전화번호를 읽었습니다.");

		while (true) {

			System.out.println("이름>>");
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();

			if (input.equals("그만")) {
				break;
			}

			String phoneNumber = phoneList.get(input);

			if (phoneNumber == null) {
				System.out.println("찾는 이름이 없습니다.");
			} else {
				System.out.println(phoneNumber);
			}
		}

	}

}
