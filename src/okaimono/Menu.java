package okaimono;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Bag b = new Bag();
		Weapon w = new Weapon();
		Hero h = new Hero();

//		Shop s = new Shop(b, w);//ショップクラスはMenuで使われない
		int floor = 1;//ダンジョンインスタンスの.floor

		while(true) {
			w.equipWeapon(w.equipNow);
			h.setWeapon(w);
			System.out.println("----------");
			System.out.println();
			System.out.println
					("【任意のメニューを選択してください】");
			System.out.println();
			System.out.println
					("①.ステータス ②.アイテム ③.装備 ④.図鑑");
			System.out.println();
			System.out.println("----------");

			int i = new Scanner(System.in).nextInt();
			switch (i) {
				case 1:
					h.showStatus(b, w, floor);

					int j;
					j = new Scanner(System.in).nextInt();
					if (j == 0) {
						break;
					}
					break;
				case 2:
					int k;
					b.showBag(h, b);

//					k = new Scanner(System.in).nextInt();
//					if (k == 0) {
//
//					}

					break;
				case 3:
					w.showWeapon();
					break;
				case 4:
					System.out.println();
					System.out.println("！！！！！！！！！！！！！");
					System.out.println("!【図鑑処理の画面表示】!");
					System.out.println("！！！！！！！！！！！！！");
					System.out.println();
					break;
				case 0:
			}
		}
	}

//			case 1:
//				s.goItemShop(b);
//				break;
//			case 2:
//
//				System.out.println();
//				System.out.println("！！！！！！！！！！！！！");
//				System.out.println("!【この処理はまだ未完成】!");
//				System.out.println("！！！！！！！！！！！！！");
//				System.out.println();
//
//				s.goWeaponShop(w);
//				break;
}

