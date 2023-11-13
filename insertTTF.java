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

//Helper method
//If a 4-Node is encountered while searching for the insertion point, split
//Split the 3 node portion and put 4th node as insertion next
public void split(Node[] NODE, Node toBeInserted) {
    Node M = NODE[1];  
    Node[] newArray = {M};
    temp.left = Node[] {NODE[0]};
    temp.right = Node[] {NODE[2]};
    if(NODE.equals(root)) {
     root = newArray;
    }
    else {
    //insert M into parent class
    insert(M);
    }
    insert(toBeInserted);
    

}
