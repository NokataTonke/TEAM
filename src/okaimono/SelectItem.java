package okaimono;

import java.util.Scanner;

public class SelectItem {
	boolean battle = false;
	// バトル中か否かを判定するために必要なフィールド
	// バトルクラスからHeroクラスかBagに書き込むなどいろいろ

	public void selectItem(Bag b, Hero h) {
		int i;
		i = new Scanner(System.in).nextInt();

		switch (i) {
		case 0:
			break;
		case 1:
			if (battle == true) {
				b.useYakusoInB(h);
			} else {
				b.useYakusoOutB(h);
			}
			break;
		case 2:
			if (battle == true) {
				b.useEnmakuInB(h);
			} else {
				b.useEnmakuOutB();
			}
			break;
		case 3:
			if (battle == true) {
				b.useSakeInB();
			} else {
				b.useSakeOutB();
			}
			break;
		case 4:
			if (battle == true) {
				b.useTabakoInB();
			} else {
				b.useTabakoOutB();
			}
			break;
		case 5:
			if (battle == true) {
				b.useElixirInB(h);
			} else {
				b.useElixirOutB();
			}
			break;
		}
	}
}
