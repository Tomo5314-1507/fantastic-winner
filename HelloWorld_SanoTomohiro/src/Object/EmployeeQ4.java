package Object;

/**
 * A-1: 抽象クラス Employee
 * 全ての社員の「見本」となるクラス
 */
public abstract class EmployeeQ4 {
    
    // フィールド (privateにしてカプセル化)
    private String employeeId;
    private String name;

    // コンストラクタ
    public EmployeeQ4(String id, String name) {
        this.employeeId = id;
        this.name = name;
    }

    // メソッド (getter)
    public String getEmployeeId() {
        return this.employeeId;
    }

    public String getName() {
        return this.name;
    }

    // メソッド (抽象)
    // 「給与を計算する」というルールだけを決め、
    // くわしい計算はサブクラス（子供）にまかせる
    public abstract int calculateDailyWage(int hoursWorked);
}