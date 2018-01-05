
public class AugenzahlenMultiplizieren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int eins = 0;
		int zwei = 0;
		int drei = 0;
//		int ergebnis[]=new int [19];
		
//		for(int x =0;x<1000;x++) {
//			eins = Zufall.getZufallInt(1, 6);
//			zwei = Zufall.getZufallInt(1, 6);
//			drei = Zufall.getZufallInt(1, 6);
//			ergebnis[(eins+zwei+drei)]=ergebnis[(eins+zwei+drei)]+1;
//		}
//		
//		for(int y =2; y<19;y++) {
//			System.out.println("Die Summe "+y+" wurde "+ergebnis[y]+"gewürfelt.");
//		}
		
		int ergebnis[]=new int [217];
		for(int x =0;x<1000;x++) {
			eins = Zufall.getZufallInt(1, 6);
			zwei = Zufall.getZufallInt(1, 6);
			drei = Zufall.getZufallInt(1, 6);
			ergebnis[(eins*zwei*drei)]=ergebnis[(eins*zwei*drei)]+1;
		}
		for(int y =1; y<217;y++) {
			if(ergebnis[y]>0) {
			System.out.println("Das Produkt "+y+" wurde "+ergebnis[y]+"mal gewürfelt.");
			}
		}
	}

}
