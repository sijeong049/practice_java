// https://cote.inflearn.com/contest/10/problem/01-03

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public String solution(String str) { 
		String answer = "";
//		System.out.println(str);
		
		int len = 0;
		
		String[] s = str.split(" ");
		for(String temp : s) {
//			System.out.println(temp);
			if(temp.length() > len) {
				len = temp.length();
				answer = temp;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}

}
