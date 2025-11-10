package curriculum_B;

public class Question5 {

    // プログラムの開始地点
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        System.out.println("--- Q1 ---");
        // Q1: helloWorldメソッドを呼び出す
        helloWorld();

        System.out.println("--- Q2 ---");
        // Q2: doubleValueメソッドを呼び出す処理
        int value = 10;
        int result = doubleValue(value); // doubleValueメソッドを呼び出す
        System.out.println(value + "を２倍にすると" + result + "です");

        System.out.println("--- Q3 ---");
        // Q3: isEvenメソッドを呼び出す処理
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
        // Greetingクラスを呼び出す
        Greeting g = new Greeting();
        g.sayHello();
        
        System.out.println("--- Q5 ----");
        // Animalクラスを呼び出す (これでエラーにならない)
        Animal lion = new Animal();
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);
        
        // ★★★ 「体長」の出力も修正しました ★★★
        System.out.println("動物名：" + lion.getName());
        System.out.println("体長：" + lion.getLength() + "m"); // getSpeed() -> getLength() に修正
        System.out.println("速度：" + lion.getSpeed() + "km/h");
        
    } // mainメソッドはここで終わり
    
    /**
     * ここから下は「メソッドの定義」の場所
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
    
    //Q4の定義
    public static class Greeting {
    	public void sayHello() {
    		System.out.println("こんにちは");
    	}
    }
    
    //Q5の定義
    // ↓↓↓ main (static) から呼び出すため、static を追加します
    public static class Animal {
    	private String name; //動物名
    	private double length; //体長
    	private int speed; //速度
    	
    	public void setName(String name) {
    		this.name = name;
    	}
    	public void setLength(double length) {
    		this.length = length;
    	}
    	public void setSpeed(int speed) {
    		this.speed = speed;
    	}
    	public String getName() {
    		return this.name;
    	}
    	public double getLength() {
    		return this.length;
    	}
    	public int getSpeed() {
    		return this.speed;
    	}
    }
}