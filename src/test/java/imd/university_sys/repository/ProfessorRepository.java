package imd.university_sys.repository;

import imd.university_sys.model.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<ProfessorEntity, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário.
}
