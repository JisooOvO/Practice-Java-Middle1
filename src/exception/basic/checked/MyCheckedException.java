package exception.basic.checked;

/**
 *  Exception을 상속받은 예외 = 체크 예외
 */
public class MyCheckedException extends Exception{

    public MyCheckedException(String message) {
        super(message);
    }


}
