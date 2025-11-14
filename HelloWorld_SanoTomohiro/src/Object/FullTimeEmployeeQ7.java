package Object;

/**
 * Q7 サブクラス（子供（こども））①
 * (FullTimeEmployeeQ7 は EmployeeQ7 を継承（けいしょう）)
 */
public class FullTimeEmployeeQ7 extends EmployeeQ7 {
    
    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployeeQ7(String name, int hours) {
        super(name, hours); // 親（EmployeeQ7）のコンストラクタを呼（よ）ぶ
    }

    // 親（おや）の「ルール」を、くわしく実装（じっそう）する
    @Override
    public int calculateSalary() {
        return this.hours * HOURLY_RATE;
    }
}