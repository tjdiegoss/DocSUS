
package br.com.tjdiego.docsus.Dados;

import br.com.tjdiego.docsus.Negocio.Medicamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */


public class RepositorioMedicamentos {
 //Cria uma lista de objetos do tipo Medicamento
 private List<Medicamento> listaMedicamentos = new ArrayList<Medicamento>();
 //Método construtor
 public RepositorioMedicamentos() {
 }
 //Método que retorna a lista de objetos do tipo Medicamento
 public List<Medicamento> getListaMedicamentos() {
 return listaMedicamentos;
 } 
}

