package cuentasBanco;


/**
 * 
 * Clase para tener cuentas de banco y su informacion. 
 * Introducer el nombre, la cuenta, el saldo y el tipo de interes
 * 
 * @author Alvaro SMardones Garcia
 * @version 1.0
 * @
 */
public class CuentaBanco {


  
    /**
     * Las variablesque voy a utilizar
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CuentaBanco()
    {
    }

    public CuentaBanco(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * metodo para saber el estado del saldo de la cuenta
     * @return el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo para ingresar dinero en la cuenta
     * @param cantidad es la cantidad que quiero ingresar
     * @throws Exception Si la cantidad es negativa me salta la excepcion y me dice que no se puede ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo para retirar dinero en la cuenta
     * @param cantidad es la cantidad que quiero retirar
     * @throws Exception Si la cantidad es negativa o "0" me salta la excepcion y me dice que no se puede retirar una cantidad negativa
     * @throws Exception Si mi saldo es menor que la cantidad que quiero retirar me salta la excepcion y me dice que no tengo saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Metdodo para devover el nombre del propietario de la cuenta
	 * @return el nombre del propietario dela cuenta
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Metodo para asignar el nombre del propietario de la cuenta
	 * @param nombre asigna el nombre del propietario de la cuenta
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metdodo para devover eel numero de cuenta
	 * @return devuelve el numero de cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Metodo para asignar el numero de la cuenta
	 * @param nombre asigna el numero de la cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Metdodo para devolver el saldo de la cuenta
	 * @return devuelve el saldo de la cuenta
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Metodo para asignar saldo de la cuenta
	 * @param nombre asigna saldo de la cuenta
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Metdodo para saber el tipo de interes de la cuenta
	 * @return devuelve el tipo de interes de la cuenta
	 */
	 
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Metodo para asignar el tipo de interes de la cuenta
	 * @param nombre asigna el tipo de interesde la cuenta
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
