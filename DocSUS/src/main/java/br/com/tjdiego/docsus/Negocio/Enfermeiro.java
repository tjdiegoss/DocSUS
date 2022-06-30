
package br.com.tjdiego.docsus.Negocio;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */

public class Enfermeiro extends Pessoa{
 private int coren;
 public Enfermeiro(String nome, String cpf, Endereco endereco,
 ArrayList<String> telefone, int coren){
 super(nome, cpf, endereco, telefone);
 this.coren = coren;
 }
 public int getCoren(){
 return coren;
 }
public void setCoren(int coren){
 this.coren = coren;
 }
 @Override
 public String toString(){
 return super.toString() + '\n' +
 "Coren: " + this.coren;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}
