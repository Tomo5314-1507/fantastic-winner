package jikoshoukai; // ← Main と同じパッケージにします

/**
 * 「人」の設計図（せっけいず）
 */
public class Person {
    
    // 1. フィールド
    private String name;
    private int age;
    private double height;
    private double weight;
    
    // 2. コンストラクタ
    public Person(String name, int age , double height , double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight= weight;
    }
    
    // 3. bmi メソッド
    public double bmi() {
        return this.weight / (this.height * this.height);
    }
    
    // 4. print メソッド
    public void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + this.bmi() + "です");
    }
    
    // 5. getName メソッド (main で使う)
    public String getName() {
        return this.name;
    }
    
}