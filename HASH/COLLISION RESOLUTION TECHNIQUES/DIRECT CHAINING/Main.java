package Udemy.Hashing.CollisionResolutionTechniques.DirectChainingImplementation;

public class Main {
    public static void main(String[] args) {
        DirectChaining dc= new DirectChaining(15);
        dc.insertHashTable("The");
        dc.insertHashTable("quick");
        dc.insertHashTable("brown");
        dc.insertHashTable("fox");
        dc.insertHashTable("over");
        dc.displayHashTable();
        dc.searchHashTable("quick");
        dc.deleteKeyHashTable("brown");
        dc.displayHashTable();
    }
}
