public class InternetContract extends Contract {
    private Double trafficSpeed;

    public InternetContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, Double trafficSpeed) {
        super(id, dateBegin, dateEnd, number, owner);
        this.trafficSpeed = trafficSpeed;
    }
}
