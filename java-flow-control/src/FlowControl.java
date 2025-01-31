public class FlowControl {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0; i < accounts.length; i++){
            int totalSum = 0;
            for(int wealth : accounts[i]){
                totalSum += wealth;
            }
            maxWealth = Math.max(maxWealth, totalSum);
        }
        return maxWealth;
    }

    public static void main(String[] args){
        FlowControl solution = new FlowControl();

        int[][] account1 = {{1, 2, 3}, {3, 2, 1}}; // (answer: 6)
        int[][] account2 = {{1, 5}, {7, 3}, {3, 5}}; // (answer: 10)
        int[][] account3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}}; // (answer: 17)

        System.out.println("Test Case 1: " + solution.maximumWealth(account1));
        System.out.println("Test Case 2: " + solution.maximumWealth(account2));
        System.out.println("Test Case 3: " + solution.maximumWealth(account3));
    }

}
