package ObjectQ2;

public class EmployeeQ2 {
	
    // employeeId (文字列型) フィールド
    public String employeeId;
    
    // name (文字列型) フィールド
    public String name;
    
    // showInfo() メソッド
    public void showInfo() {
        // 社員ID: [employeeId], 名前: [name] と出力する。
        System.out.println("社員ID: " + this.employeeId + ", 名前: " + this.name);
    }
}