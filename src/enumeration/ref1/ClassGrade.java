package enumeration.ref1;

// 인스턴스를 만들 수 없고
// 정해진 인스턴스만 사용 가능 -> 타입 안전성 / 데이터 일관성
public class ClassGrade {
    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    public int getDiscountPercent() {
        return discountPercent;
    }
}
