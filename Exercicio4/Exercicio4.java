/*
Crie um programa que leia dois números inteiros do usuário e imprima a diferença absoluta entre eles. Caso o primeiro número seja maior que o segundo, a diferença entre eles deve ser calculada como a subtração do primeiro pelo segundo. Caso contrário, a diferença deve ser a subtração do segundo pelo primeiro. O resultado deve ser exibido na tela. Utilize a classe Scanner para realizar a leitura dos números.
*/

import java.util.Scanner;
class Exercicio4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n1;
    int n2;
    int resultado;
    System.out.println("Digite os seus numeros");
    n1 = teclado.nextInt();
    n2 = teclado.nextInt();

    if (n1 > n2) {
      resultado = n1 - n2;

      } else {
        resultado = n2 - n1;
        
      }
    System.out.println("A diferença entre os números é "+resultado);
  }
}