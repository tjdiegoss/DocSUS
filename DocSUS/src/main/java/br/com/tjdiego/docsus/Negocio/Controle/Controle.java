
package br.com.tjdiego.docsus.Negocio.Controle;

/**
 *
 * @author Diego
 */
package Negocio.Fachada;
import Negocio.Excecoes.ObjetoExistenteException;
import Negocio.Excecoes.ObjetoInexistenteException;
public interface Controle<T> {
 public void cadastrar()throws ObjetoExistenteException;
 public String buscar(String busca) throws ObjetoInexistenteException;
 public void alterar(String busca) throws ObjetoInexistenteException;
 public void deletar(String busca) throws ObjetoInexistenteException;
 
}

