package Kundenrabatt;

public class Kundenrabatt {

	public static void main(String[] args) {
		
		double bestellwert = 5544;
		double bestellvolumen = 10000;
		boolean istpremiumkunde = false;
		
		double mengenrabatt = 0;
		double treuerabatt = 0 ;
		double bonusabatt = 0 ;
		
				
		// 1. Mengenrabatt
		if (bestellwert>=5000) {
					mengenrabatt = 0.05;}
		
			else if (bestellwert>=2000) {
				mengenrabatt = 0.03;}
		
			else if (bestellwert>=500) {
				mengenrabatt = 0.02;}
			
			else if (bestellwert>=100) {
				mengenrabatt = 0.01 ;}
		
		if (istpremiumkunde == true) {
			mengenrabatt = mengenrabatt*2;}
		     
			else if (istpremiumkunde == false) {
				mengenrabatt = mengenrabatt;}
		
		// 2. Treuerabatt
		if (bestellvolumen>= 50000) {
			treuerabatt = 0.125; }
		
		    else if (bestellvolumen>= 10000) {
		    	treuerabatt = 0.075; }
		
		// 3. Bonusrabatt
		if (bestellwert>= bestellvolumen*2) {
			bonusabatt = 0.03;}
			
			else if (bestellwert<= bestellvolumen*2) {
				bonusabatt = 0;}
		
		// 4. Gesamtrabatt
		double gesamtrabatt = mengenrabatt + treuerabatt + bonusabatt;
		
		if (gesamtrabatt >= 0.15) {
					gesamtrabatt = 0.15;}
		
			else if (gesamtrabatt <= 0.15) {
					gesamtrabatt = gesamtrabatt;}
		
		if (istpremiumkunde == true && gesamtrabatt >= 0.20){
					gesamtrabatt = 0.20;}
			
			else if (istpremiumkunde == true && gesamtrabatt <= 0.20) {
				gesamtrabatt = gesamtrabatt;}
		
		// 5. Teilrabattanwendungen
		 
		double Preis = (1-gesamtrabatt) * bestellwert;
		
		// letzter Schritt --> was wird ausgegeben
		
		System.out.println("Gesamtrabatt = " + gesamtrabatt * 100 + "%");
		System.out.println("Bestellwert ohne Rabatt = " + bestellwert + "€");
		System.out.println( "Bestellwert mit Rabatt = " + Preis + "€" );
			
		
		}
			}
	