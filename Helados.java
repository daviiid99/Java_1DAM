import java.util.Scanner;

enum Helados {
    FRESA("Magnum", 10),
    CHOCOLATE("Carte d'Or", 15),
    VAINILLA("Kalise", 13 ),
    MENTA("Nestle", 20);

    private String marca;
    private double precio_por_kilo;
    private String popularidad;

    Helados(String marca, double precio_por_kilo){
        this.precio_por_kilo = precio_por_kilo;
        this.marca = marca;

    }

    public String getMarca(){
        return this.marca;
    }

    public double getPrecio(){
        return this.precio_por_kilo;
    }

    public double precio_helado_por_kilos(double kilos){
        return (kilos * this.precio_por_kilo);
    }

    public String PopularidadMarca(){
        
        switch(this.marca){
        
        case "Magnum" :
            popularidad = "9/10";
            break;

        case "Carte d'Or" :
            popularidad = "8/10";
            break;

        case "Kalise" :
            popularidad = "7/10";
            break;

        case "Nestle" :
            popularidad = "9/10";
            break;
        }
        return popularidad;
    }

}

class Main{

    public static String ResumenCompra(String sabor, String marca, double kilos, double precio_por_kilo,  double precio_total, String puntuacion_marca){
        return "----- Resumen Compra -----\nSabor : " + sabor + "\nMarca : " + marca + "\nKilogramos de helado : " + kilos + "\nPrecio por kilogramo : " + precio_por_kilo + "\nImporte total : " + precio_total + "\nPuntuacion Marca : " + puntuacion_marca;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sabor;
        double kilos;
        Helados miHelado;

        System.out.println("\nQue sabor de helado de nuestro surtido desea : \n");

        // Creamos un array con los sabores
        Helados sabores[] = Helados.values();

        // Imprimimos los sabores
        for (Helados helado : sabores) System.out.println(helado);

        // Preguntamos el sabor
        sabor = scan.nextLine();

        // Asignamos el sabor
        miHelado = Helados.valueOf(sabor.toUpperCase());

        // Preguntamos los kilos de helado deseado
        System.out.println("\nCuantos kg de helado de sabor " + sabor + " desea :  \n");
        kilos = scan.nextDouble();

        // Imprimir por pantalla el resumen de la compra
        System.out.println(ResumenCompra(sabor.toUpperCase(), miHelado.getMarca(), kilos, miHelado.getPrecio(), miHelado.precio_helado_por_kilos(kilos), miHelado.PopularidadMarca()));

    }
}