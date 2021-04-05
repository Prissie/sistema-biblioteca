package mjv.sistemabiblioteca.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mjv.sistemabiblioteca.model.locacao.Locacao;

@Repository
public interface LocacaoRepository extends JpaRepository<Locacao, Integer> {
	
	List<Locacao> findByDataAgendamento(LocalDate dataAgendamento);
	List<Locacao> findByDataRetirada(LocalDate dataRetirada);
	List<Locacao> findByClienteId(Integer id);
	
	@Query(value ="select * from locacao l where l.status = ?1", nativeQuery = true)
    List<Locacao> findByStatusList(String status);

}
