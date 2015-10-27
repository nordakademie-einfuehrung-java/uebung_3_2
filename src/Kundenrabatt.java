public class Kundenrabatt {

	public static void main(String[] args) {

		double bestellwert = 100000;
		double bisherigesKundenBestellvolumen = 50000;

		boolean istPremiumKunde = true;
		double r1 = 0;
		double r2 = 0;
		double r3 = 0;
		

		if (istPremiumKunde == true) {
			if (bestellwert >= 100) {
				r1 = 2;
				if (bestellwert >= 500) {
					r1 = 4;
					if (bestellwert >= 2000) {
						r1 = 6;
						if (bestellwert >= 5000) {
							r1 = 10;
						}
					}
				}

			}
		}

		else {
			if (bestellwert>=100) {r1=1;
			
			}
			if (bestellwert >= 500) {
				r1 = 2;
				if (bestellwert >= 2000) {
					r1 = 3;
					if (bestellwert >= 5000) {
						r1 = 5;
					}
				}
			}
		}
		

		if (bisherigesKundenBestellvolumen >= 10000) {
			r2 = 7.5;
			if (bisherigesKundenBestellvolumen >= 50000) {
				r2 = 12.5;
			}
		}

		if (bestellwert >= 2 * bisherigesKundenBestellvolumen) {
			r3 = 3;

		}

		double Rabatt = r1 + r2 + r3;
		if (istPremiumKunde = true) {
			if (Rabatt > 20) {
				Rabatt = 20;
			}

			else {
				if (Rabatt > 15) {
					Rabatt = 15;

				}
			}

		}
		System.out.println("Rabattgesamt = " + Rabatt);
	}

}

// Strg + Shift + F 