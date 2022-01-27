package Udemy.Hashing.CollisionResolutionTechniques.OpenAddressing.DoubleHashingImplementation;

public class Main {
    public static void main(String[] args) {
        DoubleHashing dh= new DoubleHashing(13);
        dh.insertInHashTable("The");
        dh.insertInHashTable("quick");
        dh.insertInHashTable("brown");
        dh.insertInHashTable("fox");
        dh.insertInHashTable("over");
        dh.insertInHashTable("lazy");
        dh.displayHashTable();
    }
}
