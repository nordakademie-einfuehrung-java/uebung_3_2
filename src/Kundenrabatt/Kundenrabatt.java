package Kundenrabatt;

public class Kundenrabatt {

	public static void main(String[] args) {
		
		double Bestellwert = 5544;
		double bisherigesKundenBestellvolumen = 10000;
		double Mengenrabatt = 0;
		double Treuerabatt = 0 ;
		double Bonusrabatt = 0 ;
		
		boolean istPremiumkunde = true;
		
		// 1. Mengenrabatt
		if (Bestellwert>=5000) {
					Mengenrabatt = 0.05;}
		
			else if (Bestellwert>=2000) {
					Mengenrabatt = 0.03;}
		
			else if (Bestellwert>=500) {
					Mengenrabatt = 0.02;}
			
			
			else if (Bestellwert>=100) {
					Mengenrabatt = 0.01 ;}
		
		if (istPremiumkunde = true) {
					Mengenrabatt = Mengenrabatt*2;}
		     
			else if (istPremiumkunde = false) {
			      	Mengenrabatt = Mengenrabatt*1;}
		
		// 2. Treuerabatt
		if (bisherigesKundenBestellvolumen>= 50000) {
					Treuerabatt = 0.125; }
		
		    else if (bisherigesKundenBestellvolumen>= 10000) {
			       	Treuerabatt = 0.075; }
		
		// 3. Bonusrabatt
		if (Bestellwert>= bisherigesKundenBestellvolumen*2) {
					Bonusrabatt = 0.03;}
			
			else if (Bestellwert<= bisherigesKundenBestellvolumen*2) {
					Bonusrabatt = 0;}
		
		// 4. Gesamtrabatt
		double Gesamtrabatt = Mengenrabatt + Treuerabatt + Bonusrabatt;
		
		if (Gesamtrabatt >= 0.15) {
					Gesamtrabatt = 0.15;}
		
			else if (Gesamtrabatt <= 0.15) {
					Gesamtrabatt = Gesamtrabatt;}
		
		if (istPremiumkunde = true && Gesamtrabatt >= 0.20){
					Gesamtrabatt = 0.20;}
			
			else if (istPremiumkunde = true && Gesamtrabatt <= 0.20) {
				Gesamtrabatt = Gesamtrabatt;}
		
		// 5. Teilrabattanwendungen
		 
		double Preis = (1-Gesamtrabatt) * Bestellwert;
		
		// letzter Schritt --> was wird ausgegeben
		
		System.out.println("Gesamtrabatt = " + Gesamtrabatt * 100 + "%");
		System.out.println("Bestellwert ohne Rabatt = " + Bestellwert + "€");
		System.out.println( "Bestellwert mit Rabatt = " + Preis + "€" );
			
		
		}
			}
	