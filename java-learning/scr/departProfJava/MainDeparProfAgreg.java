package exe6;

// Associação de classes

public class MainDeparProfAgreg {
    public static void main(String[] args) {

        Departamento dep1 = new Departamento("Recursos humanos", "RH");
        Professor prof1 = new Professor("Lucas", dep1);
        System.out.println(prof1.toString());
        Departamento dep2 = new Departamento("Analise e Desenvolvimento de Sistemas", "ADS");
        prof1.setDepartamento(dep2);
        System.out.println(prof1.toString());
    }
}
