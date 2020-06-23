package Main;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int hour = h;
		int min = m - 45;
		if(min<0) {
			min += 60;
			hour--;
			if(hour < 0) {
				hour += 24;
			}
		}
		System.out.println(hour+" "+min);
		
		
		
	}

}
