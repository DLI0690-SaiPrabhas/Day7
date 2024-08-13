import java.util.*;

public class ListDifference {
    public static List<Integer> findDifference(List<Integer> list1, List<Integer> list2) {

        List<Integer> difference = new ArrayList<>(list1);

        difference.removeAll(list2);
        return difference;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();

        System.out.println("enter list1 size: ");
        int l1=sc.nextInt();
        System.out.println("enter the list1 elements");
        for(int i=0;i<l1;i++){
            int num=sc.nextInt();
            list1.add(num);
        }

        List<Integer> list2 = new ArrayList<>();

        System.out.println("enter list1 size: ");
        int l2=sc.nextInt();
        System.out.println("enter the list1 elements");
        for(int i=0;i<l2;i++){
            int num=sc.nextInt();
            list2.add(num);
        }

        List<Integer> difference = findDifference(list1, list2);
        System.out.println("The difference between the two lists is: " + difference);
    }
}