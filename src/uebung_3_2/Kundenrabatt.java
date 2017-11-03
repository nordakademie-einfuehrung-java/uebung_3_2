package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double bestellwert = 100000;
		double bisherigesKundenBestellvolumen = 50000;
		boolean istPremiumKunde = false;
		double mengenrabatt1 = 0.01;
		double mengenrabatt2 = 0.02;
		double mengenrabatt3 = 0.03;
		double mengenrabatt5 = 0.05;
		double treuerabatt7 = 0.075;
		double treuerabatt12 = 0.125;
		double bonusrabatt3 = 0.03;
		double mengenrabatt = 0;
		double treuerabatt = 0;
		double bonusrabatt = 0;
		double rabatt = 0;
		

		
		if (bestellwert >= 5000) {
			mengenrabatt = mengenrabatt5;
		
		}
		else {
			if (bestellwert >= 2000) {
				mengenrabatt = mengenrabatt3;
			}
			else {
				if (bestellwert >= 200) {
					mengenrabatt = mengenrabatt2;
					
				}
				else {
					if (bestellwert >= 100) {
						mengenrabatt = mengenrabatt1;
					}
					else {
						mengenrabatt = 0;
					}
				}
			}
		}
		if (istPremiumKunde) {
			mengenrabatt = mengenrabatt *2;
		}

		
		if (bisherigesKundenBestellvolumen >= 50000) {
			treuerabatt = treuerabatt12;
			
		}
		else {
			if (bisherigesKundenBestellvolumen >= 10000) {
				treuerabatt = treuerabatt7;
				
			}
		}
		

		
		if (bestellwert >= 2*bisherigesKundenBestellvolumen){
			bonusrabatt = bonusrabatt3;
		}

		
		rabatt = mengenrabatt + treuerabatt + bonusrabatt;
		
		if ( (rabatt >= 0.2 ) && (istPremiumKunde)) {
			rabatt = 0.2;
			
		}
		else {
			if ( rabatt >= 0.15 ){
				rabatt = 0.15;
			}
			
		}
		if (istPremiumKunde){
			System.out.println("Premiumkunde : ja");
		}
		else {
			System.out.println("Premiumkunde : nein");
		}
		
		System.out.println("Bestellwert ohne Rabatt: " + bestellwert + "€");
		System.out.println("Mengenrabatt: " + mengenrabatt * 100 + "%");
		System.out.println("Treuerabatt: " + treuerabatt * 100 + "%");
		System.out.println("Bonusrabatt: " + bonusrabatt * 100 + "%");
		System.out.println("Gesamtrabatt: " + rabatt*100 + "%");
		System.out.println("Bestellwert mit Rabatt: " + bestellwert * (1-rabatt) + "€");
		
		
		
	}

}
