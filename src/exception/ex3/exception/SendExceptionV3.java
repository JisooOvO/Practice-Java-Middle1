package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3{
    private final String sendData;

    public SendExceptionV3(String data, String message) {
        super(message);
        this.sendData = data;
    }

    public String getSendData() {
        return sendData;
    }
}
