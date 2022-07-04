public enum Statuses{
    ZERO("Rejected"),
    ONE("Pending"),
    TWO("Processing"),
    THREE("Approved"),
    Four("Not Valid Code");
    

    private String status;

    private Statuses(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}