package Object;

// 3. サブクラス ContractEmployee
// (クラス名を ContractEmployeeQ6 に、extends を EmployeeQ6 に)
public class ContractEmployeeQ6 extends EmployeeQ6 {
    
    private static final int HOURLY_RATE = 1000;
    
    public ContractEmployeeQ6(String id, String name) {
        super(id, name);
    }

    // costForDay の実装 (割増なし)
    @Override
    public int costForDay(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}
