package Object;

public class MainQ7 {
    
    public static void main(String[] args) {
        
        // 1. レポートクラスを準備（じゅんび）
        SalaryReporterQ7 reporter = new SalaryReporterQ7();

        // 2. 社員オブジェクトを作成（さくせい）
        EmployeeQ7 taro = new FullTimeEmployeeQ7("山田太郎", 10);
        EmployeeQ7 hanako = new ContractEmployeeQ7("鈴木花子", 10);

        // 3. レポートを依頼（いらい）
        reporter.printReport(taro);
        reporter.printReport(hanako);
    }
}