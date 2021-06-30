
public class main {
    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{5, 3, 4}));
    }

    public static boolean canSum(int target, int[] array) {
        boolean[] answer = new boolean[target + 1];
        answer[0] = true;

        for (int i = 0; i < answer.length; i++) {
            if (!answer[i]) continue;
            for (int num : array) {
                int position = i + num;
                if (position >= answer.length) continue;
                answer[position] = true;
            }
        }

        return answer[target];
    }

}