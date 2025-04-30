    /**
     * child class of the main parent TV has functions like provider, show and season
     * @author Sarveshwaran Rajaraman
     */


public class Entertainment extends Tv {
    private String Provider;
    private String Show;
    private int Season;
    /**
     * 
     * @param Brand from tv
     * @param Model from tv
     * @param Size  from tv
     * @param Year  from tv
     * @param Provider Service providers like netflix
     * @param Show  Shows
     * @param Season    Seasons
     */

    public Entertainment(String Brand, String Model, int Size, int Year,String Provider, String Show, int Season) {
        super(Brand, Model, Size, Year);
    this.Provider = Provider;
    this.Show = Show;
    this.Season = Season;
    }
    /**
     * Default constructor that has set unknown values as placeholders
     */
    public Entertainment(){
        super("Unknown","Unknown",0,0); // size set to 0 as a place holder and its in int
        this.Provider = "Netflix";
        this.Show = "Suits";
        this.Season = 6;
    }
    /**
     * Plays show
     */
    public void play(){
        System.out.println("Your show is playing");
    }
    /**
     * Pauses show
     */
    public void pause(){
        System.out.println("Show has been paused, Press play to continue/resume");
    }
    /**
     * Skips Episode 
     */
    public void skip(){
        System.out.println("Episode skipped!");

    }
    /**
     * @return  Service provider
     */
    public String getProvider(){
        return Provider;
    }
    /**
     * @return Show
     */
    public String getShow(){
        return Show;

    }
    /**
     * @return Season
     */
    public int getSeason(){
        return Season;
    }

}
