package core;

import core.classandobjects.InheritanceConcept;
import core.classandobjects.PolymorphismConcept;
import core.datastructure.Datastructures;

public class Core {
  public static void initCore() {
    // Datastructures.init();
    InheritanceConcept obj = new InheritanceConcept();
    // System.out.println("Inherit method from parent: " +
    // obj.parentWelcomingManner());
    // System.out.println("Inherit loop printing behaviour:");
    // obj.printInvertedPyramid();
    // System.out.println("Inherit loop of half pyramid");
    // obj.printHalfPyramid();

    // System.out.println("Experimenting with protected method");
    // obj.accessingProtectedFromParentclass();
    //
    // obj.callingOtherClass();

    PolymorphismConcept pobj = new PolymorphismConcept();
    pobj.init();
  }

}
