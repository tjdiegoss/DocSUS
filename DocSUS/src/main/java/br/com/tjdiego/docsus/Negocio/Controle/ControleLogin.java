
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Dados.RepositorioAdmin;
import GUI.TelaPrincipal;
import Negocio.Excecoes.SenhaIncorretaException;
public class ControleLogin {
 private RepositorioAdmin radm = new RepositorioAdmin();
 public ControleLogin() {
 }
public void capturarSenha() throws SenhaIncorretaException {
 String strUsuario = GUI.Login.campoUsuario.getText();
 char[] charSenha = GUI.Login.campoSenha.getPassword();
 String strSenha = new String(charSenha);
 
 if (strUsuario.equals(radm.getAdmin().get(0).getUsuario()) &&
 strSenha.equals(radm.getAdmin().get(0).getSenha())) {
 new TelaPrincipal(); 
 } else {
 throw new SenhaIncorretaException("Usuário ou senha incorreto(s)!");
 }
 
 }
}
