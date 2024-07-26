public class Diamond {
    public static void main(String[] args) {
        int n = 4; // height of the upper part of the diamond
        int totlines = 2 * n - 1; // total number of lines
        int space = n - 1;
        int stars = 1;
        
        for (int currentline = 1; currentline <= totlines; currentline++) {
            // Print spaces
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            // Print stars
            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }
            System.out.println();
            
            // Adjust the number of spaces and stars for the next line
            if (currentline < n) {
                space--;
                stars += 2;
            } else {
                space++;
                stars -= 2;
            }
        }
    }
}
