package practice;

import java.util.Scanner;

public class Ex12_switch {

	public static void main(String[] args) {
		// 월 입력받아서 해당 계절 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		String season="";
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		default:
			System.out.println("잘못입력하셨습니다.");
		}
		System.out.println(month+"월은 "+season+"입니다.");

	}

}
