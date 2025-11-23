package curriculum_c;

import java.util.ArrayList; // List を使うために必要
import java.util.List;      // List を使うために必要

public class jikoshoukai {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        
        
        List<Person> personList = new ArrayList<>();

        
        Person taro = new Person("佐野智広", 26, 1.7 , 60.0);
        personList.add(taro);
        
        // (2人目の hanako さんを削除しました)
        
        System.out.println("--- 各個人のプロフィール ---");

        
        for (Person p : personList) {
            p.print();
            
            double bmi = p.bmi();
            System.out.println(p.getName() + "さんのBMIは" + bmi + "です");
            System.out.println("--------------------");
        }
        
        
        int count = personList.size(); // リストの人数 (1) を取得
        System.out.println("合計" + count + "人です");
        
    } 

    
    
    public static class Person {
        
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
}