import java.util.*;

public class Main {
    static Map<String, List<List<String>>> recipes = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        int count = 0;
        while (count < n) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue; 

            String[] parts = line.split("=");
            String potion = parts[0];
            String[] ingArr = parts[1].split("\\+");

            recipes.putIfAbsent(potion, new ArrayList<>());
            recipes.get(potion).add(Arrays.asList(ingArr));

            count++;
        }

        String target = sc.nextLine().trim();

        int ans = cost(target);
        System.out.println(ans);
    }

    static int cost(String potion) {
        if (!recipes.containsKey(potion)) {
            return 0;
        }

        int minCost = Integer.MAX_VALUE;

        for (List<String> ingList : recipes.get(potion)) {
            int recipeCost = ingList.size() - 1;
            for (String ing : ingList) {
                recipeCost += cost(ing);
            }
            minCost = Math.min(minCost, recipeCost);
        }

        return minCost;
    }
}
