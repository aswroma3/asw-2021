package asw.sfingegram.enigmi.rest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEnigmaRequest {

	private String autore; 
	private String tipo; 
	private String titolo; 
	private String[] testo; 
	private String[] soluzione; 

}

