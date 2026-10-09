import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SampleManager manager = new SampleManager();
        while(true){
            System.out.println("\n==========================Laboratory Sample Tracking System=============================");
            System.out.println("1. Add Sample");
            System.out.println("2. View All Samples");
            System.out.println("3. Search Sample");
            System.out.println("4. Update Sample Status");
            System.out.println("5. Delete Sample");
            System.out.println("6. Exit");
            System.out.print("Enter yours choice: ");
            try{
                int choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1:
                        System.out.print("Enter Sample Id: ");
                        String sampleId = sc.nextLine();
                        System.out.print("Enter Patient Name: ");
                        String patientName = sc.nextLine();
                        System.out.print("Enter Sample Type: ");
                        String sampleType = sc.nextLine();
                        System.out.print("Enter Collection Date: ");
                        String collectionDate = sc.nextLine();
                        System.out.print("Enter Status: ");
                        String status = sc.nextLine();
                        Sample sample = new Sample(sampleId, patientName, sampleType, collectionDate, status);
                        manager.addSample(sample);
                        break;
                    case 2:
                        manager.viewSamples();
                        break;
                    case 3:
                        System.out.print("Enter Sample Id to Search: ");
                        String id = sc.nextLine();
                        manager.searchSample(id);
                        break;
                    case 4:
                        System.out.print("Enter Sample Id: ");
                        String updateId = sc.nextLine();
                        System.out.print("Enter updated Status: ");
                        String updatedStatus = sc.nextLine();
                        manager.updateStatus(updateId, updatedStatus);
                        break;
                    case 5:
                        System.out.print("Enter Sample Ids to Delete: ");
                        String deleteId = sc.nextLine();
                        manager.deleteSample(deleteId);
                        break;
                    case 6:
                        System.out.println("Thanks for Choosing the Laboratory Sample Tracking System!!@!");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid Choice Please Try Again..");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please Enter a Valid Number");
            }
        }
    }
}