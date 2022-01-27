package Udemy.Hashing.CollisionResolutionTechniques.OpenAddressing.DoubleHashingImplementation;

import java.util.ArrayList;

public class DoubleHashing {
    String[] hashTable;
    int usedCellNumber;

    DoubleHashing(int size){
        hashTable= new String[size];
        usedCellNumber=0;
    }

    public int modASCIIHashFunction(String word, int M){
        char[] ch;
        ch= word.toCharArray();
        int i, sum;
        for (sum=0, i=0; i<word.length(); i++){
            sum= sum+ ch[i];
        }
        return sum%M;
    }

    public double getLoadFactor(){
        double loadFactor= usedCellNumber *1.0/ hashTable.length;
        return loadFactor;
    }

    public void rehashKeys(String word){
        usedCellNumber=0;
        ArrayList<String> data= new ArrayList<String>();
        for (String s: hashTable){
            if (s!= null){
                data.add(s);
            }
        }
        data.add(word);
        hashTable= new String[hashTable.length*2];
        for (String s: hashTable){
            insertInHashTable(s);
        }
    }

    private int addAllDigitsTogether(int sum){
        int value=0;
        while (sum>0){
            value+= sum%10;
            sum= sum/10;
        }
        return value;
    }

    public int secondHashFunction(String x, int M){
        char ch[];
        ch= x.toCharArray();
        int i, sum;
        for (sum=0, i=0; i< x.length(); i++){
            sum+= ch[i];
        }
        while (sum> hashTable.length){
            sum= addAllDigitsTogether(sum);
        }

        return sum%M;
    }

    public void insertInHashTable(String word){
        double lf= getLoadFactor();
        if (lf>=0.75){
            rehashKeys(word);
        }
        else {
            int x = modASCIIHashFunction(word, hashTable.length);
            int y= secondHashFunction(word, hashTable.length);
            for (int i = 0; i < hashTable.length; i++) {
                int newIndex= (x+ i*y)% hashTable.length;
                if (hashTable[newIndex]== null){
                    hashTable[newIndex]=word;
                    System.out.println(word+" inserted at index "+newIndex);
                    break;
                }
                else {
                    System.out.println(newIndex+" index is occupied. Trying new index..");
                }
            }
        }
        usedCellNumber++;
    }

    public void displayHashTable(){
        if (hashTable== null){
            System.out.println("The hashtable does not exists!!");
        }
        else {
            System.out.println("--------Hash Table--------");
            for (int i = 0; i < hashTable.length; i++) {
                System.out.println("Index: "+i+", Key: "+hashTable[i]);
            }
        }
    }

    public boolean searchInHashTable(String word){
        int index= modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            int newIndex= i% hashTable.length;
            if (hashTable[newIndex]!= null && hashTable[newIndex].equals(word)){
                System.out.println(word+" found at index "+newIndex);
                return true;
            }
        }
        System.out.println(word+ " not found in the hash table!");
        return false;
    }

    public void deleteKeysHashTable(String word){
        int index= modASCIIHashFunction(word, hashTable.length);
        for (int i = index; i < index+hashTable.length; i++) {
            int newIndex= i% hashTable.length;
            if (hashTable[newIndex]!= null && hashTable[newIndex].equals(word)){
                hashTable[newIndex]= null;
                System.out.println(word+" has been deleted successfully!!");
                return;
            }
        }
        System.out.println(word+ " not found in the hash table!");
    }
}
