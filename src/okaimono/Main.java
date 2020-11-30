package okaimono;

public class Main {

	public static void main(String[] args) {
		Bag b = new Bag();
		Weapon w = new Weapon();
		w.equipWeapon(5);
		Hero h = new Hero();
		h.setWeapon(w);
		Okaimono oi = new Okaimono();

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
					oi.goItemShop();
					break;
				case 2:

					System.out.println();
					System.out.println("！！！！！！！！！！！！！");
					System.out.println("!【この処理はまだ未完成】!");
					System.out.println("！！！！！！！！！！！！！");
					System.out.println();

					oi.goWeaponShop();
					break;
				case 3:
					b.showBag();

					int j;
					j = new java.util.Scanner(System.in).nextInt();
					if (j == 0) {
						break;
					} else {
						continue;
					}
				case 4:
					h.showStatus();

					int k;
					k = new java.util.Scanner(System.in).nextInt();
					if (k == 0) {
						break;
					}
			}
		}
	}
}

