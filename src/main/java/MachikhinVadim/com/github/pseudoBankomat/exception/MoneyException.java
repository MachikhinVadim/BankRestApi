package MachikhinVadim.com.github.pseudoBankomat.exception;

/**
 * @author vadim machikhin
 * @date 10/22/22
 * TODO description
 */
public class MoneyException extends Throwable {
    private final String message;
    public MoneyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
