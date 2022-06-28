
package br.com.tjdiego.docsus.Negocio;

import br.com.tjdiego.docsus.Negocio.Excecoes.ObjetoExistenteException;
import java.util.ArrayList;

/**
 *
 * @author Diego
 */


public class Pessoa {
 public String nome;
 public String cpf;
 public Endereco endereco;
public ArrayList<String> telefone = new ArrayList<String>();
 public Pessoa(String nome, String cpf, Endereco endereco,
 ArrayList<String> telefone) {
 this.nome = nome;
 this.cpf = cpf;
 this.endereco = endereco;
 this.telefone = telefone;
 }
 public String getCpf() {
 return cpf;
 }
 public void setCpf(String cpf)throws ObjetoExistenteException{
 
 this.cpf = cpf;
 }
 public Endereco getEndereco() {
 return endereco;
 }
 public void setEndereco(Endereco endereco) {
 this.endereco = endereco;
 }
 public String getNome() {
 return nome;
 }
 public void setNome(String nome) {
 this.nome = nome;
 }
 public ArrayList<String> getTelefone() {
 return telefone;
 }
 public void setTelefone(ArrayList<String> telefone) {
 this.telefone = telefone;
 }
 @Override
 public String toString(){
 return "Nome: " + this.nome + '\n'+
 "CPF: " + this.cpf + '\n'+
 this.endereco.toString() + '\n'+
 "Telefone Fixo: " + this.telefone.get(0) + " Celular: "
 + this.telefone.get(1);
 }
 
}

