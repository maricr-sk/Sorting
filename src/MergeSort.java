public class MergeSort {

    private int [] data; //hold the data to be sorted
    public MergeSort(int [] data) { this.data = data; }

    private void merge(int l, int m, int r) {
        int[] b1 = new int[m - l + 1];
        int[] b2 = new int[r - m];

        int i;
        int j;

        for( i = 0; i < b1.length; ++i){
            b1[i] = data[l + i];
        }

        for(j = 0; j < b2.length; ++j){
            b2[j] = data[m + 1 +j];
        }

        i = 0;
        j = 0;

        while(i < b1.length && j < b2.length) {
            if (b1[i] > b2[j]) {
                data[l++] = b2[j++];
            } else {
                data[l++] = b1[i++];
            }
        }

        while (i < b1.length) {
            data[l++] = b1[i++];
        }

        while (j < b2.length) {
            data[l++] = b2[j++];
        }
    }

    public void sort(){ sort(0, data.length-1); }

    private void sort(int l, int r){
        if (l < r){
            int middle = l+(r-l) / 2; //mid-point

            sort(l, middle); //sort halves
            sort(middle + 1, r);

            merge(l, middle, r);//merge sorted halves
        }
    }

    public void print(){
        System.out.print("[ ");
        for(int da : this.data){
            System.out.print(da + " ");
        }
        System.out.println("]");
    }

    public void print(int [] arr){
        System.out.print("[ ");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println("]");
    }
}