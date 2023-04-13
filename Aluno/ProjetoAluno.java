public class ProjetoAluno {

  public static void main(String[] args) {
    Aluno a1 = new Aluno();
    Aluno a2 = new Aluno();

    a1.setNome("Gerson");
    a1.setCurso("TADS");
    a1.setRa(12345);
    a1.setSemestre(2);

    a2.setNome("Sandra");
    a2.setCurso("BSI");
    a2.setSemestre(3);
    a2.setRa(3456);

    System.out.println(a1.getNome() + " está cursando " + a1.getCurso() + ", no " + a1.getSemestre()
        + "º semestre e tem RA " + a1.getRa());
    System.out.println(a2.getNome() + " está cursando " + a2.getCurso() + ", no " + a2.getSemestre()
        + "º semestre e tem RA " + a2.getRa());

  }

}
