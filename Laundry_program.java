public class Laundry_program {
    private int rpm;
    private int degrees;
    int minuets;

    public Laundry_program(){
        rpm = 0;
        degrees = 0;
        minuets = 0;
    }

    public Laundry_program(int rpm, int degrees, int minuets){
        this.rpm = rpm;
        this.degrees = degrees;
        this.minuets = minuets;
    }

    public void print_details(){
        System.out.println("Program Details: " + rpm + " rpm, " +
                degrees + " degrees, "+
               minuets + " minuets." );
    }
    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;

    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public int getMinuets() {
        return minuets;
    }

    public void setMinuets(int minuets) {
        this.minuets = minuets;
    }
}


