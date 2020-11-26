package okaimono;

public class Hero {
	//フィールド
	//ATKはLevel依存なのでフィールド宣言とセッターをなくした
	//LevelもEXP依存だが、処理が面倒っぽい

	//！Level20のときは()中の日本語を変える

	private int EXP = 56;
	private int Level = 6;
	private int HP;
	private int MP;
	int HPMAX;
	int MPMAX;
	private Weapon w;
	final int LevelMAX = 30;
	private String name = "クラウド";
	int EXPArray[] = {
					  10, 10, 10, 10, 10, 10, 10, 10, 10,
					  20, 20, 20, 20, 20, 20, 20,
					  30, 30, 30, 30,
	};

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
	public int getEXP() {
		return this.EXP;
	}
	public void setEXP(int EXP) {
		this.EXP = EXP;
	}
	public Weapon getWeapon() {
		return this.w;
	}
	public void setWeapon(Weapon w) {
		this.w = w;
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
				"勇者" + getName() + "　Lv" + getLevel() + "(あと" + restEXP() + "EXPでLvUP)"
		);
		System.out.println();
		System.out.println(
				"　　　　　HP:" + getMAXHP() + " MP:" + getMAXMP()
		);
		System.out.println(
				"　　　　　EXP:" + getEXP() + " 所持金:" + Bag.money
		);
		System.out.println(
				"　　　　　装備:" +
						getWeapon().getName() + "(ATK:" + getWeapon().getATK() + ")"
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

	public int restEXP() {
		int nextEXP = 0;
		int restEXP;

		for (int j=0; j<getLevel(); j++) {
			nextEXP += EXPArray[j];
		}

		restEXP = nextEXP - getEXP();

		return restEXP;
	}

//	public int getLevel() {

//	}

	public int getATK() {
		int atkSUM = 9;
		for (int i=0; i<getLevel(); i++) {
			atkSUM++;
		}
		return atkSUM;
	}
	public int getMAXHP() {
		int MAXHP = 48;
		for (int i=0; i<getLevel(); i++) {
			MAXHP += 2;
		}
		HPMAX = MAXHP;
		return MAXHP;
	}
	public int getMAXMP() {
		int MAXMP = 20;
		if (getLevel() >= 17) {
			MAXMP = 40;
		} else if (getLevel() >= 10) {
			MAXMP = 30;
		}
		MPMAX = MAXMP;
		return MAXMP;
	}
}
