import java.util.Scanner;
public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookId[] = new int[100];
        String bookName[] = new String[100];
        String author[] = new String[100];
        String category[] = new String[100];
        int count = 0;
        int choice = 0;

        while(choice != 4){
            System.out.println("\n==============================================================");
            System.out.println("                     MINI LIBRARY SYSTEM");
            System.out.println("==============================================================");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
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

                    count++;
                    System.out.println("\nBook Added Successfully!");
                    break;
                case 2://view books.
                    if(count == 0){
                        System.out.println("No Books Found!");
                        break;
                    }
                    System.out.println("\n================================================================================================");
                    System.out.printf("%-8s %-25s %-20s %-18s\n","ID","Book Name","Author","Category");
                    System.out.println("================================================================================================");
                    i = 0;
                    while(i < count){
                        System.out.printf("%-8d %-25s %-20s %-18s\n",bookId[i],bookName[i],author[i],category[i]);
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
                case 4://exit
                    System.out.println("\nThank You for Using Mini Library System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
        sc.close();
    }
}