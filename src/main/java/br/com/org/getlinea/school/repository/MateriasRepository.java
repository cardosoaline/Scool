package br.com.org.getlinea.school.repository;

import br.com.org.getlinea.school.model.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriasRepository extends JpaRepository<Materias,Long> {
}
