public class Containers {
    private static final int max_containers_capacity = 7;

    private String type;
    private int max_specific_capacity;
    private float current_capacity;
    public Laundry_program program;


    public Containers(){
        max_specific_capacity = max_containers_capacity;
        current_capacity = 0;
        type = "";
        program = new Laundry_program();
    }

    public Containers(String type, int max_specific_capacity, float current_capacity, Laundry_program program) {
        this.max_specific_capacity = max_specific_capacity;
        this.current_capacity = current_capacity;
        this.type = type;
        this.program = program;
    }

    public Containers(String type, Laundry_program program){
        this.type = type;
        max_specific_capacity = max_containers_capacity;
        current_capacity = 0;
        this.program = program;

    }

public void print_details(){
        System.out.println( "Laundry type: " + type +
                ", max capacity: " + max_specific_capacity + "kg, " +
                "current capacity: " + current_capacity + "kg, ");
        program.print_details();
}
    public float getCurrent_capacity() {
        return current_capacity;
    }

    public void setCurrent_capacity(float current_capacity) {
        this.current_capacity = current_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Laundry_program getProgram() {
        return program;
    }

    /*public void setProgram(Laundry_program program) {
        this.program.setRpm(program.getRpm());
        this.program.setTemperature(program.getTemperature());
        this.program.setTime(program.getTime());

    }*/

    public void setProgram(Laundry_program program) {
        this.program = program;
    }

    public int getMax_specific_capacity() {
        return max_specific_capacity;
    }

    public void setMax_specific_capacity(int max_specific_capacity) {
        this.max_specific_capacity = max_specific_capacity;
    }
}
