package exe6;

public class MainCarroMotor {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        car1.setModelo("Prisma");
        car1.setMotor(170, true);
        System.out.println(car1.toString());

        Carro car2 = new Carro("Comodoro", 134, true);
        System.out.println(car2.toString());
    }
}