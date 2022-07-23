// https://cote.inflearn.com/contest/10/problem/01-02

import java.util.Scanner;

public class Main {
	public String solution(String str) { 
		String answer = "";
//		System.out.println(str);
		for(int i=0; i<str.length(); i++) {
			char t = str.charAt(i);
			if(Character.isUpperCase(t) ==  true) {
				answer += Character.toLowerCase(t);
			} else {
				answer += Character.toUpperCase(t);
			}
		}
		
//		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}

}
