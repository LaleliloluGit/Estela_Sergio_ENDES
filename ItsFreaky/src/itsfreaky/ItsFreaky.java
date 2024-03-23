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
        

        
        //PRUEBAS DE CUBRIMIENTO = el objetivo es ejecutar, al menos una vez, todas las sentencias o líneas del programa
        
        /***************************
         * Prueba de caso de uso 1 
         ***************************/
        
        /**
         * 
         * @param videogames=1
         * @param manga=1
         * @param technology=1
         * @return 1
         */
        
         System.out.println("Salida:");
         System.out.println(isFreaky(1,1,1));

         /**
         * 
         * @param videogames=1
         * @param manga=1
         * @param technology=0
         * @return 0
         */
         
         System.out.println("Salida:");
         System.out.println(isFreaky(1,1,0));
         
         /**
         * 
         * @param videogames=1
         * @param manga=0
         * @param technology=X
         * @return 0
         */
         
         System.out.println("Salida:");
         System.out.println(isFreaky(1,0,0));

         
          /**
         * 
         * @param videogames=0
         * @param manga=X
         * @param technology=X (ponemos X porque nos da igual el valor que tengan, no va a entrar en el bucle)
         * @return 0
         */
          
         System.out.println("Salida:");
         System.out.println(isFreaky(0,0,0));
                
    
    
       
      
       
       
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

