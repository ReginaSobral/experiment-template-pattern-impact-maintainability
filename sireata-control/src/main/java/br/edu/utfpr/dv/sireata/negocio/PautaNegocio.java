

package br.edu.utfpr.dv.sireata.negocio;

import br.edu.utfpr.dv.sireata.dao.PautaDAO;
import br.edu.utfpr.dv.sireata.model.Pauta;
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
    
    public int salvar(Pauta pauta ) throws SQLException {
        return pautaDao.salvar(pauta);
    }

}