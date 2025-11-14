package ObjectQ6;

// 2. 抽象クラス Employee
// (クラス名を EmployeeQ6 に)
public abstract class EmployeeQ6 implements BillableQ6 { // ★★★ implements を BillableQ6 に修正
    
    protected String id;
    protected String name;

    public EmployeeQ6(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // 3. costForDay は「抽象メソッド」として実装（じっそう）
    @Override
    public abstract int costForDay(int hoursWorked);
}