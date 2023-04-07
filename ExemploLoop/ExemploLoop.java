/*
Crie um programa que utilize a estrutura de repetição "do-while" para exibir na tela os números de 1 a 100. Inicie uma variável inteira "n" com o valor 1 antes do laço de repetição. Dentro do laço, exiba o valor atual de "n" e incremente-o em 1 em cada iteração. O laço deve continuar executando enquanto "n" for menor ou igual a 100. Ao final da execução do laço, o programa deve ter exibido os números de 1 a 100.
*/
class ExemploLoop{
  public static void main(String[] args) {
    int n = 1;
    do {
      System.out.println(n+" ");
      n = n + 1;
      } while(n<=100);
  }
}