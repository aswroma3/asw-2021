package asw.sfingegram.connessioni.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.*; 

public interface ConnessioniConTipiRepository extends CrudRepository<ConnessioneConTipo, Long> {

	public Collection<ConnessioneConTipo> findAll();

	public Collection<ConnessioneConTipo> findByUtente(String utente);

}

