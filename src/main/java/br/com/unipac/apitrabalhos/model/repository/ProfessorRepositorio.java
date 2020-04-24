package br.com.unipac.apitrabalhos.model.repository;

import br.com.unipac.apitrabalhos.model.domain.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepositorio extends JpaRepository<Professor, Long> {
}
