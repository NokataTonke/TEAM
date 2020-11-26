package okaimono;

public class Hero {
	//フィールド
	private int HP;
	private int MP;
	private int EXP;
	private int ATK;
	private int Level;
	private int HPMAX;
	private int MPMAX;
	private Weapon w;
	final int LevelMAX = 30;
	private String name;

	//Getter,Setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return this.Level;
	}
	public void setLevel(int Level) {
		this.Level = Level;
	}
	public int getHP() {
		return this.HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}
	public int getMP() {
		return this.MP;
	}
	public void setMP(int MP) {
		this.MP = MP;
	}
	public int getEXP() {
		return this.EXP;
	}
	public void setEXP(int EXP) {
		this.EXP = EXP;
	}
	public int getATK() {
		return this.ATK;
	}
	public void setATK(int ATK) {
		this.ATK = ATK;
	}
	public int getHPMAX() {
		return this.HPMAX;
	}
	public void setHPMAX(int HPMAX) {
		this.HPMAX = HPMAX;
	}
	public int getMPMAX() {
		return this.MPMAX;
	}
	public void setMPMAX(int MPMAX) {
		this.MPMAX = MPMAX;
	}
	public Weapon getWeapon() {
		return this.w;
	}
	public void setWeapon(Weapon w) {
		this.w = w;
	}

//	public void attack(Monster m) {
		//バトルで使用される攻撃メソッドの中身をここに記述
//	}
//	public void run() {
		//バトルで使用される逃げるメソッドの中身をここに記述
//	}

	public void showStatus() {
		System.out.println("----------");
		System.out.println();
		System.out.println(
				"勇者" + getName() + "　Lv" + getLevel() + "あと" + "ほにゃ" + "EXPでLvUP"
		);
		System.out.println(
				"　　　　　HP:" + getHP() + " MP:" + getMP()
		);
		System.out.println(
				"　　　　　EXP:" + getEXP() + " 所持金:" + HeroBag.money
		);
		System.out.println(
				"　　　　　装備:" +
						getWeapon().getName() + "(ATK" + getWeapon().getATK() + ")"
		);
		System.out.println(
				"　　　　　ATK:" +
				(getATK() + getWeapon().getATK()) +
				" = (" + getATK() + " + " + getWeapon().getATK() + ")"
		);
		System.out.println(
				"　　　　　最深到達ダンジョン階数:" + "ほにゃ"
		);
		System.out.println();
		System.out.println("　　　　　　　　0.戻る");
		System.out.println("----------");
	}
}
