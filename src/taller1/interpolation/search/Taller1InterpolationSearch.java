
package taller1.interpolation.search;

/**
 *
 * @author Sebastian Baldion
 */
public class Taller1InterpolationSearch {
    
    public static void main(String[] args) {
        int [] x = new int[500];
        
        for (int i = 0; i < x.length; i++) {
            x[i] = i * 10;
        }
        
        int search = 50;
        System.out.println("Indice  " + search + " = " + InterpolationSearch.search(x, search));
    }
    static class InterpolationSearch {
        public static int search(int[] sortedArray, int toFind) {
            final int NOT_FOUND = -1;
            int low = 0;
            int high = sortedArray.length - 1;
            int lastMid = -1;
            
            while (true) {
                int mid = (low + high) / 2;
                if (sortedArray[mid] == toFind) {
                    return mid;
                }
                
                if(toFind > sortedArray[mid]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                if (lastMid == mid) {
                    return NOT_FOUND;
                }
                
                lastMid = mid;
            }
        }
    }
}
