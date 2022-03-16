package specifikacijainterfejsa;

import artikal.Artikal;

public interface MagacinInterfejs {
	
	void dodajArtikal(Artikal a);
	void izbacArtkal(Artikal a);
	Artikal nadjiArtikal(int sifra);
}