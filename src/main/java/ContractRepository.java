import models.Contract;

/**
 * Special repository that can keep Contracts
 */
public class ContractRepository {
    private Contract[] array;
    private int last;

    /**
     * Constructor that creates repository
     */
    public ContractRepository(){
        this.array = new Contract[0];
        this.last = -1;
    }

    /**
     * Method that adds new models.Contract to repository
     * @param contract models.Contract that must be added
     */
    public void addContract(Contract contract){
        if(last+1>=array.length) extendArray();
            array[++last] = contract;
    }

    /**
     * Method that extends repository's size
     */
    private void extendArray(){
        //System.out.println("Extended");
        Contract[] newArray = new Contract[array.length+50];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    /**
     * Method that searches models.Contract in repository
     * @param id Searching models.Contract's id
     * @return models.Contract if found or null
     */
    public Contract getContractById(int id){
        int pos = getPositionById(id);
        if (pos == -1) return null;  else return array[pos];
    }

    /**
     * Method for getting models.Contract's position in repository by id
     * @param id Searching models.Contract's id
     * @return position in repository or -1 if not found
     */
    private int getPositionById(int id){
        for (int i =0; i<=last; i++){
            if(array[i].getId()==id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Method removes models.Contract from repository by id
     * @param id Removing models.Contract's id
     */
    public void removeById(int id){
        int pos = getPositionById(id);
        if(pos!=-1) {
            //System.out.println("moved");
            if (last + 1 - pos >= 0) System.arraycopy(array, pos + 1, array, pos, last + 1 - pos);
            last--;
        }
    }

    /**
     * Method gets current repository's size
     * @return Repository's size
     */
    public int getSize(){
        return last+1;
    }


}
