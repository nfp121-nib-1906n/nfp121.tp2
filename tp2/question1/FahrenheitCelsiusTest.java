package question1;

/**
 * Classe-test FahrenheitCelsiusTest.
 * 
 * @author Maria Bou Aoun
 * @version (un numéro de version ou une date)
 * 
 *          Les classes-test sont documentées ici :
 *          http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 *          et sont basées sur le document © 2002 Robert A. Ballance intitulé
 *          «JUnit: Unit Testing Framework».
 * 
 *          Les objets Test (et TestSuite) sont associés aux classes à tester
 *          par la simple relation yyyTest (e.g. qu'un Test de la classe
 *          Name.java se nommera NameTest.java); les deux se retrouvent dans le
 *          même paquetage. Les "engagements" (anglais : "fixture") forment un
 *          ensemble de conditions qui sont vraies pour chaque méthode Test à
 *          exécuter. Il peut y avoir plus d'une méthode Test dans une classe
 *          Test; leur ensemble forme un objet TestSuite. BlueJ découvrira
 *          automatiquement (par introspection) les méthodes Test de votre
 *          classe Test et générera la TestSuite conséquente. Chaque appel d'une
 *          méthode Test sera précédé d'un appel de setUp(), qui réalise les
 *          engagements, et suivi d'un appel à tearDown(), qui les détruit.
 */
public class FahrenheitCelsiusTest extends junit.framework.TestCase {
	// Définissez ici les variables d'instance nécessaires à vos engagements;
	// Vous pouvez également les saisir automatiquement du présentoir
	// à l'aide du menu contextuel "Présentoir --> Engagements".
	// Notez cependant que ce dernier ne peut saisir les objets primitifs
	// du présentoir (les objets sans constructeur, comme int, float, etc.).

	/**
	 * Constructeur de la classe-test FahrenheitCelsiusTest
	 */
	public FahrenheitCelsiusTest() {
	}

	/**
	 * Met en place les engagements.
	 * 
	 * Méthode appelée avant chaque appel de méthode de test.
	 */
	protected void setUp() // throws java.lang.Exception
	{
		// Initialisez ici vos engagements

	}

	/**
	 * Supprime les engagements
	 * 
	 * Méthode appelée après chaque appel de méthode de test.
	 */
	protected void tearDown() // throws java.lang.Exception
	{
		// Libérez ici les ressources engagées par setUp()
	}

	/**
	 * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test. Ces
	 * méthodes doivent vérifier les résultats attendus à l'aide d'assertions
	 * assertTrue(<boolean>). Par convention, leurs noms devraient débuter par
	 * "test". Vous pouvez ébaucher le corps grâce au menu contextuel
	 * "Enregistrer une méthode de test".
	 */
	public void test_fahrenheitEnCelsius() {
		assertEquals("    0 °F -> -17.7 °C ? ", -17.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(0), 0.1);
		assertEquals("  100 °F -> 37.7 °C ? ", 37.7, question1.FahrenheitCelsius.fahrenheitEnCelsius(100), 0.1);
		
	}
	
    public void test_fahrenheitEnCelsiusNeg() {
        assertEquals("    -380 °F -> -228.8 °C ? ", -228.8, question1.FahrenheitCelsius.fahrenheitEnCelsius(-380), 0.1);
        assertEquals("    -833 °F -> -480.5 °C ? ", -480.5, question1.FahrenheitCelsius.fahrenheitEnCelsius(-833), 0.1);
    }
    
   
    public void test_fahrenheitEnCelsiusInteger() {
        assertEquals("    2147483647 °F -> 1111111093.3 °C ? ", 1111111093.3, question1.FahrenheitCelsius.fahrenheitEnCelsius(2000000000), 0.1);
        
    }
    
    
    public void test_fahrenheitEnCelsiusSign() {
        assertTrue("La température en °C  de 13 °F est nég ? ", question1.FahrenheitCelsius.fahrenheitEnCelsius(13) < 0 );
        assertTrue("La température en °C  de 88 °F est pos ? ", question1.FahrenheitCelsius.fahrenheitEnCelsius(88) > 0 );
	
}
