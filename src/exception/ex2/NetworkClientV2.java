package exception.ex2;

public class NetworkClientV2 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    // 연결 성공
    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2(
                "connectError",
                address + " 서버 연결 실패"
            );
        }

        System.out.println(address + " 서버 연결 성공");
    }

    // 전송 성공
    public void send(String data) throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2(
                "sendError",
                address + " 서버에 데이터 전송 실패 : " + data
            );
        }

        System.out.println(address + " 서버에 데이터 전송 : " + data);
    }

    // 접속 종료
    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError = true;
        }

        if(data.contains("error2")) {
            sendError = true;
        }
    }
}
