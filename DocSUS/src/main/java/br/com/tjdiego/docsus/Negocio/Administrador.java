
package br.com.tjdiego.docsus.Negocio;

import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaCurtaException;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhaLongaException;
import br.com.tjdiego.docsus.Negocio.Excecoes.SenhasDiferentesException;

/**
 *
 * @author Diego
 */

public class Administrador {
 private String usuario = "Admin";
 private String senha;
 public Administrador(String Usuario, String senha) {
 this.usuario = Usuario;
 this.senha = senha;
 }
 public Administrador() {
 }
 
 public String getUsuario() {
 return usuario;
 }
public String getSenha() {
 return senha;
 }
 public void setSenha(String senha) throws SenhaCurtaException, 
SenhaLongaException, SenhasDiferentesException{
 if(senha.length() < 8 ){
 throw new SenhaCurtaException("Senha muito curta!");
 }else
 if (senha.length() > 64){
 throw new SenhaLongaException("Senha muito longa!");
 }else{
 this.senha = senha;}
 }
}
