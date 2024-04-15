package imd.university_sys.dto;

import java.util.Date;

public record AlunoDTO(
        Long id,
        String nome,
        String cpf,
        int matricula,
        String genero,
        String curso,
        Date dataNascimento
) {}
