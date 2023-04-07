/*
Dado os 3 lados de um triângulo verificar se forma ou não um triângulo e imprimir sua classificação.

■	Para formar um triângulo
>	Os lados de um triângulo devem ser maiores que zero
>	Cada Lado deve ser menor que a soma dos outros dois

■	Imprimir a classificação do triângulo
>	Equilátero - 3 lados iguais
>	Escaleno — 3 lados diferentes
^ Isósceles — 2 lados iguais e 1 diferente
*/


import java.util.Scanner;

class Triangulos {

  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    // Na ideia inicial a unidade de medida serviria pra alguma coisa
    float lado1;
    float lado2;
    float lado3;
    String unidade;
    
    System.out.println("Digite sua unidade de medida");
    unidade = teclado.next();
    System.out.println("Agora digite suas medidas");
    lado1 = teclado.nextFloat();
    lado2 = teclado.nextFloat();
    lado3 = teclado.nextFloat();

    if(lado1 > lado2+lado3 | lado2 > lado1+lado3 | lado3 > lado1+lado2 | lado1 <= 0 | lado2 <= 0 | lado3 <= 0) {

      System.out.println("Desculpe isso não é um triangulo :(");
      System.out.println("Finalizando Aplicação");
      System.exit(0);
        
        }else {
      System.out.println("Triangulo Identificado"); }

    if(lado1==lado2 && lado1==lado3 && lado3==lado2) {

      System.out.print("Triângulo Equilátero");

      } else if(lado1==lado2 || lado1==lado3 || lado2==lado3) {

          System.out.print("Triângulo Isósceles");

      } else {

            System.out.print("Triângulo Escaleno");}

    System.out.print(" de medidas ");
    System.out.print(lado1+" ");
    System.out.print(lado2+" ");
    System.out.println(lado3);
    System.out.println("Unidade de medida usada: "+unidade);
    
  }
}