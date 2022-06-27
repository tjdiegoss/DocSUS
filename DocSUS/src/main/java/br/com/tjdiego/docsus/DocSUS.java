

package br.com.tjdiego.docsus;

/**
 *
 * @author Diego
 */
package Negocio;
import Dados.RepositorioAdmin;
import Dados.RepositorioPosto;
import GUI.Login;
import GUI.TelaInicial;
public class DocSUS {
 public static void main(String args[]) {
 RepositorioAdmin repadmin = new RepositorioAdmin();
 RepositorioPosto rp = new RepositorioPosto();
 if (repadmin.getAdmin().isEmpty()) {
 new TelaInicial();
 } else {
 new Login();
 }
 }
}

