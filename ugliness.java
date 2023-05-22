// Java program to find nth ugly number
import java.io.*;
import java.util.*;
public class ugliness {
	static int maxDivide(int a, int b)
	{
		while (a % b == 0)
			a = a / b;
		return a;
	}
	static int isUgly(int no)
	{
		no = maxDivide(no, 2);
		no = maxDivide(no, 3);
		no = maxDivide(no, 5);

		return (no == 1) ? 1 : 0;
	}
	static int getNthUglyNo(int n)
	{
		int i = 1;
		int count = 1;
		while (n > count) {
			i++;
			if (isUgly(i) == 1)
				count++;
		}
		return i;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int no = getNthUglyNo(a);

		System.out.println(a+"th ugly "+ "no. is " + no);
	}
}