import java.util.*;

class Livro{
  private String titulo;
  private String autor ; 
  private double preco ; 

  private static int totalLivrosRegistrados = 0;

  public Livro(String titulo , String autor , double preco){
    this.titulo = titulo ;
    this.autor = autor ; 
    this.preco = preco ;
    totalLivrosRegistrados ++ ;

  }

  public static int getTotalLivrosRegistrados(){
    return totalLivrosRegistrados;
  }

  @Override 

  public String toString(){
    return "Título : " + titulo + "|Autor : " + autor + "| Preço : " + preco ;
  }
}

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Quantos livros deseja registrar?");
      int quantidade = System.nextInt();
      scanner.nextLine();

      Livro [] livros = new Livro[quantidade];

      for(int i = 0 ; i < livros.length ; i ++){
        System.out.println("Qual o título do livro? ");
        String nome = scanner.nextLine();
       
         System.out.println("Qual o autor do livro? ");
         String autor = scanner.nextLine();
         
        System.out.println("Qual o preço do livro? ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        livros[i] = new Livro(String titulo , String autor , double preco);

        System.out.println(livros[i]);

      }

      System.out.print("Total de livros registrados: " + Livro.getTotalLivrosRegistrados());

      
      scanner.close();

    }
}
