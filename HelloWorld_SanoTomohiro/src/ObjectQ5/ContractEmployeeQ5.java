package ObjectQ5;

// クラス名を ContractEmployeeQ5 に
// extends (継承) を EmployeeQ5 にします
public class ContractEmployeeQ5 extends EmployeeQ5 { 
    
    public ContractEmployeeQ5(String id, String name) {
        super(id, name);
    }

    @Override
    public int calculateDailyWage(int hoursWorked) {
        int hourlyRate = 1000;
        return hoursWorked * hourlyRate;
    }
}