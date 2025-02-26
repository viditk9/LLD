package src.DesignDataStructures.HashMap;

public class MyHashMap<K,V> {

    private static final int  INITIAL_SIZE = 1<<4; //16
    private static final int MAXIMUM_CAPACITY = 1 << 30;


    Entry[] hashTable;
    MyHashMap() {
        hashTable = new Entry[INITIAL_SIZE];
    }
    MyHashMap(int cap) {
        int totalCapacity = getCapacity(cap);
        hashTable = new Entry[INITIAL_SIZE];
    }

    int getCapacity(int cap) {
        int n = cap-1;
        n = n | (n>>>1);
        n = n | (n>>>2);
        n = n | (n>>>4);
        n = n | (n>>>8);
        n = n | (n>>>16);
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public void put(K key, V val) {
        int hashCode = key.hashCode() % hashTable.length;
        Entry node = hashTable[hashCode];

        if(node==null) {
            hashTable[hashCode] = new Entry(key,val);
        } else {
            Entry prevNode = node;
            while(node!=null) {
                if(node.getKey()==key) {
                    node.setVal(val);
                    return;
                } else {
                    prevNode = node;
                    node = node.next;
                }
            }
            prevNode.next = new Entry(key,val);
        }
    }

    public V get(K key) {
        int hashCode = key.hashCode()%hashTable.length;
        Entry node = hashTable[hashCode];

        while(node!=null) {
            if(node.getKey()==key) {
                return (V)node.getVal();
            } else {
                node = node.next;
            }
        }
        return null;
    }
}
