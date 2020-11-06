package okaimono;

public class BuyConfirm {
	public void buyConfirm(int i, int hbItem) {
		String selectItem = null;
		int selectPrice = 0;
		int nowMoney = HeroBag.money;

		switch(i) {
			case 1:
				selectItem = "薬草";
				selectPrice = 100;
				break;
			case 2:
				selectItem = "消毒薬";
				selectPrice = 250;
				break;
			case 3:
				selectItem = "酒";
				selectPrice = 300;
				break;
			case 4:
				selectItem = "煙幕";
				selectPrice = 500;
				break;
			case 5:
				selectItem = "タバコ";
				selectPrice = 3000;
				break;
		}

		System.out.println
				("アイテム屋のおばちゃん：「" + selectItem + "がいくつ欲しいんだい？」");
		System.out.println
				("-------------");
		System.out.print
				("[値段] \\" + selectPrice + " × " + "{購入数を入力してください}>" );

		int buyCount = new java.util.Scanner(System.in).nextInt();

		System.out.println
				("[値段] \\" + selectPrice + " × " + buyCount);
		System.out.println
				("アイテム屋のおばちゃん：「" + buyCount + "個でいいんだね？」");

		System.out.println
				("[あなたの所持金] \\" + HeroBag.money + "　→　\\" +
				(nowMoney - (selectPrice * buyCount)));
		System.out.println
				(selectItem + "所持数：" +
				hbItem + "個　→　" + (hbItem + buyCount) + "個");
		System.out.println
				("-------------");
		System.out.println();
		System.out.println
				("よろしいですか？");
		System.out.println
				("1.YES 2.NO");
		System.out.println();

		int j = new java.util.Scanner(System.in).nextInt();
			if(j == 1) { // 買う。YESを選択した場合
				switch(i) {
				case 1:
					if(HeroBag.money >= selectPrice * buyCount) {
						System.out.println
								(selectItem + "を" + buyCount + "個手に入れた！");
						HeroBag.yakuso += buyCount;
						HeroBag.money -= selectPrice * buyCount;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 2:
					if(HeroBag.money >= selectPrice * buyCount) {
						System.out.println
								(selectItem + "を" + buyCount + "個手に入れた！");
						HeroBag.shodoku += buyCount;
						HeroBag.money -= selectPrice * buyCount;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 3:
					if(HeroBag.money >= selectPrice * buyCount) {
						System.out.println
								(selectItem + "を" + buyCount + "個手に入れた！");
						HeroBag.sake += buyCount;
						HeroBag.money -= selectPrice * buyCount;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 4:
					if(HeroBag.money >= selectPrice * buyCount) {
						System.out.println
								(selectItem + "を" + buyCount + "個手に入れた！");
						HeroBag.enmaku += buyCount;
						HeroBag.money -= selectPrice * buyCount;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
				case 5:
					if(HeroBag.money >= selectPrice * buyCount) {
						System.out.println
								(selectItem + "を" + buyCount + "個手に入れた！");
						HeroBag.tabako += buyCount;
						HeroBag.money -= selectPrice * buyCount;
					} else {
						System.out.println
								("アイテム屋のおばちゃん：「お金が足りないじゃないか。」");
					}
					break;
			}
				System.out.println
						("[あなたの所持金] \\" + HeroBag.money);
				System.out.println();

			}
			if(j == 2) { // 買わない。NOを選択した場合
				System.out.println
						("アイテム屋のおばちゃん：「いらないのかい？わかったよ。」");
				System.out.println();

			}
	}
}
