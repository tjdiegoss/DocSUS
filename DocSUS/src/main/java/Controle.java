
import br.com.tjdiego.docsus.Negocio.Excecoes.ObjetoExistenteException;
import br.com.tjdiego.docsus.Negocio.Excecoes.ObjetoInexistenteException;

/**
 *
 * @author Diego
 * @param <T>
 */
public interface Controle<T> {
 public void cadastrar()throws ObjetoExistenteException;
 public String buscar(String busca) throws ObjetoInexistenteException;
 public void alterar(String busca) throws ObjetoInexistenteException;
 public void deletar(String busca) throws ObjetoInexistenteException;
 
}

