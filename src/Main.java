public class Main {

    public static void main(String[] args) {

        Carro carro1 = new Carro("FLKF78FD","Ranger",2015,10);

        System.out.println("Carro1 Modelo: " + carro1.getModelo());
        System.out.println("Carro1 Placa: " + carro1.getPlaca());
        System.out.println("Carro1 Ano: " + carro1.getAno());
        System.out.println("Tanque: " + carro1.getTanque());
        System.out.println("Ligado: " + carro1.situacao());

        carro1.abastecer(40);
        System.out.println("Tanque abastecido: " + carro1.getTanque() + " Litros");
        carro1.ligar();
        carro1.dirigir(100);
        System.out.println("Tanque ao dirigir: " + carro1.getTanque() + " Litros");



    }
}