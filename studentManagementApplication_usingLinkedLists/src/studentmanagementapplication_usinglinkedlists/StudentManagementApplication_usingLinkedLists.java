/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementapplication_usinglinkedlists;

import java.util.Scanner;

/**
 *
 * @author LottricGeneric
 */
public class StudentManagementApplication_usingLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SLList destinationList = new SLList();
        SLList sourceList = new SLList();
        SLList defaultList = new SLList();
        int userOption = 9;
        int snoSearchSyntax = 0;
        String snameSearchSyntax = "defaultStudentName";
        String sexSearchSyntax = "m";
        int ageSearchSyntax = 0;
        while (true) {
            async(sourceList, destinationList);
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new student to the head of the list;");
            System.out.println("2. Add a new student to the tail of the list;");
            System.out.println("3. Remove an existing student from the head of the list;");
            System.out.println("4. Remove an existing student from the tail of the list;");
            System.out.println("5. View all members of the list;");
            System.out.println("6. Check if a student is in the list;");
            System.out.println("7. Enter a student's whole profile and remove it from the list;");
            System.out.println("8. Search by student number;");
            System.out.println("9. Search by student name;");
            System.out.println("10. Search by student sex;");
            System.out.println("11. Search by student age;");
            System.out.println("12. Get the average age;");
            System.out.println("0. Exit.");
            System.out.print("Please enter your option here:");
            userOption = new Scanner(System.in).nextInt();
            switch (userOption) {
                case 1:
                    System.out.print("Please enter the new student's profile:");
                    System.out.println("<StudentNumber>");
                    System.out.print("\t");
                    snoSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentNumber>");
                    System.out.println("<StudentName>");
                    System.out.print("\t");
                    snameSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentName>");
                    System.out.println("<StudentSex>");
                    System.out.print("\t");
                    sexSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentSex>");
                    System.out.println("<StudentAge>");
                    System.out.print("\t");
                    ageSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentAge>");
                    destinationList.addToHead(snoSearchSyntax, snameSearchSyntax, sexSearchSyntax, ageSearchSyntax);
                    break;
                case 2:
                    System.out.print("Please enter the new student's profile:");
                    System.out.println("<StudentNumber>");
                    System.out.print("\t");
                    snoSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentNumber>");
                    System.out.println("<StudentName>");
                    System.out.print("\t");
                    snameSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentName>");
                    System.out.println("<StudentSex>");
                    System.out.print("\t");
                    sexSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentSex>");
                    System.out.println("<StudentAge>");
                    System.out.print("\t");
                    ageSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentAge>");
                    destinationList.addToTail(snoSearchSyntax, snameSearchSyntax, sexSearchSyntax, ageSearchSyntax);
                    break;
                case 3:
                    destinationList.deleteFromHead();
                    break;
                case 4:
                    destinationList.deleteFromTail();
                    break;
                case 5:
                    destinationList.printAll();
                    break;
                case 6:
                    System.out.print("Please enter student's check profile:");
                    System.out.println("<StudentNumber>");
                    System.out.print("\t");
                    snoSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentNumber>");
                    System.out.println("<StudentName>");
                    System.out.print("\t");
                    snameSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentName>");
                    System.out.println("<StudentSex>");
                    System.out.print("\t");
                    sexSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentSex>");
                    System.out.println("<StudentAge>");
                    System.out.print("\t");
                    ageSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentAge>");
                    if (destinationList.isInList(snoSearchSyntax, snameSearchSyntax, sexSearchSyntax, ageSearchSyntax) == true) {
                        System.out.println("The student is in the list.");
                    }
                    else {
                        System.out.println("The student is not in the list.");
                    }
                    break;
                case 7:
                    System.out.print("Please enter the whole profile for verification:");
                    System.out.println("<StudentNumber>");
                    System.out.print("\t");
                    snoSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentNumber>");
                    System.out.println("<StudentName>");
                    System.out.print("\t");
                    snameSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentName>");
                    System.out.println("<StudentSex>");
                    System.out.print("\t");
                    sexSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentSex>");
                    System.out.println("<StudentAge>");
                    System.out.print("\t");
                    ageSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentAge>");
                    destinationList.delete(snoSearchSyntax, snameSearchSyntax, sexSearchSyntax, ageSearchSyntax);
                    break;
                case 8:
                    async(destinationList, defaultList);
                    System.out.println("Please enter your student number search syntax:");
                    snoSearchSyntax = new Scanner(System.in).nextInt();
                    destinationList.searchBySno(destinationList, sourceList, snoSearchSyntax);
                    break;
                case 9:
                    async(destinationList, defaultList);
                    System.out.println("Please enter your student name search syntax:");
                    snameSearchSyntax = new Scanner(System.in).nextLine();
                    destinationList.searchBySname(destinationList, sourceList, snameSearchSyntax);
                    break;
                case 10:
                    async(destinationList, defaultList);
                    System.out.println("Please enter your student sex search syntax:");
                    sexSearchSyntax = new Scanner(System.in).nextLine();
                    destinationList.searchBySex(destinationList, sourceList, sexSearchSyntax);
                    break;
                case 11:
                    async(destinationList, defaultList);
                    System.out.println("Please enter your student age search syntax:");
                    ageSearchSyntax = new Scanner(System.in).nextInt();
                    destinationList.searchByAge(destinationList, sourceList, ageSearchSyntax);
                    break;
                case 12:
                    try {
                        if (sourceList.isEmpty()) {
                            throw new ArithmeticException();
                        }
                    } catch(ArithmeticException ex) {
                        System.out.println("Getting the average age encountered error: " + ex);
                        throw ex;
                    }
                    break;
                default:
                    break;
            }
            if (userOption == 12) {
                System.out.println("<AverageStudentAge>");
                System.out.print("\t");
                System.out.printf("%.0f\n", sourceList.getAverageAge());
                System.out.println("</AverageStudentAge>");
                System.out.println("");
            }
            else if (userOption == 0) {
                break;
            }
            System.out.println("The operation completed successfully.");
        }
        System.out.println("The program has exited successfully.");
        
        
        DLList destinationDoubleList = new DLList();
        DLList sourceDoubleList = new DLList();
        DLList defaultDoubleList = new DLList();
        while (true) {
            async(sourceDoubleList, destinationDoubleList);
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new student to the tail of the list;");
            System.out.println("2. Remove an existing student from the tail of the list;");
            System.out.println("3. Exit.");
            System.out.print("Please enter your option here:");
            userOption = new Scanner(System.in).nextInt();
            switch (userOption) {
                case 1:
                    System.out.print("Please enter the new student's profile:");
                    System.out.println("<StudentNumber>");
                    System.out.print("\t");
                    snoSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentNumber>");
                    System.out.println("<StudentName>");
                    System.out.print("\t");
                    snameSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentName>");
                    System.out.println("<StudentSex>");
                    System.out.print("\t");
                    sexSearchSyntax = new Scanner(System.in).nextLine();
                    System.out.println("</StudentSex>");
                    System.out.println("<StudentAge>");
                    System.out.print("\t");
                    ageSearchSyntax = new Scanner(System.in).nextInt();
                    System.out.println("</StudentAge>");
                    destinationDoubleList.addToTail(snoSearchSyntax, snameSearchSyntax, sexSearchSyntax, ageSearchSyntax);
                    break;
                case 2:
                    destinationDoubleList.removeFromTail();
                    break;
                default:
                    break;
            }
            for (DLLNode tmp = sourceDoubleList.head; tmp != null; tmp = tmp.next) {
                System.out.println("Student Number " + tmp.sno);
                System.out.println("Student Name " + tmp.sname);
                System.out.println("Student Sex " + tmp.sex);
                System.out.println("Student Age " + tmp.age);
                System.out.println("\n");
            }
            if (userOption == 3) {
                break;
            }
            System.out.println("The operation completed successfully.");
        }
        System.out.println("The program has exited successfully.");
    }
    
    public static void async(SLList sourceList, SLList destinationList) {
        SLLNode ele = sourceList.head;
        for (SLLNode tmp = destinationList.head; tmp != null; tmp = tmp.next) {
            if (ele == null) {
                ele = new SLLNode(tmp.sno, tmp.sname, tmp.sex, tmp.age, null);
            }
            else {
                ele = tmp;
            }
            ele = ele.next;
        }
    }
    
    public static void async(DLList sourceDoubleList, DLList destinationDoubleList) {
        DLLNode ele = sourceDoubleList.head;
        for (DLLNode tmp = destinationDoubleList.head; tmp != null; tmp = tmp.next) {
            if (ele == null) {
                ele = new DLLNode(tmp.sno, tmp.sname, tmp.sex, tmp.age, null, ele);
            }
            else {
                ele = tmp;
            }
            ele = ele.next;
        }
    }
}
