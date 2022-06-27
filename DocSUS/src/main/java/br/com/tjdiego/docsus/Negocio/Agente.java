
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */
package Negocio;
import Negocio.Excecoes.ObjetoExistenteException;
import java.util.ArrayList;
public class Agente extends Pessoa{
 private String codigo;
 private String funcao;
public Agente(String nome, String cpf, Endereco endereco,
 ArrayList<String> telefone, String codigo, String funcao) {
 super(nome, cpf, endereco, telefone);
 this.codigo = codigo;
 this.funcao = funcao;
 }
 
 @Override
 public void setCpf(String cpf) throws ObjetoExistenteException{
 if(cpf.equals(super.getCpf())){
 throw new ObjetoExistenteException("Já existe no cadastro!");
 }else
 {
 super.cpf = cpf;}
 }
 
 public String getCodigo(){
 return codigo;
 }
 public void setCodigo(String codigo) throws ObjetoExistenteException{
 if(codigo.equals(getCodigo())){
 throw new ObjetoExistenteException("Já existe no cadastro!");
}else
 {
 this.codigo = codigo;
 }
 }
 public String getFuncao(){
 return funcao;
 }
 public void setFuncao(String funcao){
 this.codigo = funcao;
 }
 @Override
 public String toString(){
 return super.toString() + '\n'+
 "Código: " + this.codigo + " Função: " + this.funcao;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}

