import java.time.LocalDate;

public class Vehicle {
    private final String model;
    private boolean engine;
    private boolean brakes;
    private boolean suspension;

    private LocalDate approved_vtv_date;

    public boolean getEngine() {
        return engine;
    }

    public boolean getBrakes() {
        return brakes;
    }

    public boolean getSuspension() {
        return suspension;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
        revision_check();
    }

    public void setBrakes(boolean brakes) {
        this.brakes = brakes;
        revision_check();
    }

    public void setSuspension(boolean suspension) {
        this.suspension = suspension;
        revision_check();
    }

    public void revision_check(){
        if (engine && brakes && suspension){
            this.approved_vtv_date = LocalDate.now();
        }
        if (!this.engine){
            System.out.println(this.model + ": Engine must be repaired");
        }
        if (!this.brakes){
            System.out.println(this.model + ": Brakes must be repaired");
        }
        if (!this.suspension){
            System.out.println(this.model + ": Suspension must be repaired");
        }
    }

    public Vehicle(String model, boolean engine, boolean brakes, boolean suspension) {
        this.model = model;
        this.engine = engine;
        this.brakes = brakes;
        this.suspension = suspension;

        revision_check();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                ", brakes=" + brakes +
                ", suspension=" + suspension +
                ", approved_vtv_date=" + approved_vtv_date +
                '}';
    }
}
