package misTests;

import java.beans.Transient;

public class Tests {
    private int numeroUno = 5;
    private int numeroDos = 3;
    @Test
    
    public void testNumeroVerdadero() {
        Assert.assertTrue(numeroUno==numeroDos+2,"The number is true.");
    }

    @Test
    public void testNumeroFalso() {
        Assert.assertFalse(numeroUno==numeroDos, "The number is false.");
    }

    @Test
    public void testNumerosIguales() {
        Assert.assertEquals(numeroUno+10, numeroDos+12, "Los numeros son iguales.");
    }

    @Test 
    public void testNumerosNoIguales() {    
        Assert.assertNoEquals(numeroUno-1, numeroDos*514, "The numbers are the same.");
    }

    @Test 
    public void testDeNoNulo() {
        Personas persona = new Personas("Pepe", "Gonzales");
        Assert.assertNotNull(persona);
    }

    @Test 
    public void testDeNulo() {
        Personas persona = null;
        Assert.assertNull(persona);
    }

    @Test 
    public void noMismoObjeto() {
        Personas persona = new Personas("Pepe", "Gonzalez");
        Personas personaDos = new Personas("Pepe", "Gonzalez");
        Assert.assertNotSame(persona, personaDos);
    }

    @Test 
    public void mismoObjeto() {
        Personas persona = new Personas("Pepe", "Gonzalez");
        Personas personaDos= persona;
        Assert.assertSame(persona, personaDos);
    }
}
