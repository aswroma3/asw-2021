package asw.sfingegram.enigmiseguiti.domain;

import java.util.*; 

public interface EnigmiService {

	public Collection<Enigma> getEnigmiByAutori(Collection<String> autori); 

	public Collection<Enigma> getEnigmiByTipi(Collection<String> tipi); 

}
