package ObjectQ7;

/**
 * Q7 抽象クラス Employee
 * (「見本（みほん）」の設計図（せっけいず）)
 */
public abstract class EmployeeQ7 {
    
    protected String name;
    protected int hours;

    public EmployeeQ7(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }
    
    public String getName() {
        return name;
    }

    // 「給与（きゅうよ）を計算（けいさん）できる」というルール
    public abstract int calculateSalary(); 
}