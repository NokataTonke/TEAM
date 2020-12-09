package okaimono;

import java.util.Scanner;

public class WeaponShopBuy {
	public void optionDisply(Weapon w, Dungeon d) {
		int priceArray[] = {10, 50, 100, 300, 600, 0};

		System.out.println
				("-------------");
		System.out.println
				("武具屋の親父：「何が欲しい？」");
		System.out.println
				("[あなたの所持金] \\" + Bag.gold);
		System.out.println();
		System.out.print("1.ひのきの棒 " + priceArray[0] + "G");
		if(w.haveArray[0]) {
			System.out.println("　ある");
		} else {
			System.out.println();
		}
		System.out.print("2.青銅の剣 " + priceArray[1] + "G");
		if(w.haveArray[1]) {
			System.out.println("　ある");
		} else {
			System.out.println();
		}
		if (d.floor >= 2) {
			System.out.print("3.鉄の剣 " + priceArray[2] + "G");
			if(w.haveArray[2]) {
				System.out.println("　ある");
			} else {
				System.out.println();
			}
			System.out.print("4.鋼の剣 " + priceArray[3] + "G");
			if(w.haveArray[3]) {
				System.out.println("　ある");
			} else {
				System.out.println();
			}
		}
		if (d.floor >= 3) {
			System.out.print("5.チタン合金の剣 "  + priceArray[4] + "G");
			if(w.haveArray[4]) {
				System.out.println("　ある");
			} else {
				System.out.println();
			}
		}
		System.out.println();

		int i = new java.util.Scanner(System.in).nextInt();
		BuyConfirm bc = new BuyConfirm();

		switch(i) {
			case 0:
				break;
			default:
				if(w.haveArray[i-1]) {//選択した武器を既に持ってるとき
					System.out.println
						("武具屋の親父：「もう持ってるじゃねえか。」");
				} else {//選択した武器をまだ持ってないとき
					if(Bag.gold >= priceArray[i-1]) {//金が足りるとき
						System.out.println
							("武具屋の親父：「毎度！」");
						w.gainWeapon(i-1);
						System.out.println
							("武具屋の親父：「装備していくかい？」");
						System.out.println
							("　　　　1.Yes 2.No");
						int l =new Scanner(System.in).nextInt();
						if(l == 1) {
							w.armWeapon(i-1);
							System.out.println
								("武具屋の親父：「装備ヨシ！」");
							System.out.println
								("武具屋の親父：「これでいいのだ！ガハハ！」");
						} else if (l == 2) {
							System.out.println
								("武具屋の親父：「何でえ？いいけどよ。」");
						}

					} else {//金が足りないとき
						System.out.println
							("武具屋の親父：「金がないんじゃあ売れないな。一昨日来やがれ。」");
					}
				}
			break;
		}

		int k;
		do {
			//戻るの処理を0.番号にする
			System.out.println
			("-------------");
			System.out.println
					("武具屋の親父：「他はどうだい？」");
			System.out.println
					("[あなたの所持金] \\" + Bag.gold);
			System.out.println();
			System.out.print("1.ひのきの棒 " + priceArray[0] + "G");
			if(w.haveArray[0]) {
				System.out.println("　ある");
			} else {
				System.out.println();
			}
			System.out.print("2.青銅の剣 " + priceArray[1] + "G");
			if(w.haveArray[1]) {
				System.out.println("　ある");
			} else {
				System.out.println();
			}
			if (d.floor >= 2) {
				System.out.print("3.鉄の剣 " + priceArray[2] + "G");
				if(w.haveArray[2]) {
					System.out.println("　ある");
				} else {
					System.out.println();
				}
				System.out.print("4.鋼の剣 " + priceArray[3] + "G");
				if(w.haveArray[3]) {
					System.out.println("　ある");
				} else {
					System.out.println();
				}
			}
			if (d.floor >= 3) {
				System.out.print("5.チタン合金の剣 "  + priceArray[4] + "G");
				if(w.haveArray[4]) {
					System.out.println("　ある");
				} else {
					System.out.println();
				}
			}
			System.out.println();

			k = new java.util.Scanner(System.in).nextInt();
			bc = new BuyConfirm();

			switch(k) {
				case 0:
					break;
				default:
					if(w.haveArray[k-1]) {//選択した武器を既に持ってるとき
						System.out.println("武具屋の親父：「もう持ってるじゃねえか。」");
					} else {//選択した武器をまだ持ってないとき
						if(Bag.gold >= priceArray[k]) {//金が足りるとき
							System.out.println("武具屋の親父：「毎度！」");
							w.gainWeapon(k-1);
							System.out.println
								("武具屋の親父：「装備していくかい？」");
							System.out.println
								("　　　　1.Yes 2.No");
							int l =new Scanner(System.in).nextInt();
							if(l == 1) {
								w.armWeapon(k-1);
								System.out.println
									("武具屋の親父：「装備ヨシ！」");
								System.out.println
									("武具屋の親父：「これでいいのだ！ガハハ！」");
							} else if (l == 2) {
							System.out.println
								("武具屋の親父：「何でえ？いいけどよ。」");
							}
						} else {//金が足りないとき
							System.out.println
								("武具屋の親父：「金がないんじゃあ売れないな。一昨日来やがれ。」");
						}
					}
					break;
			}

		} while (k != 0);

	}
}
