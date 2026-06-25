import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String [] nomes = new String [3];
        for (int i = 0 ; i< nomes.length ; i ++ ){
            System.out.print("Digite um nome: ")
           nomes[i] = input.next();
            
        }
        
        for(String names : nomes){
            System.out.printf("O nome do cliente é %s%n", names);
        }
        input.close();
    }
}
