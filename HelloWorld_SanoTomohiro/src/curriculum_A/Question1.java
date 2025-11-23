package curriculum_A;

public class Question1 {
	public static void main(String[] args) {
		byte byteNum = 0;
		byteNum = 10; //変数byteNumに10を代入

		short shortNum = 0;
		shortNum = 100; //変数shortNumに100を代入

		int intNum = 0;
		intNum = 1000; //変数intNumに1000を代入

		long longNum = 0L;
		longNum = 10000L; //変数longNumに10000を代入

		float floatNum = 0.0f;
		floatNum = 9.5f; //変数floatNumに9.5fを代入

		double doubleNum = 0.0;
		doubleNum = 10.5; //変数doubleNumに10.5を代入

		char letter = '\u0000';
		letter = 'a'; //変数cに「a」を代入
		
		String letters = null;
		letters = "ハロー";

		boolean bool = false;
		bool = true; //変数boolにtrueを代入
		//ここまでがQ1とQ2

		//ここからQ3
		//11110を出力
		System.out.println(longNum + intNum + shortNum + byteNum);

		//20を出力
		System.out.println(floatNum + doubleNum);

		// ★★★ ここを修正しました ★★★
		//a ハロー true を出力 (コメントに合わせて変数を結合)
		System.out.println(letter + " " + letters + " " + bool);

		// 数字を全て足して出力 (コメントに従い、浮動小数点も含めて加算)
		System.out.println(longNum + intNum + shortNum + byteNum + floatNum + doubleNum);

		//小数点以外の数字を全て出力 (コメントに従い、乗算)
		System.out.println(byteNum * shortNum * intNum * longNum);

		//10.5割る100をして出力
		System.out.println(doubleNum / shortNum);

		//10引く100をして出力
		System.out.println(byteNum - shortNum);

		String name = "山田太郎"; //値を代入
		System.out.println("こんにちは" + name); //出力

		int age = 25; //変数宣言＆代入
		System.out.println("年齢:" + age); //出力

		int num1 = 10; //変数宣言＆代入
		int num2 = 5; //変数宣言＆代入
		int sum = num1 + num2;
		System.out.println(sum); //出力

		int score = 80; // 宣言＆代入
		score = score + 20; //更新
		System.out.println("最終スコア:" + score); //出力

		double price = 99.99; // 宣言＆代入

		// 別の int 型の変数に、キャストした結果を格納
		int intPrice = (int) price; // 変換 (int)

		// 新しい変数を表示
		System.out.println("整数価格" + intPrice); // 出力

		String numStr = "123"; //代入    
		int num = Integer.parseInt(numStr); //変換
		System.out.println("変換後の値: " + (num + 10)); //出力

		int num3 = 50; //代入
		String str = String.valueOf(num3); //変換
		System.out.println("得点: " + str + "点"); //出力

		int a = 10; // ① a に 10 を代入
		int b = 20; // ② b に 20 を代入
		boolean result = a < b; // ③ aがbより小さいか比較して代入
		System.out.println(result); // ④ 結果を表示

		int x = 15; // ① x に 15 を代入
		String result_1 = (x >= 10) ? "OK" : "NG"; // ② 三項演算子で判定
		System.out.println(result_1); // ③ 結果を表示

		String text = "私はJavaが好きです。Javaは楽しい！"; // 元の文字列
		String newText = text.replace("Java", "Python"); // 置換処理
		System.out.println(newText); // 結果を表示
	}
}