package ObjectQ6;

// 3. サブクラス FullTimeEmployee
// (クラス名を FullTimeEmployeeQ6 に、extends を EmployeeQ6 に)
public class FullTimeEmployeeQ6 extends EmployeeQ6 {
    
    private static final int HOURLY_RATE = 1250;
    
    public FullTimeEmployeeQ6(String id, String name) {
        super(id, name);
    }

    // costForDay の実装 (8h超過は 1.25倍)
    @Override
    public int costForDay(int hoursWorked) {
        if (hoursWorked <= 8) {
            return hoursWorked * HOURLY_RATE;
        } else {
            int regularPay = 8 * HOURLY_RATE;
            int overtimeHours = hoursWorked - 8;
            int overtimePay = (int)(overtimeHours * HOURLY_RATE * 1.25);
            return regularPay + overtimePay;
        }
    }
}