/*
진수는 회사 생활에 지쳐 회사를 그만두고 귀농을 하여 작물들을 키우며 생활하고 있습니다. 진수는 작물 중에서도 '스타후르츠' 라는 작물을 제일 좋아합니다.

스타후르츠 씨앗을 심으면 자라는데 T일이 걸립니다. i일에 스타후르츠 씨앗을 심으면 i+T일에 수확할 수 있고 수확한 날에도 같은 칸에 씨앗을 또 심을 수 있습니다.

진수에게는 스타후르츠 씨앗을 심을 수 있는 빈 칸이 C개 있고 한 칸에 한 개의 스타후르츠를 심을 수 있습니다.

오늘은 여름 1일이고 N일까지 여름이 지속됩니다. 스타후르츠는 여름이 아닌 날에는 바로 시들어버리므로 N일이 지나면 더 이상 수확할 수 없습니다.

진수는 스타후르츠 한 개를 판매하면 P원을 벌 수 있습니다. 진수는 올해 여름 동안 얼마나 많은 돈을 벌 수 있을까요?

진수는 하루에 일을 원하는 만큼 할 수 있고, 씨앗도 충분히 가지고 있다고 가정합니다.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int t = scan.nextInt();
		int c = scan.nextInt();
		int p = scan.nextInt();

		int a = n / t;
		if (n % t == 0) {
			a -= 1;
		}

		System.out.println(a * c * p);
	}

}
