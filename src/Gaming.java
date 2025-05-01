

/**
     * One of the extended class from TV
     * the gaming class is for gaming purposes as the name suggests, it has additional features
     * like console, game and number of controller (like yk how most people have 2 contorllers so this
     * is to see if they are connected to controller 1 or controller 2)
     * @author Sarveshwaran Rajaraman
     */
public class Gaming extends Tv {
    private String Console;
    private String Game;
    private int Controller;
    /**
     * 
     * @param Brand Brand of the Tv like samsung
     * @param Model Model of the Tv like NEO qled
     * @param Size Size like it says 75"
     * @param Year  Year of manufacture
     * @param Console Name of the Console like xbox or playstation
     * @param Game  Name of the game
     * @param Controller    Controller number
     */
    public Gaming(String Brand, String Model, int Size, int Year, String Console, String Game, int Controller) {
        super(Brand, Model, Size, Year);
    this.Console=Console;
    this.Game=Game;
    this.Controller = Controller;
    }
    /**
     * Default constructor that has place holder values like unkown and 0.
     */
public Gaming(){
    super("Unknown", "Unkown", 0, 0);
    this.Console="Playstation";
    this.Game="God Of War-Ragnarok";
    this.Controller = 1;
}
/**
 * Connects Console.
 */
public void connect(){
    System.out.println("Your Playstation has now been connected");
}
/**
 * Starts Game.
 */
public void start(){
    System.out.println("Begin");
}
/**
 * Opens Menu.
 */
public void menu(){
    System.out.println("Menu:");
}
/**
 * @return Console
 */
public String getConsole(){
    return Console;
}
/**
 * @return Game
 */
public String getGame(){
    return Game;
}
/**
 * @return Controller
 */
public int getController(){
    return Controller;
}




}
