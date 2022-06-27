
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Negocio.Administrador;
import Dados.RepositorioAdmin;
import Negocio.Excecoes.SenhaCurtaException;
import Negocio.Excecoes.SenhaLongaException;
import Negocio.Excecoes.SenhasDiferentesException;
import java.util.Arrays;
public class ControleAdmin {
 private RepositorioAdmin radm = new RepositorioAdmin();
 public ControleAdmin() {
 }
 public void cadastrar() throws SenhaLongaException, SenhaCurtaException, 
SenhasDiferentesException {
 char[] charSenha = GUI.TelaInicial.campoSenha.getPassword();
 char[] rptSenha = GUI.TelaInicial.campoRptSenha.getPassword();
 String senha = new String(charSenha);
 
 if (Arrays.equals(charSenha, rptSenha)) {
Administrador adm = new Administrador();
 adm.setSenha(senha);
 radm.getAdmin().add(adm);
 } else {
 throw new SenhasDiferentesException("As senhas não conferem!");
 }
 }
}

