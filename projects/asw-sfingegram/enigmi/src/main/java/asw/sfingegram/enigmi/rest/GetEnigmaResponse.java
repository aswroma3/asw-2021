package asw.sfingegram.enigmi.rest;

import asw.sfingegram.enigmi.domain.Enigma; 

import lombok.*; 

/* Enigma, in formato breve (senza soluzione). */ 
@Data @NoArgsConstructor
public class GetEnigmaResponse {

	private Long id; 
	private String autore; 
	private String tipo; 
	private String titolo; 
	private String[] testo; 

	public GetEnigmaResponse(Enigma r) {
		this.id = r.getId(); 
		this.autore = r.getAutore(); 
		this.tipo = r.getTipo(); 
		this.titolo = r.getTitolo(); 
		this.testo = r.getTesto(); 
	}
	
}

