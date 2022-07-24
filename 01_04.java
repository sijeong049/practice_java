// https://cote.inflearn.com/contest/10/problem/01-04

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public ArrayList<String> solution(int n, String[] str) { 
		ArrayList<String> answer = new ArrayList<String>();
		
//		System.out.println(str[0]);
//		System.out.println(str[1]);
//		System.out.println(str[2]);
		
		for(String s : str) {
			StringBuffer temp = new StringBuffer(s);
			answer.add(temp.reverse().toString());
		}
				
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		int n = kb.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i<n ; i++) {
			str[i] = kb.next();
		}
		
		for(String x : T.solution(n, str)) {
			System.out.println(x);
		}
		
