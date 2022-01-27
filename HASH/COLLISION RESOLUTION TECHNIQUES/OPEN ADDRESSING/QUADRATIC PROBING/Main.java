package Udemy.Hashing.CollisionResolutionTechniques.OpenAddressing.QuadraticProbingImplementation;

import Udemy.Hashing.CollisionResolutionTechniques.OpenAddressing.LinearProbingImplementation.LinearProbing;

public class Main {
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(13);
        qp.insertInHashTable("The");
        qp.insertInHashTable("quick");
        qp.insertInHashTable("brown");
        qp.insertInHashTable("fox");
        qp.insertInHashTable("over");
        qp.insertInHashTable("lazy");
        qp.displayHashTable();
        qp.searchInHashTable("fox");
        qp.deleteKeysHashTable("over");
        qp.displayHashTable();
    }
}
