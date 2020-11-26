package okaimono;

public class Weapon {
	//フィールド
	int equipNow;
	String equipName;
	int equipATK;
	boolean haveArray[] = {true, false, true, false, false, true};

	//ゲッター、セッター
	public String getName() {
		return equipName;
	}
	public void setName(String equipName) {
		this.equipName = equipName;
	}
	public int getATK() {
		return equipATK;
	}
	public void setATK(int equipATK) {
		this.equipATK = equipATK;
	}

	//メソッド
	public void showWeapon() {
		System.out.println("----------");
		System.out.println();
		System.out.println("あなたの装備は" + getName() + "(ATK" + 10 + ")");
		System.out.println();
		System.out.println("　　　　　　　　0.戻る");
		System.out.println("----------");
	}

	public void equipWeapon(int equipNow) {
		switch(equipNow) {
		case 2:
			setName("ひのきの棒");
			setATK(10);
			break;
		case 1:
			break;
		case 0:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}

	public void test() {
		for(int i = 0; i < 3; i++) {
			if(haveArray[i] == true) {
				System.out.println("true ");
			} else if (haveArray[i] == false){
				System.out.println("false ");
			}
		}
	}
}
