[TOC]

# 2438번: 별 찍기 - 1

첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
```



# 2439번: 별 찍기 - 2

첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
```



# 2739번: 구구단

N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.

``` java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

}
```



# 2741번: N 찍기

자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

}
```



# 2742번: 기찍 N

자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = n; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
```



# 8393번: 합

n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
```



# 10871번: X보다 작은 수

정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

``` java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			if (a < x) {
				System.out.print(a + " ");
			}
		}
	}

}
```



# 10950번: A+B - 3

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a + b);
		}
	}

}
```



# 11021번: A+B - 7

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println("Case #" + i + ": " + (a + b));
		}
	}

}
```



# 11022번: A+B - 8

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

```java
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(String.format("Case #%d: %d + %d = %d", i, a, b, a + b));
		}
	}

}
```



# 15552번: 빠른 A+B

본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

Java를 사용하고 있다면, `Scanner`와 `System.out.println` 대신 `BufferedReader`와 `BufferedWriter`를 사용할 수 있다. `BufferedWriter.flush`는 맨 마지막에 한 번만 하면 된다.

또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다. 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.

``` java
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}
```

