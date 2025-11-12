package curriculum_c;

import java.util.ArrayList;
import java.util.List;

public class Question1 { // ★★★ ここに "Question1" を追加しました ★★★

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("--- 基本概要 / クラスとオブジェクト / カプセル化 ---");

		// Q1-Q3で使う「Employee」
		Employee emp = new Employee();
		emp.setName("山田太郎");
		emp.work();

		Employee emp1 = new Employee();
		emp1.setEmployeeId("E001");
		emp1.setName("佐藤太郎");
		emp1.showInfo();

		emp1.setEmployeeId("E002");
		emp1.setName("田中花子");
		System.out.println("社員ID: " + emp1.getEmployeeId());
		System.out.println("名前: " + emp1.getName());

		System.out.println("--- 継承 ---");

		// Q4で使う「AbstractEmployee」
		AbstractEmployee fullTimer = new FullTimeEmployeeQ4("F001", "正社員A");
		AbstractEmployee partTimer = new PartTimeEmployee("P001", "バイトB");

		int hours = 9;
		int fullTimeWage = fullTimer.calculateDailyWage(hours);
		int partTimeWage = partTimer.calculateDailyWage(hours);

		System.out.println("--- 9時間勤務 ---");
		System.out.println(fullTimer.getName() + "(FullTime):" + fullTimeWage + "円");
		System.out.println(partTimer.getName() + " (PartTime): " + partTimeWage + "円");

		System.out.println("--- ポリモーフィズム ---");

		// Q5で使う「EmployeeQ5」
		List<EmployeeQ5> employees = new ArrayList<>();
		employees.add(new FullTimeEmployeeQ5("F001", " 田中太郎"));
		employees.add(new ContractEmployeeQ5("C001", "佐藤花子"));
		employees.add(new FullTimeEmployeeQ5("F002", "鈴木一郎"));
		employees.add(new ContractEmployeeQ5("C002", "高橋次郎"));

		int hoursWorked = 9;
		System.out.println(hoursWorked + "時間　勤務した場合の給料");

		for (EmployeeQ5 empQ5 : employees) {
			int wage = empQ5.calculateDailyWage(hoursWorked);
			System.out.println(empQ5.name + " (ID:" + empQ5.id + "): " + wage + "円");
		}

		System.out.println("---インターフェイスと抽象クラス ---");

		// Q6で使う「Billable」
		List<Billable> staffList = new ArrayList<>();
		staffList.add(new FullTimeEmployeeQ6("F001", "正社員A"));
		staffList.add(new ContractEmployeeQ6("C001", "契約社員B"));
		staffList.add(new FullTimeEmployeeQ6("F002", "正社員C"));

		int hoursWorkedQ6 = 9;
		System.out.println(hoursWorkedQ6 + "時間 勤務した場合の日給:");

		for (Billable member : staffList) {
			int cost = member.costForDay(hoursWorkedQ6);
			if (member instanceof EmployeeQ6) {
				EmployeeQ6 empQ6 = (EmployeeQ6) member;
				System.out.println(empQ6.name + ":" + cost + "円");
			}
		}

		System.out.println("---オブジェクト指向の設計原則（SOLID）---");

		// Q7 (SOLID) の実行コード
		SalaryReporterQ7 reporter = new SalaryReporterQ7();

		EmployeeQ7 taro = new FullTimeEmployeeQ7("山田太郎", 10);
		EmployeeQ7 hanako = new ContractEmployeeQ7("鈴木花子", 10);

