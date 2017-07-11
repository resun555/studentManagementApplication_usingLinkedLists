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
public class SLLNode {
    public int sno;
    public String sname;
    public String sex;
    public int age;
    public SLLNode next;
    public SLLNode(int isno, String isname, String isex, int iage) {
        this(isno, isname, isex, iage, null);
    }
    
    public SLLNode(int isno, String isname, String isex, int iage, SLLNode n) {
        sno = isno;
        sname = isname;
        sex = isex;
        age = iage;
        next = n;
    }
}
