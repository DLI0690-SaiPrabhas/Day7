import java.util.HashSet;


public class LongestConsecutiveSequence {
    public static void findSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("No consecutive sequence found");
        }
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }
        System.out.println(numSet);
        int count = 0;
        int firstElement = 0;

        for (int num : numSet) {
            if (numSet.contains(num + 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                if (currentStreak > count) {
                    count = currentStreak;
                    firstElement = num;
                }
            }
        }
        System.out.println("the longest consecutive sequence length is: "+count);
        System.out.print("longest consecutive sequence is: ");
        for (int i = 0; i <count;i++) {
            System.out.print( (firstElement+i)+" ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {100,200,11,12,13};
        findSequence(nums);
    }
}