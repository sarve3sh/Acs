public enum Garage { // Garage.java

MERCEDES(1926,196.56), //they are in billions

MCLAREN(1963,2.03),

FORD(1903,249.75),

TOYOTA(1937,420.12),

HYUNDAI(1967,164.84),

JAGUAR(1922,49.28),

FERRARI(1939,9.02),

MGMOTOR(1924,3.38),

LADA(1966,4.05),

BUGATTI(1909,0.68);

private  double year;
private double revenue;

Garage(double year, double revenue){
    this.year = year;
    this.revenue = revenue;
    
}
public double getYear(){
    return year;
}
public double getRevenue(){
    return revenue;
}

}
