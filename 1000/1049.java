
/*
Day Of Mourning의 기타리스트 강토가 사용하는 기타에서 N개의 줄이 끊어졌다. 
따라서 새로운 줄을 사거나 교체해야 한다. 강토는 되도록이면 돈을 적게 쓰려고 한다. 
6줄 패키지를 살 수도 있고, 1개 또는 그 이상의 줄을 낱개로 살 수도 있다.
끊어진 기타줄의 개수 N과 기타줄 브랜드 M개가 주어지고, 각각의 브랜드에서 파는 기타줄 6개가 들어있는 패키지의 가격, 낱개로 살 때의 가격이 주어질 때, 
적어도 N개를 사기 위해 필요한 돈의 수를 최소로 하는 프로그램을 작성하시오.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();

		int result = 0;

		int[] pack = new int[m];
		int[] unit = new int[m];

		for (int i = 0; i < m; i++) {
			pack[i] = scan.nextInt();
			unit[i] = scan.nextInt();
		}

		Arrays.sort(pack);
		Arrays.sort(unit);

		result = Math.min(((n / 6) + 1) * pack[0], n * unit[0]);
		result = Math.min(result, ((n / 6)) * pack[0] + (n % 6) * unit[0]);

		System.out.println(result);
	}

}
