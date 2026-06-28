import java.util.Scanner;
public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productId[] = new int[100];
        String productName[] = new String[100];
        double productPrice[] = new double[100];
        int productQuantity[] = new int[100];
        int size = 0;
        int choice = -1;

        while(choice != 10){
            System.out.println("\n========== INVENTORY MANAGEMENT ==========");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Check Stock");
            System.out.println("7. Restock Product");
            System.out.println("8. Sell Product");
            System.out.println("9. Total Inventory Value");
            System.out.println("10. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice){
                case 1://add product.
                    if(size == productId.length){
                        System.out.println("Inventory is full.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    productId[size] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Product Name : ");
                    productName[size] = sc.nextLine();
                    System.out.print("Enter Product Price : ");
                    productPrice[size] = sc.nextDouble();
                    System.out.print("Enter Product Quantity : ");
                    productQuantity[size] = sc.nextInt();
                    size++;
                    System.out.println("Product added successfully.");
                    break;
                case 2://view products.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                    }else{
                        System.out.println("\nID\tName\t\tPrice\tQuantity");
                        for(int i = 0; i < size; i++){
                            System.out.println(productId[i]+"\t"+productName[i]+"\t\t"+productPrice[i]+"\t"+productQuantity[i]);
                        }
                    }
                    break;
                case 3://search product.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for(int i = 0; i < size; i++){
                        if(productId[i] == id){
                            System.out.println("Product Found");
                            System.out.println("Name : " + productName[i]);
                            System.out.println("Price : " + productPrice[i]);
                            System.out.println("Quantity : " + productQuantity[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Product not found.");
                    }
                    break;
                case 4://update product.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();
                    found = false;
                    for(int i = 0; i < size; i++){
                        if(productId[i] == id){
                            sc.nextLine();
                            System.out.print("Enter New Product Name : ");
                            productName[i] = sc.nextLine();
                            System.out.print("Enter New Product Price : ");
                            productPrice[i] = sc.nextDouble();
                            System.out.print("Enter New Product Quantity : ");
                            productQuantity[i] = sc.nextInt();
                            System.out.println("Product updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Product not found.");
                    }
                    break;
                case 5://delete product.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();
                    int pos = -1;
                    for(int i = 0; i < size; i++){
                        if(productId[i] == id){
                            pos = i;
                            break;
                        }
                    }
                    if(pos == -1){
                        System.out.println("Product not found.");
                    }else{
                        for(int i = pos; i < size - 1; i++){
                            productId[i] = productId[i + 1];
                            productName[i] = productName[i + 1];
                            productPrice[i] = productPrice[i + 1];
                            productQuantity[i] = productQuantity[i + 1];
                        }
                        size--;
                        System.out.println("Product deleted successfully.");
                    }
                    break;
                case 6://check stock.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();
                    found = false;
                    for(int i = 0; i < size; i++){
                        if(productId[i] == id){
                            System.out.println("Product Name : " + productName[i]);
                            System.out.println("Available Stock : " + productQuantity[i]);
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Product not found.");
                    }
                    break;
                case 7://restock product.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();
                    found = false;
                    for(int i = 0; i < size; i++){
                        if(productId[i] == id){
                            System.out.print("Enter Quantity to Add : ");
                            int quantity = sc.nextInt();
                            productQuantity[i] += quantity;
                            System.out.println("Stock updated successfully.");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Product not found.");
                    }
                    break;    
               case 8://sell product.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    System.out.print("Enter Product ID : ");
                    id = sc.nextInt();
                    found = false;
                    for(int i = 0; i < size; i++){
                        if(productId[i] == id){
                            System.out.print("Enter Quantity to Sell : ");
                            int quantity = sc.nextInt();
                            if(quantity <= productQuantity[i]){
                                productQuantity[i] -= quantity;
                                System.out.println("Product sold successfully.");
                            }else{
                                System.out.println("Insufficient stock.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Product not found.");
                    }
                    break;
                case 9://total inventory value.
                    if(size == 0){
                        System.out.println("Inventory is empty.");
                        break;
                    }
                    double totalValue = 0;
                    for(int i = 0; i < size; i++){
                        totalValue += productPrice[i] * productQuantity[i];
                    }
                    System.out.println("Total Inventory Value = " + totalValue);
                    break;
                case 10://exit.
                    System.out.println("Exiting... Thank You!");
                    break;
                default://invalid choice.
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}