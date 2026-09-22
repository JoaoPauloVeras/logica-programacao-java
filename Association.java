import java.util.*;

class Endereco{
  private String rua;
  private int numero;
  private String cidade;


  public Endereco (String rua , int numero , String cidade){
    this.rua = rua;
    this.numero = numero;
    this.cidade = cidade;
  }

  public void setRua(String rua){
    this.rua = rua;
  }
   public String getRua(){
    return this.rua;
   }

  public void setNumero(int numero){
    this.numero = numero;

  }

  public int getNumero(){
    return this.numero;
  }

  public void setCidade(String cidade){
    this.cidade = cidade;
  }

  public String getCidade(){
    return this.cidade;
  }

  @Override
  public String toString(){
    return "Rua :" + rua + "|Número :" + numero + "| Cidade : "+ cidade ;
  }
}

class Usuario {
  private String nome;
  private String email;
  private Endereco endereco;

  public Usuario(String nome , String email , Endereco endereco){
    this.nome = nome;
    this.email = email;
    this.endereco = endereco;
  }

  public void setNome(String nome){
    this.nome = nome;

  }

  public String getNome(){
    return this.nome;
  }
  public void setEmail(String email){
    this.email = email;
  }
  public String getEmail(){
    return this.email;
  }

  public void setEndereco (Endereco endereco){
    this.endereco = endereco;
    
  }

  public Endereco getEndereco(){
    return this.endereco;
  }
  
  @Override

  public String toString(){
    return "Nome : " + nome + "| Email : " + email + "| Endereço - " + endereco;
  }
}

public class Main {
    public static void main(String[] args) {
      Endereco lugar = new Endereco(" 2" , 215 , "Fortaleza");
      Usuario user = new Usuario("João ", "jp@gmail.com ", lugar);

      System.out.print(user);
    }
}
