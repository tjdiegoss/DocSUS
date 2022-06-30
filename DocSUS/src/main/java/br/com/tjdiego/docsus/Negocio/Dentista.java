
package br.com.tjdiego.docsus.Negocio;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */

public class Dentista extends Pessoa{
 private int cro;
 public Dentista(String nome, String cpf, Endereco endereco,
 ArrayList<String> telefone, int cro) {
 super(nome, cpf, endereco, telefone);
 this.cro = cro;
 }
 public int getCro() {
 return cro;
 }
 public void setCro(int cro) {
 this.cro = cro;
 }
 @Override
 public String toString(){
 return super.toString() + '\n' +
 "CRO: " + this.cro;
 }
public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}
