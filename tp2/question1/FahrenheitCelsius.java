package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author Maria Bou Aoun
 * 
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        int fahrenheit = 0;
        double celsius = 0.0;
        
    
        for (String fahrenheitTemp : args) {
            fahrenheit = Integer.parseInt(fahrenheitTemp);
            celsius = fahrenheitEnCelsius(fahrenheit);
            
            System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); 
        }   
        
      
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    
 
    public static double fahrenheitEnCelsius(int f) {
        double celsiusTemp = (((double)5)/((double)9))*(f - 32);
        celsiusTemp = ((long)(celsiusTemp * 10))/10.0;
        
        return celsiusTemp;
    }

}
