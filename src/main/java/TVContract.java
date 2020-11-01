public class TVContract extends Contract {
    private String channelsPackage;

    public TVContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, String channelsPackage) {
        super(id, dateBegin, dateEnd, number, owner);
        this.channelsPackage = channelsPackage;
    }
}
