package uebung_3_2;

public class Kundenrabatt {

	public static void main(String[] args) {
		int Bestellh�he = 5000;
		int bisherigesBestellvolumen = 10000;
		boolean Premium = true ;

		int Mengenrabatt ;
		int Premiummengenrabatt ;
		int Treuerabatt ;
		int Bonus ;
		// Kann ich die Rabatte einzeln berechnen und sp�ter zusammenf�hren?

		
		if (Bestellh�he > 4999) { 
			Mengenrabatt = 5; }
		else if (Bestellh�he > 1999){
				Mengenrabatt = 3; } 
		else if (Bestellh�he > 499) {
				Mengenrabatt = 2; } 
		else  if (Bestellh�he > 99) {
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
			// Kann ich diesen else Ausdruck l�schen, weil sozusagen ja keine verrechnung passiert, wenn der Rabatt kleiner als 15 bzw. 20 ist?
			}
		}
		
		if (bisherigesBestellvolumen <= Bestellh�he*2) {
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
			
		
		System.out.println(Bestellh�he * (Rabatt/100 + 1));
	}

}
