package br.unipar.dentiCare.models.Pessoa;

import br.unipar.dentiCare.enums.TpPessoaEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@DynamicUpdate
@Table(name = "Dentista")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dentista extends Pessoa{

    private String CRO;

    private String especialidade;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte ftPerfil;

}
