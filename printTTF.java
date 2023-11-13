package Lab8;

import java.util.Comparator;

/**Extends the class TwoThreeFourTree and implements the
 * getSorted method that returns the items in the tree,
 * sorted from the smallest to the largest
 *
 * @author abigail pitcairn
 * @version 13 november 2023
 */

public class printTTF extends TwoThreeFourTree {

    /**Sort the elements in a TwoThreeFourTree into an array
     * from smallest to largest item
     *
     * @return array of elements from TwoThreeFourTree sorted
     * smallest to largest
     */
    public E[] getSorted() {
        E[] array = new E[TwoThreeFourTree.size];
        int j = 0;
        for (int i = 0; i < TwoThreeFourTree.children.length; ++i) {
            for (int k = 1; k < TwoThreeFourTree.children.length; ++k) {
                E next = TwoThreeFourTree.data[i];
                E current = TwoThreeFourTree.data[k];
                if (current.comapreTo(next) < 0) {
                    array[j] = current;
                    j++;
                }
            }
        }
        return array;
    }

}
