public class TVContract extends Contract {
    private String channelsPackage;

    /**
     * Constructor of TVContract
     * @param id unique identifier of each Contract
     * @param dateBegin date when Contract starts in String format written using pattern "dd.MM.yyyy"
     * @param dateEnd date when Contract ends in String format written using pattern "dd.MM.yyyy"
     * @param number number of each Contract
     * @param owner Contract's owner
     * @param channelsPackage name of channels package that connected in this TVContract
     */
    public TVContract(Integer id, String dateBegin, String dateEnd, String number, Client owner, String channelsPackage) {
        super(id, dateBegin, dateEnd, number, owner);
        this.channelsPackage = channelsPackage;
    }
}
