public class Laundry {
    private String type;
    private float weight;


    public Laundry(){
        type="";
        weight=0;
    }

    public Laundry(String type, float weight){
        this.type = type;
        this.weight=weight;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == "color" ||
        type == "white" ||
        type == "delicate" ||
        type == "other") {
            this.type = type;
        }
        else {
            System.out.println("Not valid, please try again.");
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight <= 0){
            System.out.println("Not valid, please try again.");
        }
        this.weight = weight;
    }
}
