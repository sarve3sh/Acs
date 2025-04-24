public enum Garage { 

MERCEDES(2019,450,"Lewis Hamilton","W11"), // 4 constants are: Best performing year
                                                                    // amount spent in millions
MCLAREN(1988,300,"Ayrton Senna","MP4/4"),  // Best driver
                                                                    // Best car
ASTONMARTIN(2021,150,"Sebastian Vettel","AMR23"),

ALPINE(2005,150,"Fernando Alonso","R25"),

ALFAROMEO(1994,150,"Kimi Räikkönen","C24"),

ALPHATAURI(2008,100,"Sebastian Vettel","STR3"),

FERRARI(2004,500,"Michael Schumacher","F2004"),

REDBULL(2023,300,"Sebastian Vettel","RB19"),

HAAS(2018,100,"Romain Grosjean","VF-18"),

WILLIAMS(1992,130,"Nigel Mansel","FW14B");

private  double year;
private double spending;
private String driver;
private String car;

Garage(double year, double spending, String driver, String car ){
    this.year = year;
    this.spending = spending;
    this.driver = driver;
    this.car = car;
}
public double getYear(){
    return year;
}
public double getSpending(){
    return spending;
}
public String getDriver(){
    return driver;
}
public String getCar(){
    return car;
}
}
