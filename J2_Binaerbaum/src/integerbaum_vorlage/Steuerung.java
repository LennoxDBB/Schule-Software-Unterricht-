
package integerbaum_vorlage;

public class Steuerung {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		Knoten<Integer> knoten1 = new Knoten<Integer> (1);
		Knoten<Integer> knoten2 = new Knoten<Integer> (2);
		Knoten<Integer> knoten3 = new Knoten<Integer> (3);
		Knoten<Integer> knoten4 = new Knoten<Integer> (4);
		Knoten<Integer> knoten5 = new Knoten<Integer> (5);
		Knoten<Integer> knoten6 = new Knoten<Integer> (6);
		Knoten<Integer> knoten7 = new Knoten<Integer> (7);
		
		Binaerbaum<Integer> myBinaerbaum = new Binaerbaum<Integer>();
				
		myBinaerbaum.erstelleBaum(new Knoten[] {knoten4, knoten3, knoten1, knoten2, knoten6, knoten7, knoten5});
		
		myBinaerbaum.ausgebenDatenInorder();
		System.out.println();
		myBinaerbaum.ausgebenDatenPreorder();
		System.out.println();
		myBinaerbaum.ausgebenDatenPostorder();
		System.out.println();
		
		System.out.println("Anzahl Knoten: " + myBinaerbaum.anzahlKnoten());
		System.out.println("Anzahl Blätter: " + myBinaerbaum.anzahlBlaetter());
		System.out.println("Tiefe: " + myBinaerbaum.tiefe());
		
		
		myBinaerbaum.ausgebenDatenRKL();
	}
}


