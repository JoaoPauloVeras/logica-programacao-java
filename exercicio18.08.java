import java.util.*;

class Carro {
    public String modelo;
    public String nome;
    public int ano;

  public void fichaTecnica(){
    System.out.println("Modelo : " + modelo);
    System.out.println("Nome : "+ nome);
    System.out.println("Ano : "+ ano);
  }

  public void atualizarAno(int novoAno) {
    ano = novoAno;
   System.out.println("Ano do carro alterado para : " + ano);
   System.out.println ("--------");
    
  }

}

public class Main {
    public static void main(String[] args) {
     Carro carro1 = new Carro();
     carro1.modelo = "Toyota";
     carro1.nome = "Etios";
     carro1.ano = 2013;

     carro1.fichaTecnica();

     carro1.atualizarAno (2017);

     carro1.fichaTecnica(); 

    }
}
