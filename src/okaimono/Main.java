package okaimono;

public class Main {

	public static void main(String[] args) {
		while(true) {
			System.out.println
					("【何をしようか？】");
			System.out.println
					("[あなたの所持金] \\" + Bag.money);
			System.out.println();
			System.out.println
					("1.アイテム屋へ 2.武具屋へ 3.バック確認 4.ステータス確認");
			System.out.println();

			int i = new java.util.Scanner(System.in).nextInt();
			switch (i) {
				case 1:
					Okaimono oi = new Okaimono();
					oi.goItemShop();
					break;
				case 2:

					System.out.println();
					System.out.println("！！！！！！！！！！！！！");
					System.out.println("!【この処理はまだ未完成】!");
					System.out.println("！！！！！！！！！！！！！");
					System.out.println();

					Okaimono ow = new Okaimono();
					ow.goWeaponShop();
					break;
				case 3:
					Bag b = new Bag();
					b.showBag();
					break;
				case 4:
					int j;

					Weapon w = new Weapon();
					w.equipWeapon(2);
//					w.showWeapon();


					Hero h = new Hero();
					h.setWeapon(w);
					h.showStatus();



					j = new java.util.Scanner(System.in).nextInt();
					if (j == 0) {
						break;
					}

//					Hero h = new Hero();
//					h.showStatus();
			}
		}
	}
}

