package main;

import java.util.*;
	
public class Main {
	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub
		System.out.println("오늘 저녁 뭐먹지?");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 쌤이 사준 치킨");
		System.out.println("2. 쌤이 사준 피자");
		System.out.println("3. 쌤이 사준 햄버거");
		System.out.println("4. 쌤이 사준 해장국");
		System.out.println("5. 안먹어");
		
		System.out.print("1~5까지중에 1개만 선택하시오(숫자로 입력) : ");
		
	
		while(true) {
			int ju_nyuc = sc.nextInt();
			try {
				if(ju_nyuc == 1) {
					System.out.println("오케 ㄱㄱ");
					System.out.print("오늘 저녁은 쌤이 사준 치킨이닭!!");
					break;
				}
				else if(ju_nyuc == 2) {
					System.out.println("오케 ㄱㄱ");
					System.out.print("오늘 저녁은 쌤이 사준 피자당!!");
					break;
				}
				else if(ju_nyuc == 3) {
					System.out.println("오케 ㄱㄱ");
					System.out.print("오늘 저녁은 쌤이 사준 햄버거당!!");
					break;
				}
				else if(ju_nyuc == 4) {
					System.out.println("오케 ㄱㄱ");
					System.out.print("오늘 저녁은 쌤이 사준 해장국이당!!!");
					break;
				}
				else if(ju_nyuc == 5) {
					System.out.println("안돼!! 얻어먹어야지 젤 맛있어!!");
					System.out.print("다시 골라봐...");
				}
				else {
					System.out.println("1~5까지만 돼!!");
					System.out.print("다시 써!!!");
				}
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
		}
	}

}