		reporter.printReport(taro);
		reporter.printReport(hanako);

	} // ★★★ main メソッドはここで終わり ★★★

	/**
	 * Q1〜Q3で使う、具体的な「Employee」クラスの定義
	 */
	public static class Employee {
		private String employeeId;
		private String name;

		public Employee() {
		}

		public void work() {
			System.out.println(this.name + "は働いている");
		}

		public void showInfo() {
			System.out.println("社員ID:" + this.employeeId + ", 名前:" + this.name);
		}

		public void setEmployeeId(String id) {
			this.employeeId = id;
		}

		public String getEmployeeId() {
			return this.employeeId;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
	}

	/**
	 * Q4（継承）で使うクラス定義
	 */

	// Q4 抽象クラス
	public static abstract class AbstractEmployee {
		private String employeeId;
		private String name;

		public AbstractEmployee(String id, String name) {
			this.employeeId = id;
			this.name = name;
		}

		public String getEmployeeId() {
			return this.employeeId;
		}

		public String getName() {
			return this.name;
		}

		public abstract int calculateDailyWage(int hoursWorked);
	}

	// Q4 サブクラス FullTimeEmployeeQ4
	public static class FullTimeEmployeeQ4 extends AbstractEmployee {
		private static final int HOURLY_RATE = 1200;

		public FullTimeEmployeeQ4(String id, String name) {
			super(id, name);
		}

		@Override
		public int calculateDailyWage(int hoursWorked) {
			if (hoursWorked <= 8) {
				return hoursWorked * HOURLY_RATE;
			} else {
				int regularPay = 8 * HOURLY_RATE;
				int overtimeHours = hoursWorked - 8;
				int overtimeRate = (int) (HOURLY_RATE * 1.25);
				int overtimePay = overtimeHours * overtimeRate;
				return regularPay + overtimePay;
			}
		}
	}

	// Q4 サブクラス PartTimeEmployee
	public static class PartTimeEmployee extends AbstractEmployee {
		private static final int HOURLY_RATE = 1000;

		public PartTimeEmployee(String id, String name) {
			super(id, name);
		}

		@Override
		public int calculateDailyWage(int hoursWorked) {
			return hoursWorked * HOURLY_RATE;
		}
	}

	/**
	 * Q5（ポリモーフィズム）で使うクラス定義
	 */

	// Q5 抽象クラス
	public static abstract class EmployeeQ5 {
		protected String id;
		protected String name;

		public EmployeeQ5(String id, String name) {
			this.id = id;
			this.name = name;
		}

		public abstract int calculateDailyWage(int hoursWorked);
	}

	// Q5 サブクラス FullTimeEmployeeQ5
	public static class FullTimeEmployeeQ5 extends EmployeeQ5 {
		public FullTimeEmployeeQ5(String id, String name) {
			super(id, name);
		}

		@Override
		public int calculateDailyWage(int hoursWorked) {
			int hourlyRate = 1250;
			int overtime = Math.max(0, hoursWorked - 8);
			int regularHours = hoursWorked - overtime;
			return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
		}
	}

	// Q5 サブクラス ContractEmployeeQ5
	public static class ContractEmployeeQ5 extends EmployeeQ5 {
		public ContractEmployeeQ5(String id, String name) {
			super(id, name);
		}

		@Override
		public int calculateDailyWage(int hoursWorked) {
			int hourlyRate = 1000;
			return hoursWorked * hourlyRate;
		}
	}

	/**
	 * Q6（インターフェイス）で使うクラス定義
	 */

	// Q6 インターフェイス Billable
	public interface Billable {
		int costForDay(int hoursWorked);
	}

	// Q6 抽象クラス
	public static abstract class EmployeeQ6 implements Billable {
		protected String id;
		protected String name;

		public EmployeeQ6(String id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public abstract int costForDay(int hoursWorked);
	}

	// Q6 サブクラス FullTimeEmployeeQ6
	public static class FullTimeEmployeeQ6 extends EmployeeQ6 {
		private static final int HOURLY_RATE = 1250;

		public FullTimeEmployeeQ6(String id, String name) {
			super(id, name);
		}

		@Override
		public int costForDay(int hoursWorked) {
			if (hoursWorked <= 8) {
				return hoursWorked * HOURLY_RATE;
			} else {
				int regularPay = 8 * HOURLY_RATE;
				int overtimeHours = hoursWorked - 8;
				int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);
				return regularPay + overtimePay;
			}
		}
	}

	// Q6 サブクラス ContractEmployeeQ6
	public static class ContractEmployeeQ6 extends EmployeeQ6 {
		private static final int HOURLY_RATE = 1000;

		public ContractEmployeeQ6(String id, String name) {
			super(id, name);
		}

		@Override
		public int costForDay(int hoursWorked) {
			return hoursWorked * HOURLY_RATE;
		}
	}

	/**
	 * Q7（SOLID）で使うクラス定義
	 */

	// Q7 抽象クラス
	public static abstract class EmployeeQ7 {
		protected String name;
		protected int hours;

		public EmployeeQ7(String name, int hours) {
			this.name = name;
			this.hours = hours;
		}

		public String getName() {
			return name;
		}

		public abstract int calculateSalary();
	}

	// Q7 サブクラス FullTimeEmployee
	public static class FullTimeEmployeeQ7 extends EmployeeQ7 {
		private static final int HOURLY_RATE = 1200;

		public FullTimeEmployeeQ7(String name, int hours) {
			super(name, hours);
		}

		@Override
		public int calculateSalary() {
			return this.hours * HOURLY_RATE;
		}
	}

	// Q7 サブクラス ContractEmployee
	public static class ContractEmployeeQ7 extends EmployeeQ7 {
		private static final int HOURLY_RATE = 1000;

		public ContractEmployeeQ7(String name, int hours) {
			super(name, hours);
		}

		@Override
		public int calculateSalary() {
			return this.hours * HOURLY_RATE;
		}
	}

	// Q7 レポートクラス
	public static class SalaryReporterQ7 {
		public void printReport(EmployeeQ7 e) {
			int salary = e.calculateSalary();
			System.out.println(e.getName() + "の給料は" + salary + "円");
		}
	}

} // ★★★ Question1 クラスはここで終わり ★★★