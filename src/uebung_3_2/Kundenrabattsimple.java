package uebung_3_2;

public class Kundenrabattsimple {

	public static void main(String[] args) {
		
		double bestellmenge = 30000;
		double rabatt = 0;
		double bisherigeBestellmenge = 15000;
		boolean istPremiumKunde = true;
		
		
		if (bestellmenge >= 100)
		{ 
				rabatt = 0.01;
		}
		
		if (bestellmenge >= 500)
		{
		rabatt = 0.02;
		}
		
		if (bestellmenge >= 2000)
		{ 
			rabatt = 0.03;
		}
		
		if(bestellmenge >= 5000)
		{
			rabatt = 0.05;
		}
		
		
		if( istPremiumKunde == true)
		{
			rabatt = rabatt*2;
		}
		
		if (50000>bisherigeBestellmenge && bisherigeBestellmenge >=10000)
		{
			rabatt = rabatt+0.075;
		}
		
		if (bisherigeBestellmenge >=50000)
		{
			rabatt = rabatt+0.125;
		}
		
		if( bestellmenge >= 2* bisherigeBestellmenge )
		{
			rabatt = rabatt+0.03;
		}
		
		if (istPremiumKunde == true && rabatt > 0.2)
		{
			rabatt = 0.20;
		}
		
		if (istPremiumKunde == false && rabatt > 0.15)
		{
			rabatt = 0.15;
		}
		
		
		System.out.println("Rabatt: " +rabatt*100+ "%");
		System.out.println("Bestellwert vor Rabattabzug: " +bestellmenge);
		System.out.println("Bestellwert nach Rabattabzug: " +(1-rabatt)*bestellmenge);
			
	

	}
}
