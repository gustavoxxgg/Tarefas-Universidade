/*
Crie um programa que solicite ao usuário que digite um número inteiro e informe se ele é par ou ímpar. Para realizar essa verificação, o programa deve calcular o resto da divisão do número por 2. Caso o resto seja igual a 0, o número é par e o programa deve exibir a mensagem "Par". Caso contrário, o número é ímpar e o programa deve exibir a mensagem "Ímpar". Utilize a classe Scanner para realizar a leitura do número digitado pelo usuário.
*/
import java.util.Scanner;

class PareImpar {
  public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    System.out.println("Digite um número inteiro");
    int n=teclado.nextInt();
    int resto=n%2; // % é reconhecido como módulo
    if (resto==0) {
      System.out.println("Par");
      }else{
      System.out.println("Ímpar");
      }
    teclado.close();
  }
}