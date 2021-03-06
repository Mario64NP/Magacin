package artikal;

import java.util.Objects;

public class Artikal {
	String naziv;
	int sifra;
	String opis;
	int kolicina;

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		if (naziv != null && !naziv.isEmpty())
			this.naziv = naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		if (sifra > 0 && sifra < 10000)
		this.sifra = sifra;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (opis != null && !opis.isEmpty())
			this.opis = opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	public void setKolicina(int kolicina) {
		if (kolicina >= 0 && kolicina <= 100)
			this.kolicina = kolicina;
	}

	@Override
	public int hashCode() {
		return Objects.hash(naziv, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		return Objects.equals(naziv, other.naziv) && sifra == other.sifra;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", kolicina=" + kolicina + "]";
	}
}