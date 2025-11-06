package curriculum_A;

public class Question1 {
	public static void main(String[] args) {
byte byteNum = 10; //変数byteNumに10を代入
short shortNum = 100; //変数shortNumに100を代入
int intNum = 1000; //変数intNumに1000を代入
long longNum = 10000; //変数longNumに10000を代入
float floatNum = 9.5f; //変数floatNumに9.5fを代入
double doubleNum= 10.5; //変数doubleNumに10.5を代入
char leter = 'a'; //変数letterに"a"を代入
String letters = "ハロー"; //変数lettersに"ハロー"を代入
boolean isBoolean = true; //変数isBooleanにtrueを代入
//ここまでがQ1とQ2

//ここからQ3
//11110を出力
System.out.println(longNum + intNum + shortNum + byteNum);

//20を出力
System.out.println(byteNum *2);

//a ハロー trueを出力
System.out.println("a ハロー true");

//数字を全て足して出力
System.out.println(longNum + intNum + shortNum + byteNum * 3);

//小数点以外の数字を全てかけて出力
System.out.println(byteNum * shortNum * intNum * byteNum);


//10.5割る100をして出力
System.out.println(10.5 / 100);

//10引く100をすして出力
System.out.println(10 - 100);


String name = "山田太郎"; //値を代入
System.out.println("こんにちは" + name); //出力

int age = 25; //変数宣言＆代入
System.out.println("年齢:" + age); //出力

int num1 = 10; //変数宣言＆代入
int num2 = 5; //変数宣言＆代入
int sum = num1 + num2;
System.out.println(sum); //出力

int score = 80; //宣言＆代入
score = score + 20; //更新
System.out.println("最終スコア:" + score); //出力

double price = 99.99; //宣言＆代入
price =(int)price; //変換
System.out.println("整数価格" + price); //出力

String numStr = "123";            //代入    
int num = Integer.parseInt(numStr);  //変換
System.out.println("変換後の値: " + (num + 10)); // 出力

int num3 = 50;                       //代入 
String str = String.valueOf(num3);   //変換
System.out.println("得点: " + str + "点"); //出力

int a = 10;                     // ① a に 10 を代入
int b = 20;                     // ② b に 20 を代入
boolean result = a < b;         // ③ aがbより小さいか比較して代入
System.out.println(result);     // ④ 結果を表示

int x = 15;                               // ① x に 15 を代入
String result_1 = (x >= 10) ? "OK" : "NG";  // ② 三項演算子で判定
System.out.println(result_1);               // ③ 結果を表示

String text = "私はJavaが好きです。Javaは楽しい！";  // 元の文字列
String newText = text.replace("Java", "Python");    // 置き換え処理
System.out.println(newText);                        // 結果を表示
}
}
