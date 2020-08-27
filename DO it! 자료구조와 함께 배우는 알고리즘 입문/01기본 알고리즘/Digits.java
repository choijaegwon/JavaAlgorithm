package chap01;
import java.util.Scanner;
//2자리의 양수(10~99)를 입력합니다.

public class Digits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.print("입력 : ");
			no = stdIn.nextInt();
		} while (no < 10 || no > 90); //10보다작거나99보다크면 루프 본문을 반복합니다.
		
		System.out.println("변수 no 의 값은" + no + "가(이) 되엇습니다.");
	}
}