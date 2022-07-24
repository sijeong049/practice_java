
import java.util.Scanner;

public class Main {
	public String solution(String str) { 
		String answer = "";
		char[] s = str.toCharArray();
		int lt=0, rt=str.length()-1;
		
		while(lt<rt) {
			if( !Character.isAlphabetic(s[lt]) ) {
				lt++;
			} else if( !Character.isAlphabetic(s[rt]) ) {
				rt--;
			} else {
				char tmp = ' ';
				tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
		}
    
		answer = String.valueOf(s);
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}

// 오답
// 오답 이유 : 문제를 제대로 안읽음.
import java.util.Scanner;

public class Main {
	public String solution(String str) { 
		String answer = "";
		StringBuilder s = new StringBuilder(str);
		
		
		int s_len = s.length()/2;
		for(int i=0; i<s_len ;i++) {
			char f = s.charAt(i); // front 앞글자
			char b = s.charAt(s.length()-1-i); // back 뒷글자
			
//			System.out.println(i + " " +Character.isAlphabetic(f));
//			System.out.println(s.length()-1-i + " " +Character.isAlphabetic(b));
			if(Character.isAlphabetic(f) && Character.isAlphabetic(b)) {
				char temp = ' ';
				temp = f;
				s.setCharAt(i, b);
				s.setCharAt(s.length()-1-i, temp);				
			}
		}
		answer = s.toString();
				
		return answer;
	}

	public static void main(String[] args) {
		Main T = new Main();
		Scanner kb = new Scanner(System.in);

		String str = kb.next();
		
		System.out.println(T.solution(str));
	}

}
