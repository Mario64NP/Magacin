package artikal;

import java.util.Date;
import java.util.Objects;

public class KucnaHemija extends Artikal{

	Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	
	public void setRokTrajanja(Date rokTrajanja) {
		if (rokTrajanja != null)
			this.rokTrajanja = rokTrajanja;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kolicina, naziv, opis, rokTrajanja, sifra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		return kolicina == other.kolicina && Objects.equals(naziv, other.naziv) && Objects.equals(opis, other.opis)
				&& Objects.equals(rokTrajanja, other.rokTrajanja) && sifra == other.sifra;
	}

	@Override
	public String toString() {
		return "KucnaHemija [naziv=" + naziv + ", sifra=" + sifra + "]";
	}
}