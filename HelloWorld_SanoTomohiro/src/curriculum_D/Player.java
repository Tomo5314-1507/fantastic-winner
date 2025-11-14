package curriculum_D;

import java.util.Random;

/**
 * Player (Character の「子供（こども）クラス」)
 */
public class Player extends Character {
    
    private static Random rand = new Random();

    // Player が new された時（とき）に呼（よ）び出（だ）される
    public Player(String name) {
        
        // ★★★ 修正（しゅうせい） ★★★
        // super() を「1行（ぎょう）目（め）」で呼（よ）びます。
        // super() の引数（ひきすう）の中（なか）で、ランダムな値（あたい）を計算（けいさん）します。
        super(
            name, 
            rand.nextInt(51) + 50,  // HP (50〜100)
            rand.nextInt(11) + 5,   // AT (5〜15)
            rand.nextInt(11) + 5    // SP (5〜15)
        );
        
        // (ここにあった hp, at, sp の計算（けいさん）は super() の中（なか）に移動（いどう）しました)
    }
}