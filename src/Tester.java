public class Tester {

    public static void main(String[] args) {
        int [] a1 = {4,7,9,2,3};
        int [] a2 = {6,7,2,4,5};

        int [] answer = WarmUp.interleave(a1, a2);
        WarmUp.print(a1);
        WarmUp.print(a2);
        WarmUp.print(answer);
        System.out.println();
        int [] a = {4,6,7,8,9,0};

        WarmUp.print(a);
        WarmUp.interleave2(a);
        WarmUp.print(a);
        System.out.println();

        int [] c = {4, 7, 9, 2, 3, 7, 9, 3};
        int [] d = {6,7,2,4,5};
        WarmUp.print(c);
        WarmUp.print(d);
        int [] answer2 = WarmUp.interleave3(c, d);
        WarmUp.print(answer2);

        System.out.println();
        int [] left = {3,4,7,9,11};
        int [] right = {5,7,11,14};
        WarmUp.print(left);
        WarmUp.print(right);
        int [] answer3 = WarmUp.merge(left, right);
        WarmUp.print(answer3);

        System.out.println();
        int [] left1 = {3,9,6,5,2,4};
        WarmUp.print(left1);
        WarmUp.interleave4(left1, 3);
        WarmUp.print(left1);
    }
}
