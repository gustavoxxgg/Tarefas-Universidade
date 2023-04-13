/*
Leia 8 elementos em um vetor inteiro A. Construa um outro vetor B, de mesma dimensão de A, com seus elementos sendo a multiplicação dos elementos de A por 3. Mostre os elementos de B.
*/
import java.util.Scanner;
import java.util.Arrays;
class A2 {
  public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    int[] vetorA = new int[8];
    int[] vetorB = new int[8];
    System.out.println("Digite os 8 números");
    for(int i=0; i<8 ; i++){
      vetorA[i]=teclado.nextInt();
    }
    System.out.println("");
    System.out.print("Vetor A: ");
    System.out.println(Arrays.toString(vetorA));
     for(int i=0; i<vetorA.length; i++) {
           vetorB[i] = vetorA[i] * 3;
    }
    System.out.println("");
    System.out.print("Vetor B: ");
    System.out.println(Arrays.toString(vetorB));

    teclado.close();
  }
}