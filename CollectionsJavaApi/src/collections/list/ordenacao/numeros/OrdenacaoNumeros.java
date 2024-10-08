package collections.list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
  //atributos
  private List<Integer> numerosList;

  //construtor
  public OrdenacaoNumeros() {
    this.numerosList = new ArrayList<>();
  }

  public void adicionarNumero(int numero) {
    this.numerosList.add(numero);
  }

  public List<Integer> ordenarAscendente() {
    List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
    if (!numerosList.isEmpty()) {
      Collections.sort(numerosAscendente);
      return numerosAscendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

  public List<Integer> ordenarDescendente() {
    List<Integer> numerosDescendente = new ArrayList<>(this.numerosList);
    if (!numerosList.isEmpty()) {
      numerosDescendente.sort(Collections.reverseOrder());
      return numerosDescendente;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }

}