import java.util.Scanner;
public class LibraryManagementSystem {
    static String getStatus(boolean issued){//check return book status.
        if(issued)
            return "Issued";
        else
            return "Available";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookId[] = new int[100];
        String bookName[] = new String[100];
        String author[] = new String[100];
        String category[] = new String[100];
        boolean issued[] = new boolean[100];
        int count = 0;
        int choice = 0;

        while(choice != 7){
            System.out.println("\n==============================================================");
            System.out.println("               LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==============================================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Library Summary");
            System.out.println("7. Exit");
            System.out.println("==============================================================");
            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1://add book.
                    if(count == 100){
                        System.out.println("Library is Full!");
                        break;
                    }
                    System.out.print("Enter Book ID : ");
                    int newBookId = sc.nextInt();
                    int i = 0;
                    boolean exists = false;
                    while(i < count){
                        if(bookId[i] == newBookId){
                            exists = true;
                            break;
                        }
                        i++;
                    }
                    if(exists){
                        System.out.println("Book ID Already Exists!");
                        break;
                    }
                    bookId[count] = newBookId;
                    sc.nextLine();
                    System.out.print("Enter Book Name : ");
                    bookName[count] = sc.nextLine();
                    System.out.print("Enter Author Name : ");
                    author[count] = sc.nextLine();
                    System.out.print("Enter Book Category : ");
                    category[count] = sc.nextLine();

                    issued[count] = false;
                    count++;
                    System.out.println("\nBook Added Successfully!");
                    break;
                case 2://view books.
                    if(count == 0){
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.println("\n================================================================================================");
                    System.out.printf("%-8s %-25s %-20s %-18s %-12s\n","ID","Book Name","Author","Category","Status");
                    System.out.println("================================================================================================");
                    i = 0;
                    while(i < count){
                        System.out.printf("%-8d %-25s %-20s %-18s %-12s\n",bookId[i],bookName[i],author[i],category[i],getStatus(issued[i]));
                        i++;
                    }
                    System.out.println("================================================================================================");
                    System.out.println("Total Books : " + count);
                    break;
                case 3://search book.
                    if(count == 0){
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.print("Enter Book ID : ");
                    int searchId = sc.nextInt();
                    i = 0;
                    boolean found = false;
                    while(i < count){
                        if(bookId[i] == searchId){
                            System.out.println("\n==============================================");
                            System.out.println("              BOOK DETAILS");
                            System.out.println("==============================================");
                            System.out.println("Book ID      : " + bookId[i]);
                            System.out.println("Book Name    : " + bookName[i]);
                            System.out.println("Author       : " + author[i]);
                            System.out.println("Category     : " + category[i]);
                            System.out.println("Status       : " + getStatus(issued[i]));
                            System.out.println("==============================================");

                            found = true;
                            break;
                        }
                        i++;
                    }
                    if(!found){
                        System.out.println("Book Not Found!");
                    }
                    break;
                case 4://issue book.
                    if(count == 0){
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.print("Enter Book ID : ");
                    int issueId = sc.nextInt();
                    i = 0;
                    boolean issuedBook = false;
                    while(i < count){
                        if(bookId[i] == issueId){
                            if(issued[i]){
                                System.out.println("Book is Already Issued!");
                            }
                            else{
                                issued[i] = true;
                                System.out.println("Book Issued Successfully!");
                            }

                            issuedBook = true;
                            break;
                        }
                        i++;
                    }
                    if(!issuedBook){
                        System.out.println("Book Not Found!");
                    }
                    break;
                case 5://return book.
                    if(count == 0){
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.print("Enter Book ID : ");
                    int returnId = sc.nextInt();
                    i = 0;
                    boolean returned = false;
                    while(i < count){
                        if(bookId[i] == returnId){
                            if(!issued[i]){
                                System.out.println("Book is Already Available!");
                            }
                            else{
                                issued[i] = false;
                                System.out.println("Book Returned Successfully!");
                            }
                            returned = true;
                            break;
                        }
                        i++;
                    }
                    if(!returned){
                        System.out.println("Book Not Found!");
                    }
                    break;
                case 6://library summary.
                    if(count == 0){
                        System.out.println("No Books Found!");
                        break;
                    }
                    int availableBooks = 0;
                    int issuedBooks = 0;
                    i = 0;
                    while(i < count){
                        if(issued[i])
                            issuedBooks++;
                        else
                            availableBooks++;

                        i++;
                    }
                    System.out.println("\n========================================");
                    System.out.println("           LIBRARY SUMMARY");
                    System.out.println("========================================");
                    System.out.println("Total Books      : " + count);
                    System.out.println("Available Books  : " + availableBooks);
                    System.out.println("Issued Books     : " + issuedBooks);
                    System.out.println("========================================");
                    break;
                case 7://exit
                    System.out.println("\nThank You for Using Library Management System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}