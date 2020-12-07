/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Random;

/**
 *
 * @author zhaoxi
 */
public class PetOwnerAdoptionRequest extends WorkRequest{
    
    private PetOwnerRegistrationRequest petOwner;
    private AnimalRecord animal;
    private String ID;
    private Random random;
    private String id;
    private boolean approved;

    public PetOwnerAdoptionRequest() {
        id = String.format("%04d", random.nextInt(10000));
        ID = "R" + id ;
        this.approved = false;
    }

    public String getID() {
        return ID;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved() {
        this.approved = true;
    }

    public PetOwnerRegistrationRequest setAdopter() {
        return petOwner;
    }

    public void setAdopter(PetOwnerRegistrationRequest petOwner) {
        this.petOwner = petOwner;
    }

    public AnimalRecord getAnimal() {
        return animal;
    }

    public void setAnimal(AnimalRecord animal) {
        this.animal = animal;
    }
    
    @Override
    public String toString(){
        return ID;
    }
    
}
