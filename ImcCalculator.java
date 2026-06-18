import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Qual a sua altura? ");
       double altura = input.nextDouble();
       System.out.println("Qual o seu peso? ");
        double peso = input.nextDouble();
        double imc = peso / (altura * altura);
        
        if(imc < 18.5){
            
            System.out.print("Abaixo do Peso");
            
        }
        else if(imc < 25){
            
            System.out.print("Peso Normal");
            
        }
        else if(imc < 30){
            
            System.out.print("Sobrepeso");
            
        }
        else{
            
            System.out.print("Obesidade");
        }
       input.close();
    }
}
