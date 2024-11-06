
public class Gehaltsrechner {

	public static void main(String[] args) {
		
		String line = "------------------------------------------------------------";
		
		float brutto = 2375.65F;
		
		float lohnStrP = 0.2F;
		float solBtrP = 0.04F;
		float rentenVerP = 0.0975F;
		float krankenVerP = 0.073F;
		float arbeitsVerP = 0.0325F;
		float pflegeVerP = 0.008F;
		
		float lohnStr = brutto * lohnStrP;
		float solBtr = lohnStr * solBtrP;
		float rentenVer = brutto * rentenVerP;
		float krankenVer = brutto * krankenVerP;
		float arbeitsVer = brutto * arbeitsVerP;
		float pflegeVer = brutto * pflegeVerP;
		
		float sum = Math.round((lohnStr + solBtr + rentenVer + krankenVer + arbeitsVer + pflegeVer) * 100F) / 100F;
		float netto = Math.round((brutto - sum) * 100F) / 100F;
		
		System.out.println("**********************************************");
		System.out.println("* Dieses Programm berechnet                  *");
		System.out.println("* Netto-Gehalt abhängig vom                  *");
		System.out.println("* eingegebenen Brutto-Gehalt                 *");
		System.out.println("*                                            *");
		System.out.println("* Lohnsteuer: " + lohnStrP * 100 + "% vom Gehalt               *");
		System.out.println("* Solidaritätsbeitrag: " + solBtrP * 100 + "% von der Lst.     *");
		System.out.println("* Rentenversicherung: " + rentenVerP * 100 + "% vom Gehalt       *");
		System.out.println("* Krankenversicherung: " + krankenVerP * 100 + "% vom Gehalt *");
		System.out.println("* Arbeitslosenversicherung: " + arbeitsVerP * 100 + "% vom Gehalt *");
		System.out.println("* Pflegeversicherung: " + pflegeVerP * 100 + "% vom Gehalt        *");
		System.out.println("**********************************************");
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		
		System.out.println(line);
		System.out.println("| Brutto Gehalt					| " + brutto + "€");
		System.out.println(line);
		System.out.println("| Abzüge					| ");
		System.out.println("| Lohnsteuer					| " + Math.round(lohnStr * 100F) / 100F + "€");
		System.out.println("| Solidaritätssteuer				| " + Math.round(solBtr * 100F) / 100F + "€");
		System.out.println("| Rentenversicherungen				| " + Math.round(rentenVer * 100F) / 100F + "€");
		System.out.println("| Krankenversicherung				| " + Math.round(krankenVer * 100F) / 100F + "€");
		System.out.println("| Arbeitslosenversicherung			| " + Math.round(arbeitsVer * 100F) / 100F + "€");
		System.out.println("| Pflegeversicherung				| " + Math.round(pflegeVer * 100F) / 100F + "€");
		System.out.println(line);
		System.out.println("| Summe Abzüge					| " + Math.round(sum * 100F) / 100F + "€");
		System.out.println(line);
		System.out.println("| Gehalt Netto					| " + Math.round(netto * 100F) / 100F + "€");
		System.out.println(line);
		
		
	}
	
}
