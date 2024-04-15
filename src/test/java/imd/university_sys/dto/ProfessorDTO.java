package imd.university_sys.dto;

import java.util.Date;

public record ProfessorDTO(
        Long id,
        String nome,
        String cpf,
        int matricula,
        String genero,
        String departamento,
        Date dataNascimento,
        float salario,
        String disciplinaAssociada
) {}
