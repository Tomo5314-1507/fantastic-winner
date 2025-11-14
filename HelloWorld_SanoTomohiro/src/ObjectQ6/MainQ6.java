package ObjectQ6;

import java.util.ArrayList;
import java.util.List;

public class MainQ6 {

    public static void main(String[] args) {
        
        // 1. インターフェイスの型を BillableQ6 にします
        List<BillableQ6> staffList = new ArrayList<>();
        
        // 2. 呼び出すクラス名を Q6 にします
        staffList.add(new FullTimeEmployeeQ6("F001", "正社員A"));
        staffList.add(new ContractEmployeeQ6("C001", "契約社員B"));
        staffList.add(new FullTimeEmployeeQ6("F002", "正社員C"));

        int hoursWorked = 9;
        System.out.println(hoursWorked + "時間 勤務した場合の日給:");

        // 3. for-each の型を BillableQ6 にします
        for (BillableQ6 member : staffList) {
            
            int cost = member.costForDay(hoursWorked);
            
            // ★修正★ instanceof で EmployeeQ6 かどうかチェックします
            if (member instanceof EmployeeQ6) {
                EmployeeQ6 emp = (EmployeeQ6) member;
                System.out.println(emp.name + ":" + cost + "円");
            }
        }
    }
}