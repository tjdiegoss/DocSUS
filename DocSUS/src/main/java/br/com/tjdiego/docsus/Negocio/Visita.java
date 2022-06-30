
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */
public class Visita {
 private Paciente paciente;
 private Agente agente;
 private Horario horario;
 public Visita(Paciente paciente, Agente agente, Horario horario) {
 this.paciente = paciente;
 this.agente = agente;
this.horario = horario;
 }
 public Agente getAgente() {
 return agente;
 }
 public void setAgente(Agente agente) {
 this.agente = agente;
 }
 public Horario getHorario() {
 return horario;
 }
 public void setHorario(Horario horario) {
 this.horario = horario;
 }
 public Paciente getPaciente() {
 return paciente;
 }
 public void setPaciente(Paciente paciente) {
 this.paciente = paciente;
 }
@Override
 public String toString(){
 return "Paciente: " + this.paciente + '\n' +
 "Agente: " + this.agente + '\n' +
 "Horário: " + this.horario;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}
