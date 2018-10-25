import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem4ArrayLists {
    public static void main(String[] args){
        ArrayList<Integer> set1 = new ArrayList<Integer>();
        ArrayList<Integer> set2 = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length for set 1: ");
        int set1Length = input.nextInt();
        for(int i = 0; i < set1Length; i++){
            System.out.println("Enter value for element "+i);
                set1.add(input.nextInt());
        }
        System.out.println("Enter length for set 2: ");
        int set2Length = input.nextInt();
        for(int i = 0; i < set2Length; i++){
            System.out.println("Enter value for element "+i);
                set2.add(input.nextInt());
        }
        ArrayList<Integer> set1New = new ArrayList(set1);
        ArrayList<Integer> set2New = new ArrayList(set2);
        /*setUnion(set1,set2);
        setIntersection(set1, set2);*/
        if(set1.size()>=set2.size()){
            System.out.println("Set union: "+setUnion(set1,set2));
            System.out.println("Set Intersection: "+setIntersection(set1,set2));
            System.out.println("B': "+bPrime(set2));
            cartesianProduct(set1,set2);
        }
        if(set1.size()<set2.size()){
            System.out.println("Set union: "+setUnion(set2,set1));
            System.out.println("Set intersection: "+setIntersection(set2,set1));
            System.out.println("B': "+bPrime(set1));
            cartesianProduct(set2,set1);
        }
    }
    public static ArrayList<Integer> setUnion(ArrayList<Integer> a1, ArrayList<Integer> a2){
            ArrayList<Integer> union = new ArrayList<Integer>();
            union.addAll(a1);
            union.removeAll(a2);
            union.addAll(a2);
            return union;
    }
    public static ArrayList<Integer> setIntersection(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for(Integer i : a1){
            if(a2.contains(i)){
                intersection.add(i);
            }
        }

        return intersection;
    }
    public static ArrayList<Integer> bPrime(ArrayList<Integer> b1){
        ArrayList<Integer> universe = new ArrayList<>();
        universe.add(0);
        universe.add(1);
        universe.add(2);
        universe.add(3);
        universe.add(4);
        universe.add(5);
        universe.add(6);
        universe.add(7);
        universe.add(8);
        universe.add(9);

        /*for(int i=0; i<universe.size();i++){
            universe.add(i);
        }*/

        universe.removeAll(b1);
        return universe;
    }
    public static ArrayList<Integer> cartesianProduct(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> intersection = setIntersection(a1,a2);
        System.out.println("Cartesian Product of (A n B)*A");
        for(Integer i : a1){
            for(Integer j : intersection){
                System.out.print("("+j+","+i+")");
                System.out.print(", ");
            }
        }
        return null;
    }
}
