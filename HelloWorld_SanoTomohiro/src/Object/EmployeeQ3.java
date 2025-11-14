package Object;

public class EmployeeQ3 {
	// 1. プライベートフィールド (カプセル化)
    //    (クラスの外からは直接アクセスできません)
    private String employeeId;
    private String name;

    /**
     * 2. フィールドにアクセスするためのメソッド (Setter / Getter)
     * (これらは public なので、外から呼び出せます)
     */
    
    // --- employeeId の Setter / Getter ---
    public void setEmployeeId(String id) {
        // 受け取った id を、自分の private な employeeId にセットする
        this.employeeId = id;
    }
    
    public String getEmployeeId() {
        // 自分の private な employeeId を返す
        return this.employeeId;
    }

    // --- name の Setter / Getter ---
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
