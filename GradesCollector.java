import java.util.*;

class Aluno {
  private String nome;
  private double notaFinal;

  public Aluno (String nome , double notaFinal){
    this.nome = nome;
    this.notaFinal = notaFinal;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setNotaFinal(double notaFinal){
    this.notaFinal = notaFinal;
  }

  public double getNotaFinal(){
    return notaFinal;
  }

  public String getNome(){
    return nome;
  }

  @Override

  public String toString(){
    return "Aluno : " + nome + "| Nota Final : " + notaFinal;
  }

}


public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("A turma possui quantos alunos?");
      int quantidade = scanner.nextInt();
      scanner.nextLine();
      Aluno[] alunos = new Aluno[quantidade];
      double somaNotas = 0.0;


      for(int i = 0 ; i < alunos.length ; i++){

        System.out.print("Qual o nome do aluno? ");
            String nome = scanner.nextLine(); 

            System.out.print("Qual a nota Final do aluno? ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); 

            alunos[i] = new Aluno(nome, nota);
        
        somaNotas += alunos[i].getNotaFinal();

      }

      for(int j = 0 ; j < alunos.length ; j++){
        System.out.println(alunos[j]);
      }

      double mediaNotas = somaNotas / alunos.length;
      System.out.print("A média das notas da turma é " + mediaNotas );

      scanner.close();


    }
}
