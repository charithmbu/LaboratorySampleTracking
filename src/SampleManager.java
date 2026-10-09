import java.util.ArrayList;
public class SampleManager{
    private ArrayList<Sample> samples;
    public SampleManager(){
        samples = new ArrayList<>();
    }
    public void addSample(Sample sample){
        for(Sample s: samples){
            if(s.getSampleId().equalsIgnoreCase(sample.getSampleId())){
                System.out.println("Sample already Exists");
                return;
            }
        }
        samples.add(sample);
        System.out.println("Sample added Successfully");
    }
    public void viewSamples(){
        if(samples.isEmpty()){
            System.out.println("The samples is empty. Please add!!");
            return;
        }
        for(Sample sample: samples){
            System.out.println("-------------------------------------------------");
            System.out.println(sample);
        }
        System.out.println("-------------------------------------------");
    }
    public void searchSample(String sampleId){
        for(Sample sample: samples){
            if(sample.getSampleId().equalsIgnoreCase(sampleId)){
                System.out.println("----------------------------------------------");
                System.out.println(sample);
                System.out.println("-----------------------------------------------");
                return;
            }
        }
        System.out.println("Sample Id Not Found");
    }
    public void updateStatus(String sampleId, String newStatus){
        for(Sample sample: samples){
            if(sample.getSampleId().equalsIgnoreCase(sampleId)){
                sample.setStatus(newStatus);
                System.out.println("Sample Status Updated Successfully");
                return;
            }
        }
        System.out.println("Sample not found in the Samples");
    }
    public void deleteSample(String sampleId){
        for(Sample sample: samples){
            if(sample.getSampleId().equalsIgnoreCase(sampleId)){
                samples.remove(sample);
                System.out.println("Sample deleted Successfully");
                return;
            }
        }
        System.out.println("Sample not found");
    }
}