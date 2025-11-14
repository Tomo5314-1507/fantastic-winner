package ObjectQ4;

public class PartTimeEmployee extends EmployeeQ4 {
	// 定数 (パート社員の時給)
	private static final int HOURLY_RATE = 1000;
	// コンストラクタ
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}
	/**
	 * 抽象メソッド calculateDailyWage の実装（じっそう）
	 * (割増なし)
	 */
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}

}
