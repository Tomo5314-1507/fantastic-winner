package ObjectQ4;

/**
 * A-2: サブクラス FullTimeEmployee
 * (Employee を継承)
 */
public class FullTimeEmployee extends EmployeeQ4 { // ← extends Employee (親を指定)
    
    // 定数 (正社員の時給)
    private static final int HOURLY_RATE = 1200;

    // コンストラクタ
    public FullTimeEmployee(String id, String name) {
        
        // ★★★ super(id, name); は合っています ★★★
        // (親のコンストラクタを呼び出す)
        super(id, name); 
    }

    /**
     * 抽象メソッド calculateDailyWage の実装（じっそう）
     * (★ 修正 ★ 「仮」の return 0; を、正しい計算ロジックに直します)
     */
    @Override // (親のルールを上書きする、という印)
    public int calculateDailyWage(int hoursWorked) {
        if (hoursWorked <= 8) {
            // 8時間以下の場合
            return hoursWorked * HOURLY_RATE;
        } else {
            // 8時間超過の場合
            int regularPay = 8 * HOURLY_RATE; // 8時間分の通常賃金
            int overtimeHours = hoursWorked - 8; // 残業時間
            
            // 割増賃金 (1200 * 1.25 = 1500)
            int overtimeRate = (int)(HOURLY_RATE * 1.25);
            
            int overtimePay = overtimeHours * overtimeRate;
            
            return regularPay + overtimePay;
        }
    }
}