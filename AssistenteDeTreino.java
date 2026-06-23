import java.util.Scanner;

void main (String[] args) {

    Scanner teclado = new Scanner(System.in);

        String nome;
        int carga;
        System.out.print("digite seu nome: ");
        nome = teclado.next();
        System.out.print("qual carga vai levantar? ");
        carga = teclado.nextInt();

        if (carga >= 100){
            System.out.println(nome + " quero ver quantas repetição consegue fazer!");
            for(int contador = 1; contador <=5; contador++){
                System.out.println(contador);
            }
            System.out.println("nada mal");
        }
        else {
            System.out.println("so isso? é pra aquecer ne?");
        }
}
