package br.com.org.getlinea.school.repository;

import br.com.org.getlinea.school.model.Professores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessoresRepository extends JpaRepository<Professores,Long> {
}
