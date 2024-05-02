import java.util.*;

public class Ex08 {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);

        List<Integer> array = new ArrayList<>();

        array.add(sc.nextInt());
        sc.nextLine();
        array.add(sc.nextInt());
        sc.nextLine();
        array.add(sc.nextInt());

        Collections.sort(array);

        System.out.println(array);
    }

}