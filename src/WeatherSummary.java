import java.util.Scanner;

public class WeatherSummary {
    /**
     * Reads newline-delimted temperatures from System.in and prints summary
     * statistics to System.out.
     * 
     * Example input:
     * 66.4
     * 77.1
     * 72.6
     * 
     * Example output:
     * Max: 66.4
     * Min: 77.1
     * Average: 72.03333333333333
     * 
     * @param args command line arguments (ignored)
     */
    public static void main(String[] args) {
        // Implement this method!
        // Hint: use Scanner. nextDouble() and hasNextDouble() will be helpful here!
        Scanner scanner = new Scanner(System.in);

        /** while (scanner.hasNextDouble()) {
            double temp = scanner.nextDouble();
            System.out.println(temp);
        } **/

        double temp = scanner.nextDouble();
        double max = temp;
        double min = temp;
        double sum = temp;
        int count = 1;

        while (scanner.hasNextDouble()) {
            temp = scanner.nextDouble();
            sum += temp;
            count++;

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }
        double average = sum / count;

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
    }
}
