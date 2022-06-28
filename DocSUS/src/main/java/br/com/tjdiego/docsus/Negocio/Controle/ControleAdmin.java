
package br.com.tjdiego.docsus.Negocio.Controle;

import br.com.tjdiego.docsus.Dados.RepositorioAdmin;
import br.com.tjdiego.docsus.Negocio.Administrador;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaCurtaException;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaLongaException;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhasDiferentesException;
import java.util.Arrays;

/**
 *
 * @author Diego
 */


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

