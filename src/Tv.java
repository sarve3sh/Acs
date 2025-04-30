    /**
     * Main parent class (tv)
     *@author Sarveshwaran Rajaraman
     *it has stuff like the brand name,model, size of the tv and the year it was produced.
     */

public class Tv {
    String Brand;
    String Model;
    int Size;
    int Year;
    /**
     * These are the Parent instance variables so they show in the other 2 classes.
     * @param Brand 
     * @param Model
     * @param Size
     * @param Year
     */

    public Tv(String Brand, String Model, int Size, int Year) {
        this.Brand = Brand;
        this.Model = Model;
        this.Size = Size;
        this.Year = Year;

    }
    /**
     * turns on tv 
     */

    public void TurnOn() {
        System.out.println("The TV has been turned on!");
    }
    /**
     * turns off tv
     */
    public void TurnOff() {
        System.out.println("The Tv has been turned off!");
    }
    /**
     * Tv set to sleep
     */
    public void Sleep() {
        System.out.println("The Tv is now alseep");

    }
    /**
     * returns brand
     * @return Brand
     */
    public String getBrand(){
        return Brand;
    }
    /**
     * returns model
     * @return Model
     */
    public String getModel(){
        return Model;
    }
    /**
     * returns size
     * @return Size
     */
    public int Size(){
        return Size;
    }
    /**
     * returns year
     * @return Year
     */
    public int Year(){
        return Year;
    }

}
