package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		//Q1
		System.out.println("--- Q1 ---");
		for (int i = 1; i <= 10; i++) {
			System.out.println("カウント:" + i);
		}

		//Q2
		System.out.println("--- Q2 ---");
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}

		//Q3
		System.out.println("--- Q3 ---");
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		//Q4
		System.out.println("--- Q4 ---");
		int sum = 0; //合計を入れる変数
		for (int i = 1; i <= 100; i++) {
			sum += i; //iにどんどん足していく
		}
		System.out.println("1～100までの合計は" + sum + "です");

		//Q5
		System.out.println("--- Q5 ---");
		for (int i = 1; i <= 5; i++) { // 行の数
			for (int j = 1; j <= i; j++) { // 各行の星の数
				System.out.print("*");
			}
			System.out.println(); 
		}

		//Q6
		System.out.println("--- Q6 ---");
		int i = 1; // 初期値
		while (i <= 10) { // 繰り返し条件
			System.out.println(i);
			i++; // カウンタを1ずつ増やす
		}

		//Q7
		System.out.println("--- Q7 ---");
		int i_1 = 2;
		while (i_1 <= 20) {
			System.out.println(i_1);
			i_1 += 2;
		}

		//Q8
		System.out.println("--- Q8 ---");
		for (int i_2 = 10; i_2 >= 1; i_2--) {
			System.out.println(i_2);
		}

		//Q9
		System.out.println("--- Q9 ---");
		int i_3 = 1;
		int sum_1 = 0;
		while (i_3 <= 100) {
			sum_1 += i_3;
			i_3++;
		}
		System.out.println("1～100までの合計は" + sum_1 + "です");

		//Q10
		System.out.println("--- Q10 ---");
		int num;
		while (true) {
			System.out.println("数値を入力してください(0で終了):");
			num = scanner.nextInt(); // scanner を使う

			
			scanner.nextLine();

			if (num == 0) {
				System.out.println("終了しました");
				break;
			}
			System.out.println("入力された値は" + num + "です");
		}
		
		//Q11
		System.out.println("--- Q11 ---");
		for (int i_4 = 1; i_4 <= 9; i_4++) {
			for (int j_2 = 1; j_2 <= 9; j_2++) {
				System.out.printf("%02d * %02d = %02d", i_4, j_2, i_4 * j_2);
				if (j_2 < 9) {
					System.out.print("||");
				}
			}
			System.out.println();
		}

		//Q12
		System.out.println("--- Q12 ---");

		System.out.print("調べたい家電は？（複数の場合は「、」で区切ってください）：");
		Random random = new Random();

		int stockTv = random.nextInt(12);
		int stockDisplay = 11 - stockTv;
		int stockPc = random.nextInt(12);
		int stockAc = random.nextInt(12);
		int stockRefridge = random.nextInt(12);
		int stockWashing = random.nextInt(12);

		String input1 = scanner.nextLine().trim(); 

		
		if (input1.isEmpty()) {
			System.out.println("商品名が入力されていません。");
		} else {
			
			String[] items = input1.split("、");

			
			for (String item : items) {

				String processedItem = item.trim();

				switch (processedItem) {
				case "パソコン":
					System.out.println("パソコンの残り台数は " + stockPc + " です。");
					break;
				case "エアコン":
					System.out.println("エアコンの残り台数は " + stockAc + " です。");
					break;
				case "冷蔵庫":
					System.out.println("冷蔵庫の残り台数は " + stockRefridge + " です。");
					break;
				case "洗濯機":
					System.out.println("洗濯機の残り台数は " + stockWashing + " です。");
					break;
				case "テレビ":
					System.out.println("テレビの残り台数は " + stockTv + " です。"
							+ " ディスプレイの在庫は " + stockDisplay + " です。");
					break;
				case "ディスプレイ":
					System.out.println("ディスプレイの残り台数は " + stockDisplay + " です。");
					break;
				case "":
					break;
				default:
					System.out.println("『" + processedItem + "』は指定の商品ではありません");
					break;
				}
			}
		}

		
		scanner.close();

	} 
} 