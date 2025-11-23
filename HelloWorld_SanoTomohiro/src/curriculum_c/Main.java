package curriculum_c;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 「勝つまで繰り返す」ために、while(true) のループを使います
        while (true) {
            System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
            
            // 1. Player クラス（設計図）から、プレイヤーを作る
            int handInput = scanner.nextInt();
            Player player = new Player(handInput); // ← Player.java を見に行く

            // 2. Cpu クラス（設計図）から、CPUを作る
            Cpu cpu = new Cpu(); // ← Cpu.java を見に行く

            // 3. それぞれの手を表示する
            System.out.println("あなたの手: " + player.getHandName());
            System.out.println("CPUの手: " + cpu.getHandName());

            // 4. 勝敗を判定する
            int p = player.getHand();
            int c = cpu.getHand();

            if (p == c) {
                // --- あいこ ---
                System.out.println("あいこです。もう一度！");
                
            } else if ((p == 0 && c == 1) || // グー vs チョキ
                       (p == 1 && c == 2) || // チョキ vs パー
                       (p == 2 && c == 0)) { // パー vs グー
                
                // --- 勝ち ---
                System.out.println("あなたの勝ち！");
                break; // ★★★ 勝ったので、while ループを抜ける

            } else {
                // --- 負け ---
                System.out.println("あなたの負け...。もう一度！");
            }
            
            System.out.println(); // 次の勝負の前に改行
        }
        
        // ループを抜けたら、プログラム終了
        scanner.close();
    }
}