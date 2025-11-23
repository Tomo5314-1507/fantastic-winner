package jikoshoukai;

import java.util.ArrayList; // List を使うために必要
import java.util.List;      // List を使うために必要

// ★修正★ クラス名を jikoshoukai から Main に変更
public class Main {

    public static void main(String[] args) {
        
        // 1. Person を入れる「名簿（リスト）」を作成
        List<Person> personList = new ArrayList<>();

        // 2. 1人の Person を作成して、リストに追加
        //    (別ファイルにある Person.java を呼び出す)
        Person taro = new Person("佐野智広", 26, 1.7 , 60.0);
        personList.add(taro);
        
        System.out.println("--- 各個人のプロフィール ---");

        // 3. リストに入っている全員（1人）の情報を、ループで出力
        for (Person p : personList) {
            p.print();
            
            double bmi = p.bmi();
            System.out.println(p.getName() + "さんのBMIは" + bmi + "です");
            System.out.println("--------------------");
        }
        
        // 4. 「合計○人です」を混ぜる
        int count = personList.size(); // リストの人数 (1) を取得
        System.out.println("合計" + count + "人です");
        
    } // main はここまで
}