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
public class DLLNode {
    public int sno;
    public String sname;
    public String sex;
    public int age;
    public DLLNode next, prev;
    public DLLNode(int elsno, String elsname, String elsex, int elage) {
        this(elsno, elsname, elsex, elage, null, null);
    }
    
    public DLLNode(int elsno, String elsname, String elsex, int elage, DLLNode n, DLLNode p) {
        sno = elsno;
        sname = elsname;
        sex = elsex;
        age = elage;
        next = n;
        prev = p;
    }
}
