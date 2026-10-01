package disease;

import util.Patient;
import util.SevereLevel;

import java.util.ArrayList;

public class Hospital {
    // attributes
    private ArrayList<Patient> patients ;

    // constructors
    public Hospital() {
        // define empty ArrayList
        patients = new ArrayList<Patient>() ;
    }

    // getter - setter
    public ArrayList<Patient> getPatients() {
        return patients;
    }
    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    // methods
    public void admit(String firstName , String lastname , String id , String disease, boolean isVaccinated) {
        // check type of disease
        if (disease.equals("Hypopnea")) {
            // add patient with Hypopnea
            Patient newPatient = new Patient(firstName , lastname , id , new Hypopnea() , isVaccinated) ;
            patients.add( newPatient ) ;
        }
        else if (disease.equals("Covid19")) {
            // add patient with Covid-19
            Patient newPatient = new Patient(firstName , lastname , id , new Covid19() , isVaccinated) ;
            patients.add( newPatient ) ;
        }
        else if (disease.equals("Delta")) {
            // add patient with Delta
            Patient newPatient = new Patient(firstName , lastname , id , new Delta() , isVaccinated) ;
            patients.add( newPatient ) ;
        }
    }
    public ArrayList<Patient> getCovidPatients(SevereLevel s) {
        // This method return ArrayList of patient with Covid19 containing severeLevel s

        // define new ArrayList
        ArrayList<Patient> targetedSevereLevelCovidPatients = new ArrayList<Patient>() ;
        // loop then check severeLevel
        for (int pos = 0 ; pos < patients.size() ; pos++) {
            Patient eachPatient = patients.get(pos) ;
            if (eachPatient.getSevereLevel().equals(s)) {
                if (eachPatient.getDisease() instanceof Covid19) // check if is class of Covid19
                    targetedSevereLevelCovidPatients.add(eachPatient) ;
            }
        }
        return targetedSevereLevelCovidPatients;
    }
}
