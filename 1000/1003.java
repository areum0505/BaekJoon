 // N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int count0;
	static int count1;
	static int plus;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			fibonacci(n);
			System.out.println(count0 + " " + count1);
		}
	}

	public static void fibonacci(int n) {
		count0 = 1;
		count1 = 0;
		plus = 1;

		for (int i = 0; i < n; i++) {
			count0 = count1;
			count1 = plus;
			plus = count0 + count1;
		}
	}

}
