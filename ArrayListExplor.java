package Collection;

import java.util.ArrayList;

public class ArrayListExplor {
    public static void main(String [] args){
        removeDuplicates();
    }

    public static ArrayList<String> createArrayList(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("swaroop");
        arrayList.add("pooja");
        arrayList.add("shree");
        arrayList.add(1,"Lakshmi");
        for (int i =0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        return arrayList;
    }

    public static void removeDuplicates(){
        int arr [] = {1,1,2,2,3,3,4,4,5,4,3};
        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(arr[0]);
        for(int i = 1; i < arr.length; i++){
//            if(arr[i] != arr[i-1]){
//                newList.add(arr[i]);
//            }
            if(!newList.contains(arr[i])){
                newList.add(arr[i]);
            }
        }
        System.out.println(newList);
    }
}
