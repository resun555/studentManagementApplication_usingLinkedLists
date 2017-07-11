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
public class SLList {
    protected SLLNode head, tail;
    public SLList() {
        head = tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    
    public void addToHead(int elsno, String elsname, String elsex, int elage) {
        head = new SLLNode(elsno, elsname, elsex, elage, head);
        if (tail == null) {
            tail = head;
        }
    }
    
    public void addToTail(int elsno, String elsname, String elsex, int elage) {
        if (!isEmpty()) {
            tail.next = new SLLNode(elsno, elsname, elsex, elage);
            tail = tail.next;
        }
        else {
            head = tail = new SLLNode(elsno, elsname, elsex, elage);
        }
    }
    
    public int deleteFromHead() {
        int elsno = head.sno;
        if (head == tail) {
            head = tail = null;
        }
        else {
            head = head.next;
        }
        return elsno;
    }
    
    public int deleteFromTail() {
        int elsno = tail.sno;
        if (head == tail) {
            head = tail = null;
        }
        else {
            SLLNode tmp;
            for (tmp = head; tmp.next != tail; tmp = tmp.next) {
            }
            tail = tmp;
            tail.next = null;
        }
        return elsno;
    }
    
    public void printAll() {
        for (SLLNode tmp = head; tmp != null; tmp = tmp.next) {
            System.out.println("Student Number " + tmp.sno);
            System.out.println("Student Name " + tmp.sname);
            System.out.println("Student Sex " + tmp.sex);
            System.out.println("Student Age " + tmp.age);
            System.out.println("\n");
        }
    }
    
    public boolean isInList(int elsno, String elsname, String elsex, int elage) {
        SLLNode tmp;
        for (tmp = head; tmp != null && tmp.sno != elsno && !tmp.sname.equals(elsname) && !tmp.sex.equals(elsex) && tmp.age != elage; tmp = tmp.next) {
        }
        return tmp != null;
    }
    
    public void delete(int elsno, String elsname, String elsex, int elage) {
        if (!isEmpty()) {
            if (elsno == head.sno && elsname.equals(head.sname) && elsex.equals(head.sex) && elage == head.age) {
                if (head == tail) {
                    head = tail = null;
                }
                else {
                    head = head.next;
                }
            }
            else {
                SLLNode pred, tmp;
                for (pred = head, tmp = head.next; tmp != null && tmp.sno != elsno && !tmp.sname.equals(elsname) && !tmp.sex.equals(elsex) && tmp.age != elage; pred = pred.next, tmp = tmp.next) {
                }
                if (tmp != null) {
                    pred.next = tmp.next;
                    if (tmp == tail) {
                        tail = pred;
                    }
                }
            }
        }
    }
    
    public void searchBySno(SLList destinationList, SLList sourceList, int snoSearchSyntax) {
        SLLNode ele = destinationList.head;
        for (SLLNode tmp = sourceList.head; tmp != null; tmp = tmp.next) {
            if (snoSearchSyntax == tmp.sno) {
                if (ele == null) {
                    ele = new SLLNode(tmp.sno, tmp.sname, tmp.sex, tmp.age, null);
                }
                else {
                    ele = tmp;
                }
                ele = ele.next;
            }
        }
    }
    
    public void searchBySname(SLList destinationList, SLList sourceList, String snameSearchSyntax) {
        SLLNode ele = destinationList.head;
        for (SLLNode tmp = sourceList.head; tmp != null; tmp = tmp.next) {
            if (snameSearchSyntax.equals(tmp.sname)) {
                if (ele == null) {
                    ele = new SLLNode(tmp.sno, tmp.sname, tmp.sex, tmp.age, null);
                }
                else {
                    ele = tmp;
                }
                ele = ele.next;
            }
        }
    }
    
    public void searchBySex(SLList destinationList, SLList sourceList, String sexSearchSyntax) {
        SLLNode ele = destinationList.head;
        for (SLLNode tmp = sourceList.head; tmp != null; tmp = tmp.next) {
            if (sexSearchSyntax.equals(tmp.sex)) {
                if (ele == null) {
                    ele = new SLLNode(tmp.sno, tmp.sname, tmp.sex, tmp.age, null);
                }
                else {
                    ele = tmp;
                }
                ele = ele.next;
            }
        }
    }
    
    public void searchByAge(SLList destinationList, SLList sourceList, int ageSearchSyntax) {
        SLLNode ele = destinationList.head;
        for (SLLNode tmp = sourceList.head; tmp != null; tmp = tmp.next) {
            if (ageSearchSyntax == tmp.age) {
                if (ele == null) {
                    ele = new SLLNode(tmp.sno, tmp.sname, tmp.sex, tmp.age, null);
                }
                else {
                    ele = tmp;
                }
                ele = ele.next;
            }
        }
    }

    public double getAverageAge() {
        double averageAge = 0.0;
        int size = 0;
        for (SLLNode tmp = head; tmp != null; tmp = tmp.next) {
            averageAge += tmp.age;
            size++;
        }
        try {
            averageAge /= size;
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            averageAge = Double.NaN;
            throw ex;
        }
        return averageAge;
    }
}
