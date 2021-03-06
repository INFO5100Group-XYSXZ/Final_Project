/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Location.LocationPoint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * @author zhaoxi
 */
public class AnimalRecord extends WorkRequest{
    
    private AnimalReportingRequest reportingRequest;
    private VolunteerRequest volunteerRequest;
    private HospitalRequest hospitalRequest;
    private VetRequest vetRequest;
    private ShelterRequest shelterRequest;
    private AdopterAdoptionRequest adopterAdoptionRequest;
    private PetOwnerAdoptionRequest petOwnerAdoptionRequest;
            
    private LocationPoint locationP;
    private String petName;
    private String breed;
    private String sex;
    private String age;
    private List<String> medicalRecord;
    private String imagePath;
    private String ID;
    private String id;
    private Random random = new Random();
    private boolean adopted;
    private boolean addedAhead;
    
    public AnimalRecord() {
        this.reportingRequest = new AnimalReportingRequest();
        this.volunteerRequest = new VolunteerRequest();
        this.hospitalRequest = new HospitalRequest();
        this.vetRequest = new VetRequest();
        this.shelterRequest = new ShelterRequest();
        //this.shelterStaffRequest = new ShelterStaffRequest();
        this.locationP = new LocationPoint();
        this.medicalRecord = new ArrayList<>();
        id = String.format("%04d",random.nextInt(10000));
        ID = "A" + id;
        this.adopted = false;
        this.addedAhead = false;
    }

    public boolean isAddedAhead() {
        return addedAhead;
    }

    public void setAddedAhead(boolean addedAhead) {
        this.addedAhead = addedAhead;
    }
    
    

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public AdopterAdoptionRequest getAdopterAdoptionRequest() {
        return adopterAdoptionRequest;
    }

    public void setAdopterAdoptionRequest(AdopterAdoptionRequest adopterAdoptionRequest) {
        this.adopterAdoptionRequest = adopterAdoptionRequest;
    }

    public PetOwnerAdoptionRequest getPetOwnerAdoptionRequest() {
        return petOwnerAdoptionRequest;
    }

    public void setPetOwnerAdoptionRequest(PetOwnerAdoptionRequest petOwnerAdoptionRequest) {
        this.petOwnerAdoptionRequest = petOwnerAdoptionRequest;
    }
            
    
    public VolunteerRequest getVolunteerRequest() {
        return volunteerRequest;
    }

    public void setVolunteerRequest(VolunteerRequest volunteerRequest) {
        this.volunteerRequest = volunteerRequest;
    }

    public HospitalRequest getHospitalRequest() {
        return hospitalRequest;
    }

    public void setHospitalRequest(HospitalRequest hospitalRequest) {
        this.hospitalRequest = hospitalRequest;
    }

    public VetRequest getVetRequest() {
        return vetRequest;
    }

    public void setVetRequest(VetRequest vetRequest) {
        this.vetRequest = vetRequest;
    }

    public ShelterRequest getShelterRequest() {
        return shelterRequest;
    }

    public void setShelterRequest(ShelterRequest shelterRequest) {
        this.shelterRequest = shelterRequest;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public List<String> getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(List<String> healthCondition) {
        this.medicalRecord = healthCondition;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LocationPoint getLocationP() {
        return locationP;
    }

    public void setLocationP(LocationPoint locationP) {
        this.locationP = locationP;
    }

    public AnimalReportingRequest getReportingRequest() {
        return reportingRequest;
    }

    public void setReportingRequest(AnimalReportingRequest reportingRequest) {
        this.reportingRequest = reportingRequest;
    }

    public String getID() {
        return ID;
    }
    
    @Override
    public String toString() {
       return ID;   
    }
    
    public void addMedicalRecord(String string){
        Date time = new Date();
        string = time + " " + string;
        medicalRecord.add(string);
    }
}
