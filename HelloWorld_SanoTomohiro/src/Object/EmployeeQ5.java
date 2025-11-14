package Object;

// クラス名を EmployeeQ5 にします
public abstract class EmployeeQ5 { 
    
    protected String id;
    protected String name;
    
    public EmployeeQ5(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public abstract int calculateDailyWage(int hoursWorked);
}