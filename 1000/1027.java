/*
 * 세준시에는 고층 빌딩이 많다. 세준시의 서민 김지민은 가장 많은 고층 빌딩이 보이는 고층 빌딩을 찾으려고 한다. 
 * 빌딩은 총 N개가 있는데, 빌딩은 선분으로 나타낸다. 
 * i번째 빌딩 (1부터 시작)은 (i,0)부터 (i,높이)의 선분으로 나타낼 수 있다. 
 * 고층 빌딩 A에서 다른 고층 빌딩 B가 볼 수 있는 빌딩이 되려면, 두 지붕을 잇는 선분이 A와 B를 제외한 다른 고층 빌딩을 지나거나 접하지 않아야 한다. 
 * 가장 많은 고층 빌딩이 보이는 빌딩을 구하고, 거기서 보이는 빌딩의 수를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int[] building = new int[n];
		int[] count = new int[n];
		int max = 0;

		for (int i = 0; i < n; i++) {
			building[i] = scan.nextInt();
		}
		
		for(int i = 0; i < n - 1; i++) {
			count[i]++; count[i + 1]++;
			double slope = building[i + 1] - building[i];
			for(int j = i + 2; j < n; j++) {
				double next_slope = (double)(building[j] - building[i]) / (j - i);
				if(next_slope > slope) {
					slope = next_slope;
					count[i]++; count[j]++;
				}
			}
		}
		
		for(int i = 0; i < n; i++) {
			if(max < count[i]) {
				max = count[i];
			}
		}
		
		System.out.println(max);
	}

}
