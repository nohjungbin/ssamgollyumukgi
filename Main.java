package main;

import java.util.*;
	
public class Main {
	
	public static class Character{
		public static int Hp = 30;
		public static int MAX_HP = 999;
		public static int Sp = 13;
		public static int MAX_SP = 100;
		public static int Mp = 20;
		public static int MAX_MP = 500;		
	}
	
	public static class Monster{
		public static int Hp, MAX_HP, Sp, MAX_SP;
	}

	public static void main(String[] args) throws InputMismatchException{
		// TODO Auto-generated method stub
		System.out.println("���� ���� ������?");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. ���� ���� ġŲ");
		System.out.println("2. ���� ���� ����");
		System.out.println("3. ���� ���� �ܹ���");
		System.out.println("4. ���� ���� ���屹");
		System.out.println("5. �ȸԾ�");
		
		System.out.print("1~5�����߿� 1���� �����Ͻÿ�(���ڷ� �Է�) : ");
		
	
		while(true) {
			int ju_nyuc = sc.nextInt();
			try {
				if(ju_nyuc == 1) {
					System.out.println("���� ����");
					System.out.print("���� ������ ���� ���� ġŲ�̴�!!");
					break;
				}
				else if(ju_nyuc == 2) {
					System.out.println("���� ����");
					System.out.print("���� ������ ���� ���� ���ڴ�!!");
					break;
				}
				else if(ju_nyuc == 3) {
					System.out.println("���� ����");
					System.out.print("���� ������ ���� ���� �ܹ��Ŵ�!!");
					break;
				}
				else if(ju_nyuc == 4) {
					System.out.println("���� ����");
					System.out.print("���� ������ ���� ���� ���屹�̴�!!!");
					break;
				}
				else if(ju_nyuc == 5) {
					System.out.println("�ȵ�!! ���Ծ���� �� ���־�!!");
					System.out.print("�ٽ� ����...");
				}
				else {
					System.out.println("1~5������ ��!!");
					System.out.print("�ٽ� ��!!!");
				}
			}catch(InputMismatchException e) {
				e.printStackTrace();
			}
		}
	}

}