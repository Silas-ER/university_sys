package imd.university_sys.repository;

import imd.university_sys.model.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoEntity, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário.
}
