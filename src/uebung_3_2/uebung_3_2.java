package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {

		double bestellwert = 500;
		double bisherigesKundenBestellvolumen = 250;
		boolean istPremiumKunde = true;

		double mengenrabatt = 0;
		double mengenrabatt0 = 0;
		double mengenrabatt1 = 1;
		double mengenrabatt2 = 2;
		double mengenrabatt3 = 3;
		double mengenrabatt4 = 5;

		if (bestellwert >= 100 && bestellwert < 500) {
			mengenrabatt = mengenrabatt1;
		} else {
			if (bestellwert >= 500 && bestellwert < 2000) {
				mengenrabatt = mengenrabatt2;
			} else {
				if (bestellwert >= 2000 && bestellwert < 5000) {
					mengenrabatt = mengenrabatt3;
				} else {
					if (bestellwert >= 5000) {
						mengenrabatt = mengenrabatt4;
					}
				}
			}
		}
		if (istPremiumKunde = true) {
			mengenrabatt0 = 2 * mengenrabatt;
		} else {
		}

		double treuerabatt = 0;
		double treuerabatt1 = 7.5;
		double treuerabatt2 = 12.5;

		if (bisherigesKundenBestellvolumen > 50000) {
			treuerabatt = treuerabatt2;
		} else {
		}
		if (bisherigesKundenBestellvolumen > 10000 && bisherigesKundenBestellvolumen <= 50000) {
			treuerabatt = treuerabatt1;
		} else {
		}
		double bonusrabatt = 0;
		double bonusrabatt1 = 3;

		if (bestellwert >= 2 * bisherigesKundenBestellvolumen) {
			bonusrabatt = bonusrabatt1;
		} else {
			bonusrabatt = 0;
		}
		double rabatt;
		rabatt = mengenrabatt0 + treuerabatt + bonusrabatt;

		if (rabatt > 20 && istPremiumKunde == true) {
			System.out.println("Rabatt: 20%");
		} else {
			if (rabatt <= 20 && istPremiumKunde == true) {
				System.out.println("Rabatt:" + rabatt);
			} else {
				if (rabatt > 15 && istPremiumKunde == false) {
					System.out.println("Rabatt: 15%");
				} else {
					System.out.println("Rabatt: " + rabatt);
				}
			}
		}

	}
}