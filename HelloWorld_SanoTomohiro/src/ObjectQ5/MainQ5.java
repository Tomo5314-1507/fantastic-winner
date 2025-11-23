package ObjectQ5;

import java.util.ArrayList;
import java.util.List;

// クラス名を MainQ5 にします
public class MainQ5 { 
    
    public static void main(String[] args) {
        System.out.println("---ポリモーフィズム ---");
        // ★修正★ 親の型を EmployeeQ5 にします
        List<EmployeeQ5> employees = new ArrayList<>();

        // ★修正★ 子供のクラス名を Q5 にします
        employees.add(new FullTimeEmployeeQ5("F001", "田中 太郎"));
        employees.add(new ContractEmployeeQ5("C001", "佐藤 花子"));
        employees.add(new FullTimeEmployeeQ5("F002", "鈴木 一郎"));
        employees.add(new ContractEmployeeQ5("C002", "高橋 次郎"));

        int hoursWorked = 9;
        System.out.println(hoursWorked + "時間 勤務した場合の給与:");

        // ★修正★ for-each の型を EmployeeQ5 にします
        for (EmployeeQ5 emp : employees) {
            
            int wage = emp.calculateDailyWage(hoursWorked);
            System.out.println(emp.name + " (ID:" + emp.id + "): " + wage + "円");
        }
    }
}