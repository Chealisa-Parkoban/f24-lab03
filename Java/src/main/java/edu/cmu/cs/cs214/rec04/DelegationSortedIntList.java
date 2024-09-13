package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {

    private SortedIntList list;
    // totalAdded is a field to keep track of the total number of additions
    private int totalAdded = 0;

    public DelegationSortedIntList() {
        list = new SortedIntList();
    }

    @Override
    public boolean add(int num) {
        boolean success = list.add(num);
        if (success) {
            totalAdded++;
        }
        return success;
    }

    @Override
    public boolean addAll(IntegerList list) {
        boolean success = this.list.addAll(list);
        if (success) {
            totalAdded += list.size();
        }
        return success;
    }

    @Override
    public int get(int index) {
        return list.get(index);
    }

    @Override
    public boolean remove(int num) {
        boolean success = list.remove(num);
        if (success) {
            totalAdded--;
        }
        return success;
    }

    @Override
    public boolean removeAll(IntegerList list) {
        boolean success = this.list.removeAll(list);
        if (success) {
            totalAdded -= list.size();
        }
        return success;
    }

    @Override
    public int size() {
        return list.size();
    }
    // Write your implementation below with API documentation

    public int getTotalAdded() {
        return totalAdded;
    }

}