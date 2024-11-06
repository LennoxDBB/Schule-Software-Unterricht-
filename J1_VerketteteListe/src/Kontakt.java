public class Kontakt {
	
	public String name;
	public String vorname;
	public String email;
	public String telefon;
	
	public Kontakt(String name, String vorname, String email, String telefon) {
		this.name = name;
		this.vorname = vorname;
		this.email = email;
		this.telefon = telefon;
	}
	
	public void ausgebenKontakt() {
		System.out.println("{Name: " + name + ", Vorname: " + vorname + ", Email: " + email + ", Telefon: " + telefon + "}");
	}
}
