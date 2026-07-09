package pe.edu.galaxy.training.java.libs.date.utils.exception;

/**
 * Excepción lanzada cuando falla una operación de parseo de fechas.
 *
 * @author Galaxy Training
 */
public class DateParseException extends DateException {

    /**
     * Crea una nueva excepción de parseo con el mensaje especificado.
     *
     * @param message mensaje descriptivo del error en español
     */
    public DateParseException(String message) {
        super(message);
    }

    /**
     * Crea una nueva excepción de parseo con el mensaje y la causa especificados.
     *
     * @param message mensaje descriptivo del error en español
     * @param cause   causa original de la excepción
     */
    public DateParseException(String message, Throwable cause) {
        super(message, cause);
    }
}
