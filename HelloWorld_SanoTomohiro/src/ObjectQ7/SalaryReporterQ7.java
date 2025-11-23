package ObjectQ7;

/**
 * Q7 レポートクラス
 * (「出力（しゅつりょく）だけ」を担当（たんとう）)
 */
public class SalaryReporterQ7 {
    
    // 引数（ひきすう）の型を EmployeeQ7 に
    public void printReport(EmployeeQ7 e) {
        
        // e が FullTime か Contract かを「if文（ぶん）」でチェックしない
        int salary = e.calculateSalary();
        
        System.out.println(e.getName() + "の給料は" + salary + "円");
    }
}