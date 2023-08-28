public class HabitacionIndividual extends Habitacion{
    /* In this part of the code of this class, we can observe the
      * encapsulation of the information as the type attribute
      * boolean hasOceanView has the access restriction "Private" this for
      * that no method of another class can use these attributes
      * only those of Single Room
     */
    private boolean tieneVistaAlMar;

    /*In this part of the class, we can see that the inheritance exists, that is, SingleRoom
      * inherits the attributes "number" and "pricePerNight" from the Room class and only
      * an attribute "hasOceanView" is added. Also, next to the name of this class
      * there is a keyword "extends" that says it inherits from Room
      */
    public HabitacionIndividual(int numero, double precioPorNoche,int noNoches, boolean tieneVistaAlMar) {
        super(numero, precioPorNoche, noNoches);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean tieneVistaAlMar(){
        return tieneVistaAlMar;
    }

    /* On the other hand, two methods of the parent class are overridden (@Override)
     * one to complement the information of each room and the other to
     * calculate the total cost per number of given nights
     */
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
    }

    @Override
    public void calcularCostos() {
        super.calcularCostos();
    }  
      
}
