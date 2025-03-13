package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String name) {
        this.id = name;
    }

    // simple version
    //    @Override
    //    public boolean equals(Object obj) {
    //        return id.equals(((UserV2) obj).id);
    //    }

    // 반사성 : 객체는 자기 자신과 동일
    // 대칭성 : 양방향
    // 추이성 : 1-2 2-3 1-3을 만족
    // 일관성 : 두 객체의 상태가 변경되지 않으면 항상 같음
    // 모든 객체는 null과 비교했을 때 false
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }

}
