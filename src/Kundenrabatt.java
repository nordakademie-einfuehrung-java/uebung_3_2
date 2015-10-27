
public class Kundenrabatt {

	public static void main(String[] args) {
	
		 double bestellwert = 200;
		 double bisherigesKundenBestellvolumen = 20000;
		 boolean istPremiumKunde = true;
		 
		 double mengenRabatt;
		 double treueRabatt;
		 double bonusRabatt;
		 double gesamtRabatt;
		 
		//Mengenrabatt
		 if (bestellwert < 100) {
			mengenRabatt = 0;
		} else if (bestellwert >= 100 && bestellwert < 500) {
			mengenRabatt = 0.01;
		} else if (bestellwert >= 500 && bestellwert < 2000) {
			mengenRabatt = 0.02;
		} else if (bestellwert >= 2000 && bestellwert < 5000) {
			mengenRabatt = 0.03;
		} else {
			mengenRabatt = 0.05;
		}
		 
		if (istPremiumKunde == true) {
			mengenRabatt = mengenRabatt * 2;
		}
		
		//Volumenrabatt
		if (bisherigesKundenBestellvolumen < 10000) {
			treueRabatt = 0;
		} else if (bisherigesKundenBestellvolumen >= 10000 && bisherigesKundenBestellvolumen < 50000) {
			treueRabatt = 0.075;
		} else {
			treueRabatt = 0.125;
		}
		
		//Bonusrabatt
		if (bisherigesKundenBestellvolumen <= 2 * bestellwert) {
			bonusRabatt = 0.03;
		} else {
			bonusRabatt = 0;
		}
		
		//Gesamtrabatt
		gesamtRabatt = mengenRabatt + treueRabatt + bonusRabatt;
		
		if (istPremiumKunde == true) {
			
			if (gesamtRabatt >= 0.2) {
				gesamtRabatt = 0.2;
			}
			
		} else {
			
			if (gesamtRabatt >= 0.15) {
				gesamtRabatt = 0.15;
			}
			
		}
		
		//Ausgabe
		System.out.println("Bestellwert: " + bestellwert);
		System.out.println("Rabatt: " + 100 * gesamtRabatt + "%");
		System.out.println("Bestellwert nach Rabatt: " + (bestellwert - (bestellwert * gesamtRabatt)));
		 

	}

}
