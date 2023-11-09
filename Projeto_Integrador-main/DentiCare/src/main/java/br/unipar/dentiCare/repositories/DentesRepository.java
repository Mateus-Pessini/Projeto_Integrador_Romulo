package br.unipar.dentiCare.repositories;

import br.unipar.dentiCare.models.Consulta.Dentes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DentesRepository extends JpaRepository<Dentes, Long> {
}
