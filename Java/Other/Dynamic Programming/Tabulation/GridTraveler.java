
public class main {
    public static void main(String[] args) {
        System.out.println(gridTraveler(2,18));
    }

    public static int gridTraveler(int rows, int columns) {
        if(rows == 0 || columns == 0) return 0;
        if(rows == 1 || columns == 1) return 1;

        int[][] table = new int[rows + 1][columns + 1];
        table[1][1] = 1;

        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                if(i + 1 != table.length){
                    table[i + 1][j] += table[i][j];
                }

                if(j + 1 != table[i].length){
                    table[i][j + 1] += table[i][j];
                }
            }
        }

        return table[rows][columns];
    }

}