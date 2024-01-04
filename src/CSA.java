import java.util.ArrayList;

public class CSA {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(7);
        nums.add(5);
        nums.add(2);
        nums.add(2);
        nums.add(4);

        for(int i = 0; i < nums.size(); ++i){
            if(nums.get(i) == 2){
                nums.remove(i--);
            }
        }

        System.out.println(nums);
    }
}
