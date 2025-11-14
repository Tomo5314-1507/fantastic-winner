package Object;

public class MainQ3 {

	public static void main(String[] args) {
		System.out.println("--- カプセル化 ---");
		// TODO 自動生成されたメソッド・スタブ
		// Employee オブジェクトを生成
        EmployeeQ3 emp = new EmployeeQ3();

        // ★ フィールドには直接アクセスできない（emp.name = "..." はエラー）
        
        // set メソッドで「E002」「田中花子」を設定
        emp.setEmployeeId("E002");
        emp.setName("田中花子");

        // get メソッドで値を取得して出力
        System.out.println("社員ID: " + emp.getEmployeeId());
        System.out.println("名前: " + emp.getName());
    }

}
