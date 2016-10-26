package uebung_3_2;

public class uebung_3_2 {

	public static void main(String[] args) {

		double bestellwert = 25000;
		double bisherigesKundenBestellvolumen = 12500;
		boolean istPremiumKunde = true;

		double mengenrabatt = 0;
		double treuerabatt = 0;
		double bonusrabatt = 0;
		double rabatt = 0;

		System.out.println("Bestellwert: " + bestellwert);

		if (bestellwert >= 5000) {
			mengenrabatt = 5;
		} else {
			if (bestellwert >= 2000) {
				mengenrabatt = 3;
			} else {
				if (bestellwert >= 500) {
					mengenrabatt = 2;
				} else {
					if (bestellwert >= 100) {
						mengenrabatt = 1;
					} else {
						mengenrabatt = 0;
					}
				}
			}
		}
		if (istPremiumKunde == true) {
			mengenrabatt = 2 * mengenrabatt;
		}

		if (bisherigesKundenBestellvolumen > 50000) {
			treuerabatt = 12.5;
		} else {
		}
		if (bisherigesKundenBestellvolumen > 10000) {
			treuerabatt = 7.5;
		} else {
			treuerabatt = 0;
		}

		if (bestellwert >= 2 * bisherigesKundenBestellvolumen) {
			bonusrabatt = 3;
		} else {
			bonusrabatt = 0;
		}
		rabatt = mengenrabatt + treuerabatt + bonusrabatt;

		if (rabatt > 20 && istPremiumKunde == true) {
			rabatt = 20;
		} 

		if (rabatt > 15 && istPremiumKunde == false) {
			rabatt = 15;
		}

		System.out.println("Rabatt: " + rabatt);
		System.out.println("rabattierter Bestellwert: " + (bestellwert * (100 - rabatt) / 100));
	}
}