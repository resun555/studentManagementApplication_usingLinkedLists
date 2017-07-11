/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementapplication_usinglinkedlists;

/**
 *
 * @author LottricGeneric
 */
public class DLList {
    public DLLNode head, tail;
    public DLList() {
        head = tail = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addToTail(int elsno, String elsname, String elsex, int elage) {
        if (!isEmpty()) {
            tail = new DLLNode(elsno, elsname, elsex, elage, null, tail);
            tail.prev.next = tail;
        }
        else {
            head = tail = new DLLNode(elsno, elsname, elsex, elage);
        }
    }
    
    public int removeFromTail() {
        int elsno = tail.sno;
        if (head == tail) {
            head = tail = null;
        }
        else {
            tail = tail.prev;
            tail.next = null;
        }
        return elsno;
    }
}
