package LAB12;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String,Double> hm = new HashMap<String, Double>();
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter Name of Student: ");
            String name = input.next();
            System.out.print("Enter marks: ");
            double marks = input.nextInt();
            hm.put(name,marks);
            System.out.println();
        }

        System.out.println(HashMapLab.findMaxMinScores(hm));
    }
}

class HashMapLab {

    public static HashMap<String,Double> findMaxMinScores(HashMap<String,Double> student){
        double minMap = Collections.min(student.values());
        Double maxMap = Collections.max(student.values());

        HashMap<String,Double> ans = new HashMap<String,Double>();

        for (Map.Entry<String,Double> entry : student.entrySet()){
            if(Objects.equals(entry.getValue(),minMap)){
                ans.put(entry.getKey(),minMap);
            }if(Objects.equals(entry.getValue(),maxMap)){
                ans.put(entry.getKey(),maxMap);
            }

        }
        return ans;
    }


}