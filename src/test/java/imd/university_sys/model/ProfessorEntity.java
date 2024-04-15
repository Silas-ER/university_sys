package imd.university_sys.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "professores")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(nullable = false, unique = true)
    private int matricula;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Genero genero;

    @Column(nullable = false, length = 100)
    private String departamento;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @Column(nullable = false)
    private float salario;

    @Column(nullable = false, length = 100)
    private String disciplinaAssociada;

    public enum Genero {
        MASCULINO, FEMININO, OUTRO
    }
}
