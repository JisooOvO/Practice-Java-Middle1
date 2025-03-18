package enumeration.ex2;

// 인스턴스를 만들 수 없고
// 정해진 인스턴스만 사용 가능 -> 타입 안전성 / 데이터 일관성
public class ClassGrade {
    private ClassGrade(){}

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
}
