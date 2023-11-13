package Lab8;

/**
 * insertTTF extends TwoThreeFourTree to structure the insert, contains, and sorted
 * @author Sweeney and Silas
 * @version 20231113
 */
public class insertTTF<E extends Comparable<E>> extends TwoThreeFourTree<E>{

    /**
     * Public-facing insertion method for new data.
     * Will call the private method with the root as a localRoot
     * @param data Data input for the tree
     */
    @Override
    public void insert(E data) {
        insert((E) this.getRoot(), data);
    }

    /**
     * Private-facing insertion method for recursive insertion
     *
     * @param localRoot working root
     * @param data data to insert
     */
    private void insert(E localRoot, E data){
        if (this.getRoot() == null){
            this.setRoot(new Node<E>(2));
            this.getRoot().data[0] = data;
        }
        else{

        }
    }

    @Override
    public boolean contains(E data) {
        return false;
    }

    @Override
    public E[] getSorted() {
        //return new E[];
        return null;
    }
}
