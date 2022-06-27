
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */
package Negocio;
import java.util.Date;
public class Horario {
 public String data;
 public String hora;
public Horario(String data, String hora){
 this.data = data;
 this.hora = hora;
 }
 public String getData() {
 return data;
 }
 public void setData(String data) {
 this.data = data;
 }
 public String getHora() {
 return hora;
 }
 public void setHora(String hora) {
 this.hora = hora;
 }
 @Override
 public String toString(){
 return "Data " + this.data + "Hora" + this.hora;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}
