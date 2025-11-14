package Object;

/**
 * B: Main クラス
 * オブジェクトを作成し、9h 勤務時の給与を出力
 */
public class MainQ4 {

    public static void main(String[] args) {
    	System.out.println("--- 継承 ---");
        
        // 1. オブジェクトを作成
        EmployeeQ4 fullTimer = new FullTimeEmployee("F001", "正社員A");
        EmployeeQ4 partTimer = new PartTimeEmployee("P001", "パート社員B");

        int hours = 9; // 9時間勤務

        // 2. 9時間勤務時の給与を計算
        int fullTimeWage = fullTimer.calculateDailyWage(hours);
        int partTimeWage = partTimer.calculateDailyWage(hours);
        
        // 3. 出力
        System.out.println("正社員の給与: " + fullTimeWage + " 円");
        System.out.println("パート社員の給与: " + partTimeWage + " 円");
    }
}