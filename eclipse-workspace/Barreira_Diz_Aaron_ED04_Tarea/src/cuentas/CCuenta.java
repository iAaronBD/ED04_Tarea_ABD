package cuentas;



/**
 * Representa una cuenta bancaria
 * 
 * @author AarónBD
 * @version 1.0
 */
public class CCuenta {


	/**
	 * El nombre asociado a la cuenta
	 */
    private String nombre;
    /**
     * El identificador de la cuenta
     */
    private String cuenta;
    /**
     * El saldo de la cuenta
     */
    private double saldo;
    /**
     * El tipo de interés aplicado a la cuenta
     */
    private double tipoInterés;
    
    
    /**
     * Constructor sin argumentos
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con argumentos
     * 
     * @param nom Nombre de la nueva cuenta
     * @param cue El identificador de la nueva cuenta
     * @param sal El salario de la nueva cuenta
     * @param tipo El tipo de interés de la nueva cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre= nom;
        cuenta= cue;
        saldo= sal;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * 
     * @return Saldo actual
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa dinero en la cuenta
     * 
     * @param cantidad La cantidad de dinero a ingresar
     * @throws Exception No se ha introducido una cantidad válida
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira dinero de la cuenta
     * 
     * @param cantidad La cantidad de dinero a retirar
     * @throws Exception No se ha introducido una cantidad válida
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
