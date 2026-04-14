/**
 * Clase para validar contraseñas
 */
public class ValidadorContraseña {
    /**
     * Función que devuelve true o false en función de si la contraseña es válida o no
     * @param texto
     * @return true si vale o false si no
     */
    public boolean esValida(String texto) {
        if (texto.length()<8) return false;
        if (texto.equals(texto.toLowerCase())) return false;
        if (texto.equals(texto.toUpperCase())) return false;
        boolean numero = false;
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                numero = true;
                break;
            }
        }
        if (!numero) return false;
        if (!texto.matches(".*[^a-zA-Z0-9].*")) return false;
        return true;
    }
}