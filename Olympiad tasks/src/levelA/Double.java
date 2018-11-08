import java.util.ArrayList;
import java.util.List;

public class Double {
    public static void main(String[] args) {
        Double d = new Double();
        List<Integer> ints = new ArrayList<>();
        for(int count = 1; count <= 5; count++){
            ints.add(count);
        }
        ints = d.doubling(ints);
        for(int count = 0; count < 5; count++){
            System.out.println(ints.get(count));
        }
    }

    public List<Integer> doubling(List<Integer> nums) {
        List<Integer> temps = new ArrayList();
        for(int counter = 0; counter < nums.size(); counter++){
            temps.add(nums.get(counter) * 2);
        }
        List<String> tempArr = new ArrayList();
        return temps;
    }
}
