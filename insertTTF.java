package Lab8;

public class insertTTF extends TwoThreeFourTree{

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


}
