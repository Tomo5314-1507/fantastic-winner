package curriculum_B;

// 同じパッケージにあるので、import文は不要です

public class Question5 {

    // プログラムの開始地点 (これが「メイン」)
    public static void main(String[] args) {
        
        System.out.println("--- Q1 ---");
        helloWorld();

        System.out.println("--- Q2 ---");
        int value = 10;
        int result = doubleValue(value);
        System.out.println(value + "を２倍にすると" + result + "です");

        System.out.println("--- Q3 ---");
        int num1 = 7;
        int num2 = 10;
        if (isEven(num1)) {
            System.out.println(num1 + " は偶数です");
        } else {
            System.out.println(num1 + " は奇数です");
        }
        if (isEven(num2)) {
            System.out.println(num2 + " は偶数です");
        } else {
            System.out.println(num2 + " は奇数です");
        }
        
        System.out.println("--- Q4 ----");
        // 別のファイルにある Greeting の「定義」を呼び出す
        Greeting g = new Greeting();
        g.sayHello();
        
        System.out.println("--- Q5 ----");
        // 別のファイルにある Animal の「定義」を呼び出す
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);
        
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m");
        System.out.println("速度：" + lion.getSpeed() + "km/h");
        
    } // mainメソッドはここで終わり
    
    /**
     * ここから下は「メソッドの定義」の場所
     * (main の「中」には書けません)
     */
    
    // Q1の定義
    public static void helloWorld() {
        System.out.println("Hello,World!");
    }

    // Q2の定義
    public static int doubleValue(int num) {
        return num * 2;
    }
    
    // Q3の定義
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}