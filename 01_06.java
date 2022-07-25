// https://cote.inflearn.com/contest/10/problem/01-06

import java.util.Scanner;

public class Main {
	public String solution(String str) { 
		String answer = "";
		
		//indexOf : Returns the index within this string of the first occurrence of the specified character.
		for(int i=0; i<str.length(); i++) {
//			System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}
