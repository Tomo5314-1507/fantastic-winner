package curriculum_B;

import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Q1
		int[] nums = { 1, 2, 3, 4, 5 };
		for (int n : nums) {
			System.out.println(n);
		}
		//Q2
		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		//Q3
		int[] numbers2 = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int n : numbers2) {
			sum += n;
		}
		System.out.println("合計値" + sum);

		//Q4
		int[] numbers3 = { 12, 7, 9, 21, 5, 18 };
		int max = numbers3[0];
		int min = numbers3[0];
		for (int n : numbers3) {
			if (n > max) {
				max = n;
				if (n < min) {
					min = n;
				}
			}
		}
		System.out.println("最大値:" + max);
		System.out.println("最小値" + min);
		
		//Q5
		int[] numbers4 = {1,2,3,4,5};
		// 全要素を2倍にする
		for (int i = 0; i < numbers4.length; i++) {
			numbers4[i] *= 2;
		}
		// 拡張 for 文で結果を表示
		for (int n: numbers) {
			System.out.println(n);
		}
		
		//Q6
		int[] numbers5  = {4,7,10,15,20};
		Scanner sc = new Scanner(System.in);
		System.out.println("数値を入力してください");
		int input = sc.nextInt();
		boolean found = false;
		for(int n : numbers5) {
			if (n == input) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(input + "は配列に含まれています。");
		}else {
			System.out.println(input + "は含まれていません。");
		}
		sc.close();
		
		//Q7
		int[][] array = {
			{1 , 2},
			{3 , 4},
			{5 , 6},
		};
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println(array[i][j]);
			}
		}
		//Q8
		int[][] array1 = {
				{10 , 20 ,30},
				{40 , 50 ,60},
				{70 , 80 ,90},
		};
		int sum1 = 0;
		
		for (int[] row : array1) {
			for (int n : row) {
				sum1 += n;
			}
		}
		System.out.println("合計値:" + sum1);
		
//		//Q9
//		int[][] array2 = {
//				{12 , 15 , 8},
//				{ 6 , 19 ,25},
//				{30 ,  2 ,10},
//		};
//		
//		int max1 = Integer.MIN_VALUE;
//		int min1 = Integer.MAX_VALUE;
//		
//		for (int[] row : array2) {
//			for (int n : row) {
//				if (n > max1) max = n;
//				if (n < min1) min = n;
//			}
//		}
//		System.out.println("最大値:" + max1);
//		System.out.println("最小値:" + min1);
		
		//Q10
		int[][][] array3 = {
				{ {1 , 2} , {3 , 4} },
				{ {5 , 6} , {7 , 8} }
		};
		for (int [][] twoD : array3) {
			for (int[] oneD : twoD) {
				for (int n : oneD) {
					System.out.println(n);
				}
			}
		}
	}
}
