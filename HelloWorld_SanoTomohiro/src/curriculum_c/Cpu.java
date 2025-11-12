package curriculum_c;
import java.util.Random; // ★ ランダムを使うために必要

public class Cpu {
    
    // 1. CPUの手を保存する変数
    private int hand;

    // 2. new された時（作られた時）に、自動で手を決める
    public Cpu() {
        Random random = new Random();
        this.hand = random.nextInt(3); // 0, 1, 2 のどれかの数字をランダムで選ぶ
    }

    // 3. 自分の手を（数字で）教える
    public int getHand() {
        return this.hand;
    }

    // 4. 自分の手を（名前で）教える
    public String getHandName() {
        switch (this.hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "不明な手";
        }
    }
}