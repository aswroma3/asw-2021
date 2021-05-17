package asw.sfingegram.connessioni.domain;

import javax.persistence.*; 

import lombok.*; 

@Entity 
@Data @NoArgsConstructor
public class ConnessioneConTipo {

	@Id 
	@GeneratedValue
	private Long id; 
	private String utente; 
	private String tipo; 
	
	public ConnessioneConTipo(String utente, String tipo) {
		this(); 
		this.utente = utente; 
		this.tipo = tipo; 
	}
	
}
