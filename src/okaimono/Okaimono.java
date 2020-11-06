package okaimono;

public class Okaimono {
	public void goItemShop() {
		System.out.println("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「いらっしゃい！いいものあるよ。」");
		System.out.println
				("[あなたの所持金] \\" + HeroBag.money);
		System.out.println();

		while(true) {
			System.out.println
					("1.買う 2.売る 3.話す 4.アイテム屋を去る");
			int i = new java.util.Scanner(System.in).nextInt();
			switch (i) {
				case 1:
					ItemShopBuy isb = new ItemShopBuy();
					isb.optionDisply();
					break;
				case 2:
					ItemShopSell iss = new ItemShopSell();
					iss.optionDisply();
					break;
				case 3:
					ItemShopTalk.toObatyan();
					break;
				case 4:
					System.out.println
							("アイテム屋のおばちゃん：「そうかい。また来るんだよ！」");
					System.out.println();
					break;
				default:
			}
			if(i == 4) {
				break;
			}
		}
	}
	public void goWeaponShop() {
		System.out.println
				("-------------");
		System.out.println
				("武具屋の親父：「らっしゃい！調子はどうだい？」");
		System.out.println();

	}
}
