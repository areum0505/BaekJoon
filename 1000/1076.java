
/*
전자 제품에는 저항이 들어간다. 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
저항의 값은 다음 표를 이용해서 구한다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] color = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		int[] value = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] multiply = { 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000 };
		long result = 0;
		for (int i = 0; i < 3; i++) {
			int index = java.util.Arrays.asList(color).indexOf(br.readLine());
			if (i != 2) {
				result = result * 10 * i + value[index];
			} else {
				if (index != 0)
					result = result * multiply[index];
			}
		}
		System.out.println(result);
	}

}
