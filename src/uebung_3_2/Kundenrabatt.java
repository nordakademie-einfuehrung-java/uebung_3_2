package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {

		double bestellwert = 101;
		double bisherigesKundenBestellvolumen = 0;
		boolean istPremiumKunde = false;
		double mengenrabatt = 0;
		double treuerabatt;

		// MENGENRABATT

		if (bestellwert > 100) {
			mengenrabatt = 0.01;
			if (bestellwert > 500) {
				mengenrabatt = 0.02;
				if (bestellwert > 2000) {
					mengenrabatt = 0.03;
					if (bestellwert > 5000) {
						mengenrabatt = 0.05;
					}
				}
			}
		}

		// Premiumrabatt

		if (istPremiumKunde == true) {
			mengenrabatt = mengenrabatt * 2;
		}

		// Treuerabatt

		if (bisherigesKundenBestellvolumen >= 10000) {
			treuerabatt = 0.075;
			if (bisherigesKundenBestellvolumen >= 50000) {
				treuerabatt = 0.125;
			}
		}

		double rabattwert = bestellwert * mengenrabatt;
		// Bonusrabatt

		if (bestellwert >= 2 * bisherigesKundenBestellvolumen) {
			rabattwert = rabattwert + 0.03;
		}

		// Grenze

		if (rabattwert >= 0.15) {
			rabattwert = 0.15;
		}

		// Grenze Premiumkunde

		if (istPremiumKunde = true && rabattwert >= 0.2) {
			rabattwert = 0.2;
		}

		double rabattiert = bestellwert - (bestellwert * mengenrabatt);

		// AUSGABE
		System.out.println(mengenrabatt);
		System.out.println(rabattwert);
		System.out.println(bestellwert);
		System.out.println(rabattiert);

	}

}
