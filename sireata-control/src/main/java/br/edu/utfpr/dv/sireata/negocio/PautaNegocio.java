

package br.edu.utfpr.dv.sireata.negocio;

import br.edu.utfpr.dv.sireata.dao.PautaDAO;
import br.edu.utfpr.dv.sireata.model.Pauta;
import br.edu.utfpr.dv.sireata.negocio.dominio.PautaDTO;
import java.sql.SQLException;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PautaNegocio {

     private final PautaDAO pautaDao;

     
    public void listarPorAta(int idAta) throws SQLException {
        pautaDao.listarPorAta(idAta);              
    }
    
    public int salvar(PautaDTO pauta ) throws Exception {
        
        if (pautaDao.buscarPorId(pauta.getId())== null)
            throw new Exception();
        
       return pautaDao.salvar(PautaDTO.EntityFromDTO(pauta));
    }

}