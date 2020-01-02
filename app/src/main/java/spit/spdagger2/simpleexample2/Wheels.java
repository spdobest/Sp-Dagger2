package spit.spdagger2.simpleexample2;

import javax.inject.Inject;

public class Wheels {

    // we dont own this class, it is provided by the third party libraries
    // we can not use @Inject to this class

   /* @Inject
    public Wheels() {

    }*/

   private Rims rims;
   private Tyres tyres;

   public Wheels(Rims rims,Tyres tyres){
       this.rims = rims;
       this.tyres = tyres;
   }

}