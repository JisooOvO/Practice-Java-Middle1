package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();

        // String -> 오타 / 존재하지 않는 등급 입력 위험
        // 타입 안정성, 데이터 일관성 부족
        int vip = discountService.discount("VIP", price);
        int diamond = discountService.discount("DIAMONDD", price);

        System.out.println("VIP 등급의 할인 금액 : " + vip);
        System.out.println("DIAMOND 등급의 할인 금액 : " + diamond);
    }

}
