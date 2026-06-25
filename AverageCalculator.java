import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double [] notas = new double[4];
        double soma = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i< notas.length ; i++){
            System.out.print("Digite a nota : ");
            notas[i] = input.nextDouble();
            
        }
        for (double grades : notas){
            soma += grades;
        }
        double media = soma / notas.length;
        System.out.printf("A média do aluno é %2.f%n", media);
        input.close();
    }
}
