import java.util.Arrays;
public class Arraydemo {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
            System.out.println(Arrays.toString(array));
            System.out.println(array.length);
            int[] array2={1,2,3,4,5};
            System.out.println(Arrays.equals(array, array2));
            System.out.println(Arrays.binarySearch(array, 3));
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));
            Arrays.fill(array, 3);
            System.out.println(Arrays.toString(array));
            


            }
        }

    
    


