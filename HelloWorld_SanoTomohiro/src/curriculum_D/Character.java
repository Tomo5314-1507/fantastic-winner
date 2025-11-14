package curriculum_D;

/**
 * 共通（きょうつう）の「親（おや）」クラス
 */
public abstract class Character {
    
    // protected: 自分（じぶん）と、子供（こども）(Player, Daemon) からアクセス可能（かのう）
    protected String name;
    protected int hp;
    protected int at;
    protected int sp;

    // コンストラクタ (部品（ぶひん）から呼（よ）び出（だ）される)
    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    // --- メソッド (動作（どうさ）) ---

    // 攻撃（こうげき）する (自分（じぶん）の攻撃力（こうげきりょく）を返（かえ）す)
    public int attack() {
        return this.at;
    }

    // ダメージを受（う）ける
    public void takeDamage(int damage) {
        this.hp -= damage;
        // HPが0未満（みまん）にならないようにする
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    // 生（い）きているか？
    public boolean isAlive() {
        return this.hp > 0;
    }

    // ステータスを表示（ひょうじ）する
    public void printStatus(StringBuilder log) {
        String status = "[HP: " + hp + ", AT: " + at + ", SP: " + sp + "]";
        System.out.println(status);
        log.append(status + "\n");
    }

    // --- Getter (情報（じょうほう）を教（おし）える) ---
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getAt() {
        return at;
    }

    public int getSp() {
        return sp;
    }
}