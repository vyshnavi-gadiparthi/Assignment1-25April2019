import java.util.ArrayList;
import java.util.Scanner;

class Laptop{
    private Integer id, ramSize, hddSize;
    private String brand;
 
    Laptop(int id, int ramSize, int hddSize, String brand ){
        this.id = id;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.brand = brand;
    }
 
    
    public Integer getId(){
        return this.id;
    }
    public Integer getRamSize(){
        return this.ramSize;
    }
 
    public Integer getHddSize(){
        return this.hddSize;
    }
 
    public String getBrand(){
        return this.brand;
    }



    public void setId(int id){
        this.id = id;
    }
    public void setRamSize(int ramSize){
         this.ramSize = ramSize;
    }
 
    public void setHddSize(int hddSize){
        this.hddSize = hddSize;
    }
 
    public void setBrand(String brand){
        this.brand = brand;
    }

}
class APICollectionDemo{
    static ArrayList list;
    
    public static void main(String[] args) {
        int flag = 0;
        list = new ArrayList();
        APICollectionDemo ob = new APICollectionDemo();
        Laptop l = new Laptop(4, 8, 600, "Lenovo");
        //Store a Laptop object in the list
        list.add(new Laptop(1, 4, 500, "IBM"));
        list.add(new Laptop(2, 8, 800, "Lenovo"));
        list.add(new Laptop(3, 6, 500, "Sony"));

    while(flag == 0){
        System.out.println("Enter your choice to perform operations:");
        System.out.println(" 1. Enter a new laptop details \n 2. View all laptop details \n 3. Search for a Laptop: By (Id, Brand, Ram Size, Hdd Size) \n 4. Delete a Laptop : By(ID) \n 5. Update Laptop Details : \n 6. Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: 
                    ob.addDetails();
                    break;
            case 2: 
                    ob.viewAll();
                    break;
            case 3:
                    ob.search();
                    break;  
            case 4:
                    ob.delete();
                    break;
            case 5:
                    ob.update();
                    break;
            case 6:
                    flag = 1;        
            
        }

    }
}
    public void addDetails(){
        int id, ramSize, hddSize;
        String brand;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter laptop id");
        id = s.nextInt();
        s.nextLine();
        System.out.println("Enter ramsize");
        ramSize = s.nextInt();
        s.nextLine();
        System.out.println("Enter Harddisk size");
        hddSize = s.nextInt();
        s.nextLine();
        System.out.println("Enter brand");
        brand = s.nextLine();
        System.out.println("Details added successfully");
        list.add(new Laptop(id, ramSize, hddSize, brand));
        
    }
    public void viewAll(){
        
        for(Object ob : list){
            //System.out.println(i);
            System.out.println("Laptop Details : ");
            System.out.println("Id is : " + ((Laptop)ob).getId());
            System.out.println("Ram : " + ((Laptop)ob).getRamSize());
            System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
            System.out.println("Brand : " + ((Laptop)ob).getBrand());
            
        }
    }    

    public void search(){
        int id, flag = 0;
        System.out.println("Enter id to search");
        Scanner s = new Scanner(System.in);
        id = s.nextInt();
        for(Object ob : list){
            if(((Laptop)ob).getId().equals(id)){
                System.out.println("Laptop details for that id is ");
                System.out.println("Id is : " + ((Laptop)ob).getId());
                System.out.println("Ram : " + ((Laptop)ob).getRamSize());
                System.out.println("HDD Size : " + ((Laptop)ob).getHddSize());
                System.out.println("Brand : " + ((Laptop)ob).getBrand());
                flag = 1;
            }
        }    
            if(flag == 0){
                System.out.println("Laptop doesnot exist with the given id");
            }
      
      
    }

    public void delete(){
        int id, flag = 0;
        System.out.println("Enter id to delete");
        Scanner s = new Scanner(System.in);
        id = s.nextInt();
        for(Object ob :list){
            if(((Laptop)ob).getId().equals(id)){
                list.remove(ob);
                System.out.println("It was deleted");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Laptop doesnot exist on the given id");
        }    


    }
    public void update(){
        int id, flag = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the id that to be update");
        id = s.nextInt();
        
        System.out.println("Enter your choice to Update:");
        System.out.println(" 1. Id 2. Ram Size 3. HardDiskSize 4. Brand  5. Exit");
                
        int choice = s.nextInt();
        Object ob = null;
        for(Object obj :list){
            if(((Laptop)obj).getId().equals(id)){
                ob = obj;
                break;
                flag = 1;
            }
        }if(flag == 1)
        switch(choice)
        {
            case 1: 

                System.out.println("Enter id that to be updated");
                int id1 = s.nextInt();
                s.nextLine();
                for(Object obj :list){
                    if(((Laptop)obj).getId().equals(id)){
                        System.out.println("Id already exists");
                    }
                    else{
                    ((Laptop)ob).setId(id1);
                    }
                    break;
                }    

            case 2: 

                System.out.println("Enter RamSize that to be updated");
                int ramsize = s.nextInt();
                s.nextLine();
                ((Laptop)ob).setRamSize(ramsize);
                break; 

            case 3: 

                System.out.println("Enter HardDisk Size that to be updated");
                int hddsize = s.nextInt();
                s.nextLine();
                ((Laptop)ob).setHddSize(hddsize);
                break;
                
            case 4: 

                System.out.println("Enter brand that to be updated");
                String brand = s.nextLine();
                ((Laptop)ob).setBrand(brand);
                break;  

            case 5:
               flag = 0;             
        }
             
    }       
}
