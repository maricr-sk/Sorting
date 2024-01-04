public class WarmUp {

    public static void print(int [] arr){
        System.out.print("[ ");
        for(int n:arr){
            System.out.print(n + "  ");
        }
        System.out.println("]");
    }

    public static int [] interleave(int [] a1, int [] a2){
        int [] answer = new int [a1.length + a2.length];
        int count = 0;
        for(int i = 0; i < a1.length; ++i){
            answer[count++] = a1[i];
            answer[count++] = a2[i];
        }
        return answer;
    }

    public static void interleave2(int [] a) {
        int[] b1 = new int[a.length / 2];
        int[] b2 = new int[a.length / 2];

        for (int i = 0; i < b1.length; ++i) {
            b1[i] = a[i];
            b2[i] = a[a.length/2 + i];
        }

        int count = 0;
        if (a.length % 2 == 0) {
            for (int i = 0; i <b1.length; ++i) {
                a[count++] = b1[i];
                a[count++] = b2[i];
            }
        }
    }

    public static int [] interleave3(int [] a1, int [] a2){
        int [] answer = new int [a1.length + a2.length];

        int j = 0;
        int i = 0;
        int k = 0;
        while (i < a1.length || j < a2.length) {
            if(i < a1.length){
                answer[k++] = a1[i++];
            }
            if(j < a2.length){
                answer[k++] = a2[j++];
            }
        }
        return answer;
    }

    public static int [] merge(int [] left, int [] right){
        int [] answer = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;
        answer[k] = left[i];

        while(i < left.length || j < right.length){
            if(i < left.length && j < right.length){
                if(left[i] > right[j]){
                    answer[k++] = right[j++];
                }
                else{
                    answer[k++] = left[i++];
                }
            }
            else if( i >= left.length){
                answer[k++] = right[j++];

            }
            else{
                answer[k++] = left[i++];
            }
        }
        return answer;
    }

    public static int [] merge2(int [] a1, int [] a2) {
        int[] answer = new int[a1.length + a2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        answer[k] = a1[i];

        while (i < a1.length || j < a2.length) {
            if (i < a1.length) {
                if (answer[k] > a1[i]) {
                    answer[k + 1] = answer[k];
                    answer[k++] = a1[i++];
                } else {
                    answer[k++] = a1[i++];
                }
            }
            if (j < a2.length) {
                if (answer[k] > a2[j]) {
                    answer[k + 1] = answer[k];
                    answer[k++] = a2[j++];
                } else {
                    answer[k++] = a2[j++];
                }
            }
        }
        return answer;
    }

    public static void interleave4(int [] a, int index) {
        int[] b1 = new int[a.length - index + 1];
        int[] b2 = new int[a.length - b1.length];

        int count = 0;
        int i = 0;
        int j = 0;
        
        while(i < b1.length){
            if(i < b1.length){
                b1[i++] = a[count++];
            }
        }
        while(j < b2.length){
            if(j < b2.length){
                b2[j++] = a[count++];
            }
        }

        i = 0;
        j = 0;
        count = 0;

       while( i < b1.length || j < b2.length) {
           while (i < b1.length && j < b2.length) {
               a[count++] = b1[i++];
               a[count++] = b2[j++];
           }
           if (i >= b1.length) {
               while (j < b2.length) {
                   a[count++] = b2[j++];
               }
           } else {
               while (i < b1.length) {
                   a[count++] = b1[i++];
               }
           }
       }
    }
}