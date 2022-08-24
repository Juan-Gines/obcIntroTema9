public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad=25;
        cliente.nombre="Pablo";
        cliente.telefono="5555555";
        cliente.credito=5000;
        System.out.println("El cliente "+cliente.nombre+" tiene "+cliente.edad+" años de edad, su teléfono es "+cliente.telefono+" y su crédito es "+cliente.credito+".");

        Trabajador trabajador = new Trabajador();
        trabajador.edad=28;
        trabajador.nombre="Román";
        trabajador.telefono="5555556";
        trabajador.salario=1000;
        System.out.println("El trabajador "+trabajador.nombre+" tiene "+trabajador.edad+" años de edad, su teléfono es "+trabajador.telefono+" y su salario es "+trabajador.salario+".");

    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}