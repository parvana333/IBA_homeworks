package homework7;

public abstract class Pet {
     abstract  void eat();
     abstract void respond();
     Species species;

     public void setSpecies(Species species) {
          this.species = species;
     }

     public Species getSpecies() {
          return species;
     }

     @Override
     public String toString() {
          return "" +
                  "" + getSpecies()
                  ;
     }
}
