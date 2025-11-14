package Object;

/**
 * Q7 サブクラス（子供（こども））②
 * (ContractEmployeeQ7 は EmployeeQ7 を継承（けいしょう）)
 */
public class ContractEmployeeQ7 extends EmployeeQ7 {

    private static final int HOURLY_RATE = 1000;

    public ContractEmployeeQ7(String name, int hours) {
        super(name, hours);
    }

    // 親（おや）の「ルール」を、くわしく実装（じっそう）する
    @Override
    public int calculateSalary() {
        return this.hours * HOURLY_RATE;
    }
}