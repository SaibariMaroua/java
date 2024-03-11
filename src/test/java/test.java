import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class test {

    @Test
    public void testVerif() {
        // Arrange (préparez les données nécessaires pour le test)
        int a = 5;
        int b = 6;

        // Act (exécutez la méthode que vous testez)
        boolean resultat = Main.verif(a, b);

        // Assert (vérifiez le résultat attendu)
        assertTrue(resultat);
    }

    }



