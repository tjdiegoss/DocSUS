
package br.com.tjdiego.docsus.Negocio;

/**
 *
 * @author Diego
 */
package Negocio;
public class Endereco {
 public String logradouro;
 public int numero;
 public String bairro;
 public String municipio;
 public String complemento;
 public int cep;
 public Endereco(String logradouro, int numero, String bairro,
 String municipio, String complemento, int cep) {
 this.logradouro = logradouro;
 this.numero = numero;
this.bairro = bairro;
 this.municipio = municipio;
 this.complemento = complemento;
 this.cep = cep;
 }
 public String getBairro() {
 return bairro;
 }
 public void setBairro(String bairro) {
 this.bairro = bairro;
 }
 public int getCep() {
 return cep;
 }
 public void setCep(int cep) throws NumberFormatException{
 this.cep = cep;
 }
 public String getComplemento() {
 return complemento;
 }
public void setComplemento(String complemento) {
 this.complemento = complemento;
 }
 public String getLogradouro() {
 return logradouro;
 }
 public void setLogradouro(String logradouro) {
 this.logradouro = logradouro;
 }
 public String getMunicipio() {
 return municipio;
 }
 public void setMunicipio(String municipio) {
 this.municipio = municipio;
 }
 public int getNumero() {
 return numero;
 }
 public void setNumero(int numero) throws NumberFormatException{
this.numero = numero;
 }
 @Override
 public String toString(){
 return "Logradouro: " + this.logradouro + " Número: " + 
 this.numero + '\n' + "Complemento: " + this.complemento
 + " Bairro: " + this.bairro + '\n'+
 "CEP: " + this.cep + " Município: " + this.municipio;
 }
}
