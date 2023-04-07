/*
Crie um programa que utilize um laço de repetição para exibir na tela os números de 0 a 200 e identifique se cada número é par ou ímpar. O programa deve utilizar a estrutura de repetição "for" para percorrer os números. Declare uma variável inteira "n" e inicialize-a com o valor 0. Em cada iteração do laço de repetição, incremente o valor de "n" em 1. Utilize a operação módulo para verificar se o número é par ou ímpar. Se o resto da divisão do número por 2 for igual a 0, o número é par, caso contrário, é ímpar. Utilize uma estrutura de decisão "if-else" para exibir na tela uma mensagem indicando se o número é par ou ímpar. Ao final da execução do laço, o programa deve ter exibido os números de 0 a 200, identificando cada número como par ou ímpar.
*/
class R04 {
  public static void main(String[] args) {
    int n;
      for( n=0; n<=200 ; n++ )
        {
          float resto = n%2;
            if (resto==0) {
              System.out.println(n+" é par");
            } else {
              System.out.println(n+" é impar");
            }
        }
  }
}