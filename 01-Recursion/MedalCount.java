package Question01;
/**
 *
 * @author bhagy
 */
public class MedalCount {

    public static void main(String[] args) {
        int[][] medals = {
            {1, 0, 1}, // Sport 1: 1 Gold, 0 Silver, 1 Bronze
            {2, 1, 0}, // Sport 2: 2 Gold, 1 Silver, 0 Bronze
            {0, 2, 1}  // Sport 3: 0 Gold, 2 Silver, 1 Bronze
        };
        
        int[] totalMedals = calculateMedals(medals, 0);
        System.out.println("Total Gold: " + totalMedals[0]);
        System.out.println("Total Silver: " + totalMedals[1]);
        System.out.println("Total Bronze: " + totalMedals[2]);
    }

    public static int[] calculateMedals(int[][] medals, int i) {
        if (i == medals.length) {
            return new int[]{0, 0, 0};
        }
        
        int[] currentMedals = medals[i];
        int[] nextMedals = calculateMedals(medals, i+ 1);
        
        return new int[]{
            currentMedals[0] + nextMedals[0], 
            currentMedals[1] + nextMedals[1], 
            currentMedals[2] + nextMedals[2]
        };
    }
}
