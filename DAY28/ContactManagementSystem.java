import java.util.Scanner;
public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String names[] = new String[100];
        String phones[] = new String[100];
        String emails[] = new String[100];
        String categories[] = new String[100];
        boolean favourites[] = new boolean[100];
        int count = 0;
        int choice = 0;

        while(choice != 10){
            System.out.println("\n===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Search Contact by Phone");
            System.out.println("5. Update Contact");
            System.out.println("6. Delete Contact");
            System.out.println("7. Mark Favourite");
            System.out.println("8. View Favourite Contacts");
            System.out.println("9. Sort Contacts");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    if(count == 100){
                        System.out.println("Contact list is full!!");
                        break;
                    }
                    System.out.print("Enter Phone Number : ");
                    String phone = sc.nextLine();
                    boolean duplicate = false;
                    for(int i = 0;i < count;i++){
                        if(phones[i].equals(phone)){
                            duplicate = true;
                            break;
                        }
                    }
                    if(duplicate){
                        System.out.println("Phone Number Already Exisits!!");
                        break;
                    }
                    phones[count] = phone;
                    System.out.print("Enter Name : ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter Email : ");
                    emails[count] = sc.nextLine();
                    System.out.print("Enter Category (Family/Friend/Office/College/Others): ");
                    categories[count] = sc.nextLine();
                    favourites[count] = false;
                    count++;
                    System.out.println("Contact Added Successfully !");
                    break;
                case 2:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.println("\n----- CONTACT LIST -----");
                    for(int i = 0;i < count;i++){
                        System.out.println("Contact " + (i + 1));
                        System.out.println("Name : " + names[i]);
                        System.out.println("Phone : " + phones[i]);
                        System.out.println("Email : " + emails[i]);
                        System.out.println("Category : " + categories[i]);
                        System.out.println("Favourite : " + (favourites[i] ? "Yes" : "No"));
                        System.out.println();
                    }
                    break;
                case 3:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.print("Enter Name To Search : ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for(int i = 0;i < count;i++){
                        if(names[i].equalsIgnoreCase(searchName)){
                            System.out.println("Name : " + names[i]);
                            System.out.println("Phone : " + phones[i]);
                            System.out.println("Email : " + emails[i]);
                            System.out.println("Category : " + categories[i]);
                            System.out.println("Favourite : " + (favourites[i] ? "Yes" : "No"));
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Contact Not Found!!");
                    }
                    break;
                case 4:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.print("Enter Phone Number To Search : ");
                    String searchPhone = sc.nextLine();
                    found = false;
                    for(int i = 0;i < count;i++){
                        if(phones[i].equals(searchPhone)){
                            System.out.println("Name : " + names[i]);
                            System.out.println("Phone : " + phones[i]);
                            System.out.println("Email : " + emails[i]);
                            System.out.println("Category : " + categories[i]);
                            System.out.println("Favourite : " + (favourites[i] ? "Yes" : "No"));
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Contact Not Found!!");
                    }
                    break;
                case 5:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.print("Enter Name To Update : ");
                    String updateName = sc.nextLine();
                    boolean updated = false;
                    for(int i = 0;i < count;i++){
                        if(names[i].equalsIgnoreCase(updateName)){
                            System.out.print("Enter New Name : ");
                            names[i] = sc.nextLine();
                            System.out.print("Enter New Phone Number : ");
                            phones[i] = sc.nextLine();
                            System.out.print("Enter New Email : ");
                            emails[i] = sc.nextLine();
                            System.out.print("Enter New Category (Family/Friend/Office/College/Others): ");
                            categories[i] = sc.nextLine();
                            System.out.println("Contact Updated Successfully!");
                            updated = true;
                            break;
                        }
                    }
                    if(!updated){
                        System.out.println("Contact Not Found!!");
                    }
                    break;
                case 6:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.print("Enter Name To Delete : ");
                    String deleteName = sc.nextLine();
                    boolean deleted = false;
                    for(int i = 0;i < count;i++){
                        if(names[i].equalsIgnoreCase(deleteName)){
                            for(int j = i;j < count - 1;j++){
                                names[j] = names[j + 1];
                                phones[j] = phones[j + 1];
                                emails[j] = emails[j + 1];
                                categories[j] = categories[j + 1];
                                favourites[j] = favourites[j + 1];
                            }
                            count--;
                            deleted = true;
                            System.out.println("Contact Deleted Successfully!");
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Contact Not Found!!");
                    }
                    break;
                case 7:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    System.out.print("Enter Name To Mark Favourite : ");
                    String favouriteName = sc.nextLine();
                    boolean marked = false;
                    for(int i = 0;i < count;i++){
                        if(names[i].equalsIgnoreCase(favouriteName)){
                            favourites[i] = true;
                            marked = true;
                            System.out.println("Contact Marked As Favourite!");
                            break;
                        }
                    }
                    if(!marked){
                        System.out.println("Contact Not Found!!");
                    }
                    break;
                case 8:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    boolean hasFavourite = false;
                    System.out.println("\n----- FAVOURITE CONTACTS -----");
                    for(int i = 0;i < count;i++){
                        if(favourites[i]){
                            System.out.println("Name : " + names[i]);
                            System.out.println("Phone : " + phones[i]);
                            System.out.println("Email : " + emails[i]);
                            System.out.println("Category : " + categories[i]);
                            System.out.println();
                            hasFavourite = true;
                        }
                    }
                    if(!hasFavourite){
                        System.out.println("No Favourite Contact Found!!");
                    }
                    break;
                case 9:
                    if(count == 0){
                        System.out.println("No Contact Found!!");
                        break;
                    }
                    for(int i = 0;i < count - 1;i++){
                        for(int j = 0;j < count - i - 1;j++){
                            if(names[j].compareToIgnoreCase(names[j + 1]) > 0){
                                String tempName = names[j];
                                names[j] = names[j + 1];
                                names[j + 1] = tempName;
                                String tempPhone = phones[j];
                                phones[j] = phones[j + 1];
                                phones[j + 1] = tempPhone;
                                String tempEmail = emails[j];
                                emails[j] = emails[j + 1];
                                emails[j + 1] = tempEmail;
                                String tempCategory = categories[j];
                                categories[j] = categories[j + 1];
                                categories[j + 1] = tempCategory;
                                boolean tempFavourite = favourites[j];
                                favourites[j] = favourites[j + 1];
                                favourites[j + 1] = tempFavourite;
                            }
                        }
                    }
                    System.out.println("Contacts Sorted Successfully!");
                    break;
                case 10:
                    System.out.println("Thank You For Using Contact Management System!");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
                    break;
            }
        }
        sc.close();
    }
}