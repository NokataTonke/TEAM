package okaimono;

import java.util.Scanner;

public class Weapon {
	//フィールド
	int equipNow;
	//現在装備してる武器
	String equipName;
	//装備中の装備名
	int equipATK;
	//装備中の装備攻撃力
	boolean haveArray[] = {true, false, true, false, false, true, true};
	boolean equipArray[] = {true, false, false, false, false, false, true};
	String nameArray[] =
		{"ひのきの棒", "青銅の剣", "鉄の剣",
		"鋼の剣", "チタン合金の剣", "伝説の剣", "素手"};
	int atkArray[] = {10, 15, 25, 35, 45, 60, 0};
	//説明書き
	String infoArray[] = {
			"　固い檜でできた棒\n" +
			"　その辺に落ちている"	,
			"　青銅でできた剣\n" +
			"　文明の狼煙",
			"　青銅でできた剣\n" +
			"　文明の狼煙",
			"　鋼でできた剣\n" +
			"　練度が上がった鉄の剣",
			"　チタン合金って知ってる？\n" +
			"　まるで将棋だな",
			"　言うまでもないレジェンド\n" +
			"　但し使い手を選ぶ",
			"生まれたままの姿"
	};


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
		//武器の一覧表示
		int k;
		do {

		int count = 0;
		System.out.println("----------");
		System.out.println("【武器を選択してください】");
		System.out.println();

		for(int i = 0; i < 6; i++) {
			count++;
			if(haveArray[i] == true) {
				if(equipArray[count - 1]) {
					System.out.print("　E　");
				} else {
					System.out.print("　 　");
				}
				System.out.println(count + "," + nameArray[count - 1] );
			}
		}

		System.out.println();
		System.out.println("　　　0.戻る");
		System.out.println("----------");

			k = new Scanner(System.in).nextInt();
			switch(k) {
			case 0:
				break;
			default:
				//このままだと持ってなくても数字を入れれば装備ができてしまう
				System.out.println("-----------");
				if(equipArray[k-1]) {
					System.out.println("【装備を外しますか？】");
				}else {
					System.out.println("【装備しますか？】");
				}
				if(equipArray[k-1]) {
					System.out.print("　E　");
				} else {
					System.out.print("　 　");
				}
				System.out.println(nameArray[k-1]);
				System.out.println();
				System.out.println(infoArray[k-1]);
				System.out.println();
				System.out.println("　　1,Yes　2,No");
				System.out.println("-----------");
				
				int l;
				l = new Scanner(System.in).nextInt();
				if(l == 1) {
					if(equipArray[k-1]) {
						equipArray[k-1] = false;
						equipNow = 6;
						System.out.println("装備を外して素手になった");
					}else {
						equipArray[equipNow] = false;
						equipArray[k-1] = true;
						equipNow = k-1;
						System.out.println(nameArray[k-1] +"を装備した！");
					}
				}else if (l == 2) {
					//2.Noを押したときは特に処理しない。
				}
				break;
			}
		} while(k != 0);
	}

	public void equipWeapon(int equipNow) {
		//武器装備時に名前と攻撃力を設定
		setName(nameArray[equipNow]);
		setATK(atkArray[equipNow]);
	}

	public void gainWeapon(int weaponNumber) {
		haveArray[weaponNumber] = true;
	}
	public void loseWeapon(int weaponNumber) {
		haveArray[weaponNumber] = false;
	}
	public void armWeapon(int number) {
		equipArray[number] = true;
	}
	public void unarmWeapon(int number) {
		equipArray[number] = false;
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
