package curriculum_c;

public class Player {
    
    // 1. プレイヤーの手を保存する変数
    private int hand;

    // 2. new された時（作られた時）に、選んだ手をセットする
    public Player(int hand) {
        this.hand = hand;
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