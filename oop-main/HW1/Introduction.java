public class Introduction {
    public static void main(String[] args) {
      
        System.out.println("Dao Van Toan\24020325\OOP 1\toandaocloud\24020325@vnu.edu.vn");


        for (int i = 9; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
                System.out.println((i-1) + " bottles of beer on the wall, " + (i-1) + " bottles of beer.");
                System.out.println("Take one down, pass it around,");
            } else if (i == 1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down, pass it around,");
            } else {
                System.out.println("No more bottles of beer on the wall.");
            }
        }
    }
}
