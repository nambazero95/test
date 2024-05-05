package chap_02;

public class _04_operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = false;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true 가 나옴
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true

        System.out.println((5 > 3) && (3 > 1)); // 5는 3보다 크고 3은 1 보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3보다 크고 3은 1 보다 작다 (false)

        // Or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나 3은 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나 3은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나 3은 1보다 작다 (false)

        // System.out.println(1 < 3 < 5);  // 연속 적으로는 불가능

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false (true반대)
        System.out.println(!(5 == 3)); // true (false반대)


    }
}
