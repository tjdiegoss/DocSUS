

package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */

import br.com.tjdiego.docsus.Dados.RepositorioAdmin;
import br.com.tjdiego.docsus.Dados.RepositorioPosto;
import Telas.Login;
import Telas.TelaInicial;
public class DocSUS {
 public static void main(String args[]) {
 RepositorioAdmin repadmin = new RepositorioAdmin();
 RepositorioPosto rp = new RepositorioPosto();
 if (repadmin.getAdmin().isEmpty()){
 new TelaInicial();
 } else {
 new Login();
 }
 }
}

