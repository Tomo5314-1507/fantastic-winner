package curriculum_D;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    // バトルログを保存（ほぞん）する
    private static StringBuilder log = new StringBuilder();
    private static Random rand = new Random();

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("「Player vs Daemon」バトルプログラム");
        System.out.println("====================================");

        // --- 1. Player の作成（さくせい） ---
        System.out.print("Playerの名前（なまえ）を入力してください: ");
        String playerName = scanner.nextLine();
        Player player = new Player(playerName);
        logInfo("Player「" + player.getName() + "」を作成（さくせい）しました。");
        player.printStatus(log); // ステータスを表示（ひょうじ）
        
        // --- 2. Daemon の読（よ）み込（こ）み ---
        Daemon daemon = null;
        try {
            // Daemon.java の loadDaemon メソッドを呼（よ）び出（だ）す
            daemon = Daemon.loadDaemon("daemon_status.txt");
            logInfo("Daemon「" + daemon.getName() + "」を読（よ）み込（こ）みました。");
            daemon.printStatus(log); // ステータスを表示（ひょうじ）
            
        } catch (FileNotFoundException e) {
            logInfo("エラー: daemon_status.txt が見（み）つかりません。");
            e.printStackTrace();
            scanner.close();
            return; // プログラム終了（しゅうりょう）
        }

        System.out.println("====================================");
        logInfo("バトルを開始（かいし）します。");

        // --- 3. 先攻（せんこう）決定（けってい） ---
        Character attacker; // 先（さき）に攻撃（こうげき）する人（ひと）
        Character defender; // あとで攻撃（こうげき）する人（ひと）

        if (player.getSp() > daemon.getSp()) {
            attacker = player;
            defender = daemon;
        } else if (daemon.getSp() > player.getSp()) {
            attacker = daemon;
            defender = player;
        } else {
            // SPが同（おな）じ場合（ばあい）はランダム
            logInfo("SPが同（おな）じため、先攻（せんこう）をランダムで決定（けってい）します。");
            if (rand.nextBoolean()) {
                attacker = player;
                defender = daemon;
            } else {
                attacker = daemon;
                defender = player;
            }
        }

        logInfo(attacker.getName() + " の先攻（せんこう）！");
        System.out.println();

        // --- 4. バトルループ ---
        int turn = 1;
        while (player.isAlive() && daemon.isAlive()) {
            logInfo("--- ターン " + turn + " ---");
            
            // (1) 先攻（せんこう）の攻撃（こうげき）
            executeAttack(attacker, defender);
            
            // ターゲットが倒（たお）れたかチェック
            if (!defender.isAlive()) {
                break; // バトル終了（しゅうりょう）
            }
            
            // (2) 後攻（こうこう）の攻撃（こうげき）
            executeAttack(defender, attacker);

            // ターゲットが倒（たお）れたかチェック
            if (!attacker.isAlive()) {
                break; // バトル終了（しゅうりょう）
            }
            
            System.out.println();
            turn++;
        }

        // --- 5. 結果（けっか）判定（はんてい） ---
        System.out.println("====================================");
        if (player.isAlive()) {
            logInfo(player.getName() + " の勝利（しょうり）！");
        } else {
            logInfo(daemon.getName() + " の勝利（しょうり）...");
        }

        // --- 6. ログをファイルに出力（しゅつりょく） ---
        writeLogToFile(log.toString());
        
        scanner.close();
    }
    
    /**
     * 攻撃（こうげき）を実行（じっこう）し、ログ（ろぐ）を追加（ついか）するメソッド
     */
    private static void executeAttack(Character attacker, Character target) {
        logInfo(attacker.getName() + " の攻撃（こうげき）！");
        
        // Character.java の attack メソッドを呼（よ）び出（だ）す
        int damage = attacker.attack(); // 攻撃（こうげき）ダメージを取得（しゅとく）
        
        // Character.java の takeDamage メソッドを呼（よ）び出（だ）す
        target.takeDamage(damage);
        
        logInfo(target.getName() + " は " + damage + " のダメージを受（う）けた。");
        logInfo(target.getName() + " の残（のこ）りHP: " + target.getHp());
    }

    /**
     * メッセージをコンソールとログ（ろぐ）の両方（りょうほう）に出力（しゅつりょく）するメソッド
     */
    private static void logInfo(String message) {
        System.out.println(message);
        log.append(message + "\n"); // ログ（ろぐ）にも追加（ついか）
    }
    
    /**
     * ログ（ろぐ）を battle_log.txt に書（か）き込（こ）むメソッド
     */
    private static void writeLogToFile(String logData) {
        // try-with-resources (ファイル書（か）き込（こ）みのお決（き）まり文句（もんく）)
        try (PrintWriter writer = new PrintWriter(new FileWriter("battle_log.txt"))) {
            writer.print(logData);
            System.out.println("====================================");
            System.out.println("バトル結果（けっか）を battle_log.txt に記録（きろく）しました。");
        } catch (IOException e) {
            System.out.println("ログ（ろぐ）の書（か）き込（こ）み中（ちゅう）にエラーが発生（はっせい）しました。");
            e.printStackTrace();
        }
    }
}