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
        this.array = new Contract[50];
        this.last = -1;
    }

    /**
     * Method that adds new Contract to repository
     * @param contract Contract that must be added
     */
    public void addContract(Contract contract){
        if(last+1>=array.length) extendArray();
            array[last + 1] = contract;
            last++;
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
     * Method that searches Contract in repository
     * @param id Searching Contract's id
     * @return Contract if found or null
     */
    public Contract getContractById(int id){
        Contract c = null;
        int pos = getPositionById(id);
        if (pos == -1) return null;  else return array[pos];
    }

    /**
     * Method for getting Contract's position in repository by id
     * @param id Searching Contract's id
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
     * Method removes Contract from repository by id
     * @param id Removing Contract's id
     */
    public void removeById(int id){  //TODO TESTS BORDER
        int pos = getPositionById(id);
        if(pos!=-1) {
            for (int i = pos; i <= last; i++) {
                //System.out.println("moved");
                array[i] = array[i + 1];
            }
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
