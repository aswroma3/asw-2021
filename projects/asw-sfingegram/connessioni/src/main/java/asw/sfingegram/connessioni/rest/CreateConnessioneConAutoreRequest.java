package asw.sfingegram.connessioni.rest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateConnessioneConAutoreRequest {

	private String utente; 
	private String autore; 

}

