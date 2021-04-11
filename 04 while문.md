[TOC]

# 1110번: 더하기 사이클

0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int new_n = n;
		int count = 0;

		do {
			int a = new_n / 10;
			int b = new_n % 10;
			int c = (a + b) % 10;

			new_n = (b * 10) + c;

			count++;
		} while (n != new_n);

		System.out.println(count);
	}

}
```



# 10951번: A+B - 4

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a + b);
		}
	}

}
```



# 10952번: A+B - 5

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			if (a == 0 && b == 0)
				break;

			System.out.println(a + b);
		}
	}

}
```

