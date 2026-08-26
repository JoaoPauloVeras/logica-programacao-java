import java.util.*;

class Aluno{
  private String nome;
  private double nota1;
  private double nota2;

 public Aluno(String nome, double nota1, double nota2){
  setNota1(nota1) ;
  setNota2(nota2) ;
  this.nome = nome;
}
public void setNota1(double nota){
  if (nota < 0 || nota > 10){
    System.out.println("Nota inválida");
  }else{
    this.nota1 = nota;
  }
}

public void setNota2(double nota){
  if (nota < 0 || nota > 10){
    System.out.println("Nota inválida");
  }else{
    this.nota2 = nota;
  }
}

public double calcularMedia(){
return (nota1 + nota2) / 2;

}
public double calcularMediaPonderada(double peso1, double peso2){
  return   (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);
}

public String toString(){
  return "Aluno : " + nome + "| Média Simples : " + calcularMedia() + "| Média Ponderada : " + calcularMediaPonderada(1 , 2);
}

}

public class Main {
    public static void main(String[] args) {
      Aluno a1 = new Aluno ("jp" , 9 , 6 );
      System.out.println(a1);
      


    }
}
