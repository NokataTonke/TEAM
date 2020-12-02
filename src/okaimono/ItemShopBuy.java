package okaimono;

public class ItemShopBuy {
	public void optionDisply(Bag b) {

		System.out.println
				("-------------");
		System.out.println
				("アイテム屋のおばちゃん：「何が欲しいんだい？」");
		System.out.println
				("[あなたの所持金] \\" + b.money);
		System.out.println();
		System.out.println(
				"1.薬草(\\100)" + "(" + b.getYakuso() + "有)　" +
				"2.エリクサー(\\250)" + "(" + b.getElixir() + "有)　" +
				"3.酒(\\300)" +  "(" + b.getSake() + "有)　");
		System.out.println(
				"4.煙幕(\\500)" + "(" + b.getEnmaku() + "有)　" +
				"5.タバコ(\\3000)" + "(" + b.getTabako() + "有)　");
		System.out.println();

		int i = new java.util.Scanner(System.in).nextInt();
		BuyConfirm bc = new BuyConfirm();

		switch(i) {
			case 1:
				bc.buyConfirm(b, 1, b.getYakuso());
				break;
			case 2:
				bc.buyConfirm(b, 2, b.getElixir());
				break;
			case 3:
				bc.buyConfirm(b, 3, b.getSake());
				break;
			case 4:
				bc.buyConfirm(b, 4, b.getEnmaku());
				break;
			case 5:
				bc.buyConfirm(b, 5, b.getTabako());
				break;
		}

		int k;
		do {
			System.out.println
					("-------------");
			System.out.println
					("アイテム屋のおばちゃん：「他に欲しい物はあるかい？」");
			System.out.println
					("[あなたの所持金] \\" + b.money);
			System.out.println();
			System.out.println(
					"1.薬草(\\100)" + "(" + b.getYakuso() + "有)　" +
					"2.エリクサー(\\250)" + "(" + b.getElixir() + "有)　" +
					"3.酒(\\300)" +  "(" + b.getSake() + "有)　");
			System.out.println(
					"4.煙幕(\\500)" + "(" + b.getEnmaku() + "有)　" +
					"5.タバコ(\\3000)" + "(" + b.getTabako() + "有)　" +
					"6. もう大丈夫");
			System.out.println();

			k = new java.util.Scanner(System.in).nextInt();
			switch(k) {
				case 1:
					bc.buyConfirm(b, 1, b.getYakuso());
					break;
				case 2:
					bc.buyConfirm(b, 2, b.getElixir());
					break;
				case 3:
					bc.buyConfirm(b, 3, b.getSake());
					break;
				case 4:
					bc.buyConfirm(b, 4, b.getEnmaku());
					break;
				case 5:
					bc.buyConfirm(b, 5, b.getTabako());
					break;
				case 6:
					System.out.println
							("アイテム屋のおばちゃん：「他にも何かようかい？」");
					System.out.println
							("[あなたの所持金] \\" + b.money);
					System.out.println();
					break;
			}
		} while (k != 6);

	}
}
