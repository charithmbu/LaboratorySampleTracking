public class Sample{
    private String sampleId;
    private String patientName;
    private String sampleType;
    private String collectionDate;
    private String status;
    public Sample(String sampleId, String patientName, String sampleType, String collectionDate, String status){
        this.sampleId = sampleId;
        this.patientName = patientName;
        this.sampleType = sampleType;
        this.collectionDate = collectionDate;
        this.status = status;
    }
    public String getSampleId(){
        return sampleId;
    }
    public String getPatientName(){
        return patientName;
    }
    public String getSampleType(){
        return sampleType;
    }
    public String getCollectionDate(){
        return collectionDate;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    @Override 
    public String toString(){
        return "Sample Id: " + sampleId + "\nPatient: " + patientName + "\nType: " + sampleType +
        "\nCollection Date: " + collectionDate + 
        "\nStatus: " + status;
    }
}