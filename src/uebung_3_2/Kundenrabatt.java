package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		int Bestellhöhe = 5000;
		int bisherigesBestellvolumen = 10000;
		boolean Premium = true ;

		int Mengenrabatt ;
		int Premiummengenrabatt ;
		int Treuerabatt ;
		int Bonus ;
		// Kann ich die Rabatte einzeln berechnen und später zusammenführen?

		
		if (Bestellhöhe > 4999) { 
			Mengenrabatt = 5; }
		else if (Bestellhöhe > 1999){
				Mengenrabatt = 3; } 
		else if (Bestellhöhe > 499) {
				Mengenrabatt = 2; } 
		else  if (Bestellhöhe > 99) {
				Mengenrabatt = 1; }
			else {
				Mengenrabatt = 0; }
			
		if (Premium == true) {
			Premiummengenrabatt = 2; }
			else { 
			Premiummengenrabatt = 1; }
		
		if (bisherigesBestellvolumen >= 50000) {
			Treuerabatt = 12,5; }
		// Warum Fehler?
		else {
			if (bisherigesBestellvolumen >= 10000) {
			Treuerabatt = 7,5 ;}
			else {
				Treuerabatt = Treuerabatt *1
			// Kann ich diesen else Ausdruck löschen, weil sozusagen ja keine verrechnung passiert, wenn der Rabatt kleiner als 15 bzw. 20 ist?
			}
		}
		
		if (bisherigesBestellvolumen <= Bestellhöhe*2) {
			Bonus = 3; }
			else {
				Bonus = 0 ; }
		
		int Rabatt = Mengenrabatt*Premiummengenrabatt + Treuerabatt + Bonus ;
		
		if (Rabatt >= 15 && Premium == false) {
			Rabatt = 15 ; }
		else if (Rabatt >= 20 && Premium == true) {
				Rabatt = 20 ;}
			else {
				Rabatt = Rabatt * 1 ; 
			}
			
		
		System.out.println(Bestellhöhe * (Rabatt/100 + 1));
	}

}
