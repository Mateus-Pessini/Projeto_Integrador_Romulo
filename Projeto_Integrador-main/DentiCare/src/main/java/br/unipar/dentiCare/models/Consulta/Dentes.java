package br.unipar.dentiCare.models.Consulta;

import br.unipar.dentiCare.models.Pessoa.Cliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@DynamicUpdate
@Table(name = "Dentes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dentes {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private int nrDente;

    private String dsDente;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "dentesId")
    private List<Tratamento> tratamentoId;


    @ManyToOne(cascade =  CascadeType.ALL)
    @JoinColumn(name = "denteId")
    @JsonIgnore
    private Cliente cliente;
}
