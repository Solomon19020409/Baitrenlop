public class Week4 {
    /**
     * 
     * @param a
     * @param b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a > b) return a;
        else if (b > a) return b;
    }

    /**
     * 
     * @param arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] < min ) { min = arr[i]; }
        }
        return min;
    }

    /**
     * 
     * @param weight: in kg
     * @param height: in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double BMI;
        BMI = weight / (height * height);
        if (BMI < 18.5) {
            return "Thieu can";
        } else if ((BMI >= 18.5) && (BMI <= 22.9 )) {
            return "Binh thuong";
        } else if ((BMI >= 23) && (BMI <= 24.9)) {
            return "Thua can";
        } else if (BMI >= 25) {
            return "Beo phi";
        }  
    }
    public static void main(String[] args) {
   
    }
} 
