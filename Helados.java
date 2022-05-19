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
        String sabor = "";
        double kilos = 0;
        String kilos_temp = "0";
        Helados miHelado = Helados.FRESA;
        boolean pedirHelado = false;
        boolean pedirSabor = false;
        boolean pedirCantidad = false;
        String preguntar = "";
        boolean seguirPidiendo = false;

        do {

            // Creamos un array con los sabores
            Helados sabores[] = Helados.values();
            pedirSabor = false;
            pedirCantidad = false;
            seguirPidiendo = false;


            while (!pedirSabor){
                 try{
                    System.out.println("\nQue sabor de helado de nuestro surtido desea : \n");
                    // Preguntamos el sabor
                    sabor = scan.nextLine();
                    // Asignamos el sabor
                    miHelado = Helados.valueOf(sabor);
                    pedirSabor = true;

                } catch (IllegalArgumentException exSabor){
                    System.out.println("Los sabores disponibles son solo : \n");
                    for (Helados helado : sabores) System.out.println(helado);
                }
             }
            


            while (!pedirCantidad){
                try{
                    // Preguntamos los kilos de helado deseado
                    System.out.println("\nCuantos kg de helado de sabor " + sabor + " desea :  \n");
                    kilos_temp = scan.nextLine();
                    kilos = Double.valueOf(kilos_temp);
                    pedirCantidad = true;

                } catch (NumberFormatException exKilo) {
                    System.out.println("Los kg de helado deben ser numericos\nEjemplos: 3.4, 3. 3.67,...\n");

                }
        
            }

            while (!seguirPidiendo){
               
                System.out.println("\nSeguir pidiendo helado? (SI|NO) ");
                preguntar  = scan.nextLine();

                if (preguntar.equals("SI")){
                    seguirPidiendo = true;
                    pedirHelado = false;
                }

                else if (preguntar.equals("NO")){
                    seguirPidiendo = true;
                    pedirHelado = true;
                }       
             }

            // Imprimir por pantalla el resumen de la compra
            System.out.println(ResumenCompra(sabor.toUpperCase(), miHelado.getMarca(), kilos, miHelado.getPrecio(), miHelado.precio_helado_por_kilos(kilos), miHelado.PopularidadMarca()));
               
        } while (!pedirHelado);
}

}