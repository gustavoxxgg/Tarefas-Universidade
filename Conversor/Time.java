import java.time.LocalTime;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.DateTimeParseException;


public class Time {

  
  private String horas;
  private int escolha;

public Time(String horas, int escolha) {
  this.horas = horas;
  this.escolha = escolha;
  validarHoras();
}

public int getEscolha(){
  return this.escolha;
}

public String getHoras(){
  return this.horas;
}
  private void validarHoras(){ 
    try{
    LocalTime.parse(this.getHoras());
        System.out.println("Horário Valido: " + this.getHoras());
    }catch (DateTimeParseException | NullPointerException e) {
        System.err.println("Horário Invalido: " + this.getHoras());
      System.exit(0);
    }
    
  }

  public void visualizarHoraUniversal(){
    System.out.println("Sua hora é: "+ getHoras());
  }


  public void visualizarHoraAmPm(){
    try{
      SimpleDateFormat universal = new
      SimpleDateFormat("HH:mm:ss");
      SimpleDateFormat dozehoras = new
      SimpleDateFormat("hh:mm:ss a");
      Date data =
      universal.parse(this.getHoras());
      System.out.println(dozehoras.format(data));
    } catch (java.text.ParseException e){
      e.printStackTrace();
    }
  }
}