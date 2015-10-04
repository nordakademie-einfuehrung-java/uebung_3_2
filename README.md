# Kapitel 3 Übung 2 ("Kundenrabatt")

- Schreiben Sie ein Programm, welches einen Kundenrabatt für eine Bestellung ermittelt. Als Ausgangswerte nehmen Sie:
  - Zwei ```double```-Variablen namens ```bestellwert``` und ```bisherigesKundenBestellvolumen```
  - sowie eine ```boolean``` Variable ```istPremiumKunde```.
- Der Rabatt soll in Prozent gemäß der Rabattstaffeln (siehe unten) ermittelt und ausgegeben werden.
- Außerdem soll der Bestellwert vor und nach Rabattierung ausgegeben werden.
- Der Einfachheit halber ignorieren wir mögliche Rundungsfehler bei ```double```-Variablen.

## Rabattstaffeln

- Ab einer Bestellhöhe von 100 gibt es 1% Mengenrabatt, ab 500 2%, ab 2000 3%, ab 5000 5%. Bei Premiumkunden gibt es hier doppel so viel.
- Liegt das bisherige Bestellvolumen des Kunden über 10000, so erhält dieser zusätzlich 7,5%, ab 50000 12,5% Treuerabatt.
- Ist die aktuelle Bestellung doppelt so hoch wie das gesamte bisherige Bestellvolumen, so gibt es weitere 3% Bonus-Rabatt.
- Entsteht ein Rabatt von mehr als 15%, so wird er wieder auf 15% gekürzt - außer bei Premiumkunden, dort liegt die Grenze bei 20%.
- Teilrabatte addieren sich und werden erst am Ende auf den Bestellwert angewendet.
