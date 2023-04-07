/*
Crie um programa que calcule o peso ideal de uma pessoa baseado em sua altura e sexo. O programa deve solicitar ao usuário que informe sua altura em metros e seu sexo, sendo "m" ou "M" para masculino e "f" ou "F" para feminino.

Para o sexo masculino, o cálculo do peso ideal deve ser realizado da seguinte forma: (72.7 * altura) - 58. Já para o sexo feminino, o cálculo deve ser: (62.1 * altura) - 44.7.

Após realizar o cálculo, o programa deve exibir o resultado na tela com uma mensagem informando o peso ideal calculado. Caso o usuário informe um sexo diferente de "m", "M", "f" ou "F", o programa deve exibir uma mensagem de erro informando que a informação está errada. Utilize a classe Scanner para realizar a leitura da altura e do sexo.
*/

import java.util.Scanner;
class AlturaeSexo {
  
  public static void main(String[] args) {
    float peso=0;

     Scanner teclado = new Scanner(System.in);

    System.out.println("Qual é a sua altura?");
    float altura = teclado.nextFloat();
    System.out.println("Qual é seu sexo?");
    char sexo = teclado.next().charAt(0);
      if(sexo=='m' || sexo=='M') {
        peso = (72.7f*altura)-58;
        }else if(sexo=='f' || sexo=='F') {
          peso=(62.1f*altura)-44.7f;
        }else {
          System.out.println("Informação errada");}
    System.out.printf("O seu peso ideal é %.1f\n",peso);
  }
}