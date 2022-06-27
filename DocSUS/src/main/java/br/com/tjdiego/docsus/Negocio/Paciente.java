
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */
package Negocio;
import java.util.ArrayList;
public class Paciente extends Pessoa{
 private String sexo;
 private String dataNasc;
 public Paciente (String nome, String cpf, Endereco endereco,
 ArrayList<String> telefone, String sexo, String dataNasc){
 super(nome, cpf, endereco, telefone);
 this.dataNasc = dataNasc;
 this.sexo = sexo;
 }
 public String getDataNasc() {
 return dataNasc;
 }
 public void setDataNasc(String dataNasc) {
 this.dataNasc = dataNasc;
 }
 public String getSexo() {
 return sexo;
 }
public void setSexo(String sexo) {
 this.sexo = sexo;
 }
 public String toString(){
 return super.toString() + '\n'+
 "Sexo: " + this.sexo + " Data de Nascimento: "
 + this.dataNasc;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}

