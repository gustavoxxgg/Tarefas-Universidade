public class Aluno {
    private String nome, curso;
    private int ra, semestre;

  public void setNome(String nome) {
    this.nome= nome;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public void setRa(int ra){
    this.ra = ra;
  }

  public void setSemestre(int semestre) {
    if(semestre > 0 && semestre <= 8) {
      this.semestre = semestre;
    } else {
      System.out.println("Semestre Inválido");
    }
  }

  public String getNome() {
    return nome;
  }

  public String getCurso() {
    return curso;
  }

  public int getRa() {
    return ra;
  }

  public int getSemestre() {
    return semestre;
  }

}