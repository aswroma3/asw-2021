package asw.sfingegram.connessioni.rest;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateConnessioneConTipoRequest {

	private String utente; 
	private String tipo; 

}

