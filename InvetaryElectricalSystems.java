import java.util.ArrayList;
import java.util.Scanner;

public class  InvetaryElectricalSystems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] products ={"mobiles","laptops","earphones","bluetooth speakers"};
        String[] specifications = {"6gb ram 128 gb memory snap dragon 888","intel i5,8gb ram,512gb ssd","wired and 3mm spekers","bluetooth earphones"};
        int[] prices = {20000,60000,500,2000};
        int[] count = {20,10,50,100};
        while(true){
            mainMessage();
            int n = sc.nextInt();
            sc.nextLine();
            if(n==1){
                productList(products);
            }
            if(n==2){
                productCount(products,count);
            }
            if(n==3) {
                viewProductDetails(products, specifications, count, prices);
            }
            if(n==4){
                viewProductDetails(products, specifications, count, prices);
                System.out.println("enter which you want to upgrade");
                int index = sc.nextInt();
                sc.nextLine();
                System.out.println("enter the specification to be change");
                String newSpecification = sc.nextLine();
                editProduct(products,specifications,index,newSpecification);


            }
            if(n==5){
                productList(products);
                System.out.println("which you want to increment");
                int IncrementIndex = sc.nextInt();
                sc.nextLine();
                productCount(products,count);
                System.out.println("note:if u want decrement please enter nagitive value");
                System.out.println("enter increment or decrement value");
                int countToBeChanged = sc.nextInt();
                sc.nextLine();
                updateInventory(products,count,IncrementIndex,countToBeChanged);
            }
            System.out.println("press y to continue");
            char ch = sc.nextLine().charAt(0);
            if(ch == 'y'){
                continue;
            }
            else{
                System.exit(0);
            }

        }

    }
    static  void productList(String[] products){
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1+" "+products[i]);


        }
    }
    static void productCount(String[] products,int[]count){
        for(int i=0;i<4;i++){
            System.out.println(i+1+" "+products[i]+" "+count[i]);
        }
    }
    static void viewProductDetails(String[] products, String[] specifications, int[] count, int[]prices){
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1+" category:"+products[i]+" specifications:"+specifications[i]+" products avilaible:"+count[i]+" prices:"+products[i]);
        }
    }
    static void editProduct(String[] products,String[] specification,int incremnetIndex,String change ) {
            specification[incremnetIndex-1] = change;
        System.out.println("the product "+products[incremnetIndex-1]+" specification changed to "+specification[incremnetIndex-1]);


    }

        static void updateInventory(String[]products,int[]count,int incrementIndex,int countt){
        count[incrementIndex-1] = count[incrementIndex-1]+countt;
        System.out.println("after changes product  :"+products[incrementIndex-1]+" have new count :"+count[incrementIndex-1]);
    }

    static void mainMessage(){
        System.out.println("1.Product List");
        System.out.println("2.Product count");
        System.out.println("3.View Product Details");
        System.out.println("4.Edit Product");
        System.out.println("5.Update Inventory");
    }

}