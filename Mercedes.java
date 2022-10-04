    public class Mercedes {
        String name;
        String color;
        String ignitions;
        boolean ignition;

    public Mercedes( String name, String ignition, String color) {
        this.name = name;
        this.color = color;
        this. ignitions = ignition;
        this.ignition = true;


    }
    public String toString(){

        return "car: " + name + " ignitions: " + ignitions + " color: " + color;
    }

    public boolean isIgnition() {
        if(ignition){
            ignition=false;

            if (ignition) {
                ignition = true;
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }

    public String oil(){
        return name + "Oil";
    }

    public String control(){
        return "control: clutch, gas, brake";
    }
}
