package MachikhinVadim.com.github.pseudoBankomat.exception;

/**
 * @author vadim machikhin
 * @date 10/23/22
 * TODO description
 */
public class OperationException extends Throwable {
    private final String message;

    public OperationException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
