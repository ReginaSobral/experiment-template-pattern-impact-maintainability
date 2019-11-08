package br.edu.utfpr.dv.sireata.negocio.dominio;


import br.edu.utfpr.dv.sireata.model.Ata;
import br.edu.utfpr.dv.sireata.model.Pauta;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.var;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PautaDTO {

    
    private int id;

    @EqualsAndHashCode.Include
    private Ata ata;
    private int ordem;
    private String titulo;
    private String descricao;

      public static PautaDTO DTOFromEntity(Pauta pauta) {
        return PautaDTO.builder()
                .id(pauta.getIdPauta())
                .ata(pauta.getAta())
                .ordem(pauta.getOrdem())
                .titulo(pauta.getTitulo())
                .descricao(pauta.getDescricao())
                .build();
    }
    
    public static Set<PautaDTO> DTOsFromEntities(List<Pauta> pautas) {
        HashSet<PautaDTO> resultado = new HashSet<PautaDTO>();

        for (Pauta pautaAtual : pautas) 
            resultado.add(PautaDTO.DTOFromEntity(pautaAtual));

        return resultado;
    }
    
    
    public static Pauta EntityFromDTO (PautaDTO pauta) {
        return new Pauta(pauta.getId(), pauta.getAta(), pauta.getOrdem(), pauta.getTitulo(), pauta.getDescricao());
             
    }
    
}
