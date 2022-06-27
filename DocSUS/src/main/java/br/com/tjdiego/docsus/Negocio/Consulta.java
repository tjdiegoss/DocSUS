
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */
package Negocio;
public class Consulta {
 private Medico medico;
 private Horario horario;
 private Paciente paciente;
 public Consulta(Medico medico, Horario horario, Paciente paciente) {
 this.medico = medico;
 this.horario = horario;
 this.paciente = paciente;
 }
 public Horario getHorario() {
 return horario;
 }
 public void setHorario(Horario horario) {
 this.horario = horario;
 }
 public Medico getMedico() {
 return medico;
 }
 public void setMedico(Medico medico) {
this.medico = medico;
 }
 public Paciente getPaciente() {
 return paciente;
 }
 public void setPaciente(Paciente paciente) {
 this.paciente = paciente;
 }
 @Override
 public String toString(){
 return "Médico: " + this.medico + '\n'+
 "Horário: " + this.horario + '\n'+
 "Paciente: " + this.paciente;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}

