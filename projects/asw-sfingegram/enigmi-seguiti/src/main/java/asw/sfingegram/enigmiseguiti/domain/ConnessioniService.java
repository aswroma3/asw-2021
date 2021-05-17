package asw.sfingegram.enigmiseguiti.domain;

import java.util.*; 

public interface ConnessioniService {

	public Collection<ConnessioneConAutore> getConnessioniConAutoriByUtente(String utente); 
	
	public Collection<ConnessioneConTipo> getConnessioniConTipiByUtente(String utente); 
	
}
