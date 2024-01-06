package Utils;

public class PrintArray {
    public static void printArray(int[] array){
        // cetak array
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] +"\t");
        }
    }

    public static void printArray(String[] array){
        // cetak array
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] +"\t");
        }
    }

    public static void printArray(char[] array){
        // cetak array
        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] +"\t");
        }
    }

    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // kesamping
                if(array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }
            // pindah baris
            System.out.print("\n");
        }
    }

    public static void printArray(String[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // kesamping
                if(array[i][j] == null){
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }
            // pindah baris
            System.out.println("\n");
        }
    }

    public static void printArray(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // kesamping
                if(String.valueOf(array[i][j]).isEmpty()){
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }
            // pindah baris
            System.out.println("\n");
        }
    }

    public static void printArray0 (int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0){
                    System.out.print(0 + "\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();
        }

    }
}