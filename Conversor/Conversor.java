/*
Cria uma classe Time
– para definir uma hora qualquer representada por três atributos:
 ̈ Hora, minuto e segundo (private)
– Para alterar a hora atual:
 ̈ faça uma validação dos valores de horas (0 - 23), minutos e segundos (0 - 59)
• Implemente os seguintes métodos:
– visualizarHoraUniversal():
 ̈ retorna uma String com a hora no formato
universal de 1 a 24 horas
 ̈ Exemplo: 23:03:06 horas

– visualizarHoraAmPm():
 ̈ retorna uma String com a hora no formato
AM / PM de 1 a 12 horas
 ̈ Exemplo: 11:03:06 PM
  */
import java.util.Scanner;
class Conversor {

    public static void main(String[] args) {

      Scanner teclado = new Scanner(System.in);
      
      System.out.println("""
      <--------------------Instruções-------------------->
      <---------Digite abaixo o horario desejado--------->
      <------------Utilize o formato HH:MM:SS------------>
      <-------------------------------------------------->""");
      
      /*System.out.println("<---------Digite abaixo o horario desejado--------->");
      System.out.println("<------------Utilize o formato HH:MM:SS------------>");
      System.out.println("<-------------------------------------------------->");*/
        String horas = teclado.next();
      System.out.println("Agora escolha entre o formato Universal [1] | AmPm [2]");
        int escolha = teclado.nextInt();
          Time time = new Time(horas, escolha);
      if(escolha==1) {
        time.visualizarHoraUniversal();
      }else {
        time.visualizarHoraAmPm();
      }
    teclado.close();
    }
}


/*
       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
       Date date = parseFormat.parse("10:30 PM");
       System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));

                                  10:30 PM = 22:30
*/
