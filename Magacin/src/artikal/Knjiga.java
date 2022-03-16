package artikal;

import java.util.Objects;

public class Knjiga extends Artikal{
	
	@Override
	public String toString() {
		return "Knjiga [naziv=" + naziv + ", sifra=" + sifra + "]";
	}
}