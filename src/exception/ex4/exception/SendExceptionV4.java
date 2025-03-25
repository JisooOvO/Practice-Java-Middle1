package exception.ex4.exception;

public class SendExceptionV4 extends NetworkClientExceptionV4 {
    private final String sendData;

    public SendExceptionV4(String data, String message) {
        super(message);
        this.sendData = data;
    }

    public String getSendData() {
        return sendData;
    }
}
