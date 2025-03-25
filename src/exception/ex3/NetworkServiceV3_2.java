package exception.ex3;

import exception.ex3.exception.ConnectionExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);

        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectionExceptionV3 e) {
            System.out.println(
                "[연결오류] 주소 : " + e.getAddress() +
                ", 메시지 : " + e.getMessage()
            );
        } catch (NetworkClientExceptionV3 e) {
            System.out.println(
                "[네트워크 오류] 메시지 : " + e.getMessage()
            );
        } catch (Exception e) {
            System.out.println(
                "[알 수 없는 오류] 메시지 : " + e.getMessage()
            );
        }
        finally {
            client.disconnect();
        }
    }
}
