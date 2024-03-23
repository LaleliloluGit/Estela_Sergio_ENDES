package itsfreaky;

/**
 *
 * @author Luis Miguel Morales
 */
public class ItsFreaky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("##########################################");
        System.out.println("EJEMPLO 1: Pruebas de cubrimiento (DAM/DAW)");
        System.out.println("##########################################");
        
        // Pruebas de casos de uso
        
        // Casos de prueba para pruebas de cubrimiento + pruebas de condiciones en isFreaky

        // Caso 1: Ningún Interés (000)
        int resultado1 = isFreaky(0, 0, 0);
        System.out.println("Resultado 1: " + resultado1);

        // Caso 2: Solo Tecnología (001)
        int resultado2 = isFreaky(0, 0, 1);
        System.out.println("Resultado 2: " + resultado2);

        // Caso 3: Solo Manga (010)
        int resultado3 = isFreaky(0, 1, 0);
        System.out.println("Resultado 3: " + resultado3);

        // Caso 4: Manga y Tecnología (011)
        int resultado4 = isFreaky(0, 1, 1);
        System.out.println("Resultado 4: " + resultado4);

        // Caso 5: Solo Videojuegos (100)
        int resultado5 = isFreaky(1, 0, 0);
        System.out.println("Resultado 5: " + resultado5);

        // Caso 6: Videojuegos y Manga (110)
        int resultado6 = isFreaky(1, 1, 0);
        System.out.println("Resultado 6: " + resultado6);

        // Caso 7: Todos los Intereses (111)
        int resultado7 = isFreaky(1, 1, 1);
        System.out.println("Resultado 7: " + resultado7);

    }

    /**
     * Método que nos devuelve si una persona es Freak o no, dependiendo de si le gustan
     * los videojuegos, el manga y la tecnología.
     * 
     * @param videogames
     * @param manga
     * @param technology
     * @return 1 o 0 dependiendo de si la persona es Freaky o no lo es.
     */
    public static int isFreaky(int videogames, int manga, int technology) {
        if (videogames > 0) {
            if (manga > 0) {
                if (technology > 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}

