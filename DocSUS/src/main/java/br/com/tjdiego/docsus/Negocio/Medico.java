
package br.com.tjdiego.docsus.Negocio;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */

public class Medico extends Pessoa{
 private String especializacao;
 private Horario horario;
 private int crm;
 public Medico (String nome, String cpf, Endereco endereco,
 ArrayList<String> telefone, String especializacao,
 Horario horario, int crm){
 super(nome, cpf, endereco, telefone);
 this.crm = crm;
 this.especializacao = especializacao;
 this.horario = horario;
 }
 public int getCrm() {
 return crm;
 }
 public void setCrm(int crm) {
 this.crm = crm;
 }
 public String getEspecializacao() {
 return especializacao;
 }
public void setEspecializacao(String especializacao) {
 this.especializacao = especializacao;
 }
 public Horario getHorario() {
 return horario;
 }
 public void setHorario(Horario horario) {
 this.horario = horario;
 }
 
 @Override
public String toString(){
 return super.toString() + '\n'+
 "Especializaçao: " + this.especializacao + '\n' +
 "Horário" + this.horario + " CRM: " + this.crm;
}
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}

