public class ContractRepository {
    private Contract[] array;
    private int last;

    public ContractRepository(){
        this.array = new Contract[50];
        this.last = -1;
    }

    public void addContract(Contract contract){
        if(last+1>=array.length) extendArray();
            array[last + 1] = contract;
            last++;
    }

    private void extendArray(){
        //System.out.println("Extended");
        Contract[] newArray = new Contract[array.length+50];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public Contract getContractById(int id){
        Contract c = null;
        int pos = getPositionById(id);
        if (pos == -1) return null;  else return array[pos];
    }

    private int getPositionById(int id){
        for (int i =0; i<=last; i++){
            if(array[i].getId()==id) {
                return i;
            }
        }
        return -1;
    }

    public void removeById(int id){  //TODO TESTS BORDER
        int pos = getPositionById(id);
        if(pos!=-1) {
            for (int i = pos; i <= last; i++) {
                System.out.println("moved");
                array[i] = array[i + 1];
            }
            last--;
        }
    }

    public int getSize(){
        return last+1;
    }


}
