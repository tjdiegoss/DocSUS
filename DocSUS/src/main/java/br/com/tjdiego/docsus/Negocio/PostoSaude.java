
package br.com.tjdiego.docsus.Negocio;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */

public class PostoSaude {
 private String codigoPosto;
 private String nome;
 private Endereco endereco;
 public ArrayList<String> telefone = new ArrayList<String>();
 public PostoSaude(String codigoPosto, String nome,
 Endereco endereco, ArrayList<String> telefone) {
 this.codigoPosto = codigoPosto;
 this.nome = nome;
 this.endereco = endereco;
 this.telefone = telefone;
 }
 public String getCodigoPosto() {
 return codigoPosto;
 }
 public void setCodigoPosto(String codigoPosto) {
 this.codigoPosto = codigoPosto;
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
 return "Nome: " + this.nome + " Código: " + this.codigoPosto
 + '\n' + this.endereco + '\n' +
 "Telefone: " + this.telefone;
 }
public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}

