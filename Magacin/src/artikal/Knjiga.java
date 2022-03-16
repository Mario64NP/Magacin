package artikal;

import java.util.Objects;

public class Knjiga {
	String naziv;
	int sifra;
	String opis;
	int kolicina;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public void setOpis(String opis) {
		this.opis = opis;
	}
	
	public int getKolicina() {
		return kolicina;
	}
	
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		return Objects.equals(naziv, other.naziv) && sifra == other.sifra;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(naziv, sifra);
	}
	
	@Override
	public String toString() {
		return "Knjiga [naziv=" + naziv + ", sifra=" + sifra + "]";
	}
}