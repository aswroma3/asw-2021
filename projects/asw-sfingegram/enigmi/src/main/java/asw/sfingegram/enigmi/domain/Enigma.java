package asw.sfingegram.enigmi.domain;

import javax.persistence.*; 

import lombok.*; 

/* Enigma, in formato completo. */ 
@Entity 
@Data @NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Enigma implements Comparable<Enigma> {

	@Id 
	@GeneratedValue
	@EqualsAndHashCode.Include
	private Long id; 
	private String autore; 
	private String tipo; 
	private String titolo; 
	private String[] testo; 
	private String[] soluzione; 
	
	public Enigma(String autore, String tipo, String titolo, String[] testo, String[] soluzione) {
		this(); 
		this.autore = autore; 
		this.tipo = tipo; 
		this.titolo = titolo; 
		this.testo = testo; 
		this.soluzione = soluzione; 
	}

	@Override
	public int compareTo(Enigma other) {
		return this.id.compareTo(other.id); 
	}
	
}
