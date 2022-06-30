
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */

public class Medicamento {
 private String nomeMedicamento;
 private String descricao;
 private String codigo;
 public Medicamento(String nomeMedicamento, String descricao,
 String codigo) {
 this.nomeMedicamento = nomeMedicamento;
 this.descricao = descricao;
 this.codigo = codigo;
 }
 public String getCodigo() {
 return codigo;
 }
 public void setCodigo(String codigo) {
 this.codigo = codigo;
 }
 public String getDescricao() {
 return descricao;
 }
public void setDescricao(String descricao) {
 this.descricao = descricao;
 }
 public String getNomeMedicamento() {
 return nomeMedicamento;
 }
 public void setNomeMedicamento(String nomeMedicamento) {
 this.nomeMedicamento = nomeMedicamento;
 }
 @Override
 public String toString(){
 return "Nome: " + this.nomeMedicamento + '\n' +
 "Código: " + this.codigo + '\n' +
 "Descrição: " + '\n' +
 this.descricao;
 }
 public String toHTML(){
 return "<html>" + this.toString().replaceAll("\n", "<br>")
 + "</html>";
 }
}

