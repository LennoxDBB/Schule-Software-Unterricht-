package binaererSuchBaum_Kontakte;

import binaererSuchBaum_Generics.InhaltsTyp;

public class Kontakt extends InhaltsTyp {

	private String vorname;
	private String nachname;
	private String email;
	private String telefon;
	
	public Kontakt(String vorname, String nachname, String email, String telefon) {
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setEmail(email);
		this.setTelefon(telefon);
	}
	
	@Override
	public void ausgebenDaten() {
		System.out.print(getVorname() + " " + getNachname() + "[" + getEmail() + "]" + "[" + getTelefon() + "]");
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
