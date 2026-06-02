import java.util.*;

public class Problem1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            // Number of products in catalog
            int m = sc.nextInt();

            HashMap<String, Long> catalog = new HashMap<>();

            // Read catalog
            for (int i = 0; i < m; i++) {
                String id = sc.next();
                long price = sc.nextLong();

                catalog.put(id, price);
            }

            // Number of cart items
            int k = sc.nextInt();

            long total = 0;

            // Process cart
            for (int i = 0; i < k; i++) {

                String id = sc.next();
                long quantity = sc.nextLong();

                // If product does not exist, use price = 0
                long price = catalog.getOrDefault(id, 0L);

                total += price * quantity;
            }

            System.out.println("Total Bill: " + total);

      

        sc.close();
    }
}
