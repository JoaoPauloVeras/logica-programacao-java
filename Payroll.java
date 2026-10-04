import java.util.*;

 abstract class Funcionario{
  protected String nome;
  protected String cpf;

  public Funcionario(String nome , String cpf){
    this.nome = nome;
    this.cpf = cpf;

  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  public void setCpf(String cpf){
    this.cpf = cpf;

  }

  public String getCpf(){
    return this.cpf;
  }

  public abstract double calcularSalario();

  @Override

  public String toString(){
    return String.format("Nome : %s\n CPF : %s\n", this.nome , this.cpf);
  }
}

class FuncionarioHorista extends Funcionario{
    
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome , String cpf, int horasTrabalhadas , double valorHora){
      super( nome, cpf);
      this.horasTrabalhadas = horasTrabalhadas;
      this.valorHora = valorHora;

    }

    @Override

    public double calcularSalario(){
      return horasTrabalhadas * valorHora;

    }

    @Override
    public String toString(){
      return super.toString() + "Salário Final : " + calcularSalario() + "\n";
    }


  }

  class FuncionarioCLT extends Funcionario{
    private double salarioFixo;

    public FuncionarioCLT(String nome, String cpf,double salarioFixo){
      super (nome , cpf);
      this.salarioFixo = salarioFixo;

    }

    @Override 
    
    public double calcularSalario(){
      return this.salarioFixo;
    }

    @Override
    public String toString(){
      return super.toString() + "Salário Fixo : " + calcularSalario() + "\n";
    }

  }

public class Main {
    public static void main(String[] args) {
      List<Funcionario> folhaDePagamento = new ArrayList<>();
      Funcionario trab1 = new FuncionarioCLT("João", "12345",25000);
      Funcionario trab2 = new FuncionarioHorista("Paulo", "7890", 7 , 200);
      folhaDePagamento.add(trab1);
      folhaDePagamento.add(trab2);

      for(Funcionario trabalhadores : folhaDePagamento){
        System.out.print(trabalhadores);
      }

    }
}
