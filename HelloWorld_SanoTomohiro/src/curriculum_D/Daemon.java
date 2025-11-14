package curriculum_D;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Daemon (Character の「子供（こども）クラス」)
 */
public class Daemon extends Character {

    // コンストラクタ (loadDaemon メソッドから呼（よ）び出（だ）される)
    public Daemon(String name, int hp, int at, int sp) {
        // 親（おや）クラス(Character)のコンストラクタを呼（よ）び出（だ）す
        super(name, hp, at, sp);
    }

    /**
     * daemon_status.txt を読（よ）み込（こ）んで、
     * Daemonオブジェクトを作成（さくせい）して返（かえ）す
     */
    public static Daemon loadDaemon(String filepath) throws FileNotFoundException {
        
        // try-with-resources (ファイル読（よ）み込（こ）みのお決（き）まり文句（もんく）)
        try (Scanner fileScanner = new Scanner(new File(filepath))) {
            
            String name = fileScanner.nextLine();
            int hp = fileScanner.nextInt();
            int at = fileScanner.nextInt(); 
            int sp = fileScanner.nextInt();
            
            // 読（よ）み込（こ）んだステータスで new Daemon() を実行（じっこう）して返（かえ）す
            return new Daemon(name, hp, at, sp);
            
        } catch (FileNotFoundException e) {
            System.out.println("読（よ）み込（こ）みエラー: " + filepath + " が見（み）つかりません。");
            throw e; // エラーを Main.java に通知（つうち）する
        }
    }
}