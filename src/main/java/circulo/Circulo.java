package circulo;

/**
 * Clase Circulo con (x,y) y radio
 * @author Xulio
*/
public class Circulo {
    private int x;
    private int y;
    private double radio;
    /**
     * @param x
     * @param y
     * @param radio
     */

    /**
     * Constructor de Circulo
     * @param valorX
     * @param valorY
     * @param valorRadio
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Metodo que establece x
     * @param valorX
     */
    public void establecerX(int valorX) {
        x=valorX;
    }

    /**
     * Metodo que obtiene x
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Metodo que establece y
     * @param valorY
     */
    public void establecerY(int valorY) {
        y=valorY;
    }

    /**
     * Metodo que obtiene y
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Metodo que establece el valor del radio
     * @param valorRadio
     */
    public void establecerRadio(double valorRadio) {

        radio=(valorRadio < 0.0 ? 0.0 : valorRadio);
    }

    /**
     * Metodo para obtener el radio del circulo
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Metodo para obtener el diametro del circulo
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Metodo para obtener la circunferencia del circulo
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * Metodo para obtener el area del circulo
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * Metodo que modifica la toString para que devuelva el string deseado
     */
    @Override
    public String toString() {
        return "Centro = [" + x + "," + y + "]; Radio = " + radio;
    }
}