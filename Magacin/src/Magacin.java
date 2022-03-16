import java.util.LinkedList;

import artikal.Artikal;
import specifikacijainterfejsa.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{
	
	LinkedList<Artikal> listaArtikala = new LinkedList<>();

	@Override
	public void dodajArtikal(Artikal a) {
		if (a != null)
			listaArtikala.add(a);
	}

	@Override
	public void izbacArtkal(Artikal a) {
		listaArtikala.remove(a);
	}

	@Override
	public Artikal nadjiArtikal(int sifra) {
		for (Artikal a : listaArtikala)
			if (a.getSifra() == sifra)
				return a;
		return null;
	}
}