package ObjectQ2;

public class MainQ2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("--- クラスとオブジェクト ---");
        // Employee クラスのインスタンスを生成する。
        EmployeeQ2 emp = new EmployeeQ2();
        
        // employeeId に「E001」、name に「佐藤太郎」を設定する。
        emp.employeeId = "E001";
        emp.name = "佐藤太郎";
        
        // showInfo() を呼び出して出力を確認する。
        emp.showInfo();
    }
}